import assessments.AssessmentFeed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Administrator {
    String studentName;
    String studentCID;
    String studentType;
    String AssessmentName;
    String subAssessmentName;
    String studentTitle;
    Double Mark;
    String name;
    String cid;
    public static List<String> getCIDs() {
        List<String> result = new ArrayList<>();
       for (int i=0;i<result.size();i++) {
           result.add(result(i));
       }
       return result;
       }
    }

    public static String getStudentName(String name) { this.name=name; return name;}


    public static String getStudentType(String type) { return student(cid).type; }


    public static double getResult(String cid, String assessmentName,
                                   String subAssessmentName) {
        AssessmentFeed.AssessmentData a = assessment(cid, assessmentName);
        switch (a.type) {
            case PROGRAMMING_TEST:
                if (PROGRAM_MARK.equals(subAssessmentName)) return a.first;
                if (EXPLAINED_SUCCESSFULLY.equals(subAssessmentName)) return a.second;
                break;
            case AI_PROJECT:
                if (FUNCTIONALITY_MARK.equals(subAssessmentName)) return a.first;
                if (VERIFICATION_MARK.equals(subAssessmentName)) return a.second;
                break;
            case DESIGN_VIVA:
                if (DESIGN_MARK.equals(subAssessmentName)) return a.first;
                if (EXPLANATION_MARK.equals(subAssessmentName)) return a.second;
                break;
            default:
                throw new IllegalStateException("Unknown assessment type: " + a.type);
        }
        throw new IllegalArgumentException("Unknown or invalid sub-assessment '"
                + subAssessmentName + "' for assessment '" + assessmentName + "'");
    }

    private static AssessmentFeed.StudentData student(String cid) {
        for (AssessmentFeed.StudentData s : STUDENTS) if (s.cid.equals(cid)) return s;
        throw new IllegalArgumentException("Unknown CID: " + cid);
    }

    private static AssessmentFeed.AssessmentData assessment(String cid, String title) {
        for (AssessmentFeed.AssessmentData a : student(cid).assessments)
            if (a.title.equals(title)) return a;
        throw new IllegalArgumentException(
                "Unknown assessment title '" + title + "' for CID " + cid);
    }

    private static void addStudent(String cid, String name, String type) {
        STUDENTS.add(new AssessmentFeed.StudentData(cid, name, type));
    }

    private static void add(String cid, String title, String type,
                            double first, double second) {
        add(cid, title, type, first, second, 0);
    }

    private static void add(String cid, String title, String type,
                            double first, double second, double third) {
        student(cid).assessments.add(new AssessmentFeed.AssessmentData(title, type, first, second, third));
    }

    private static final class StudentData {
        final String cid, name, type;
        final List<AssessmentFeed.AssessmentData> assessments = new ArrayList<>();
        StudentData(String cid, String name, String type) {
            this.cid = cid; this.name = name; this.type = type;
        }
    }

}
