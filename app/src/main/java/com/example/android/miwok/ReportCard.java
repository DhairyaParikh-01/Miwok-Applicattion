package com.example.android.miwok;

public class ReportCard {

    private int StudentId ;
    private  String StudentName;
    private  int ComputerScienceGrade;
    private  int MathsGrade;
    private  int ScienceGrade;
    private  int EnglishGrade;

    //Settter methods for setting Grades for different subjects

    public void setStudentId(int mStudentId)
    {
        ComputerScienceGrade = mStudentId;
    }

    public void setStudentName(int mStudentName)
    {
        ComputerScienceGrade = mStudentName;
    }

    public void setComputerScienceGrade(int mComputerScienceGrade)
    {
        ComputerScienceGrade = mComputerScienceGrade;
    }

    public void setMathseGrade(int mMathsGrade)
    {
        ComputerScienceGrade = mMathsGrade;
    }

    public void setScienceGrade(int mScienceGrade)
    {
        ComputerScienceGrade = mScienceGrade;
    }

    public void setEnglishGrade(int mEnglishGrade)
    {
        ComputerScienceGrade = mEnglishGrade;
    }


    //Getter Methods for accessing the grades and name of students and student id.
    public int getStudentId()
    {
        return StudentId;
    }

    public String getStudentName()
    {
       return StudentName;
    }


    public int getComputerScienceGrade()
    {
        return ComputerScienceGrade;
    }

    public int getMathsGrade()
    {
        return MathsGrade;
    }

    public int getScienceGrade()
    {
        return ScienceGrade;
    }

    public int getEnglishGrade()
    {
        return EnglishGrade;
    }


    //Constructor for ReportCard Class
    public  ReportCard(int  mStudentId, String mStudentName, int mComputerScienceGrade, int mMathsGrade, int mScienceGrade, int mEnglishGrade)
    {
        StudentId = mStudentId;
        StudentName = mStudentName;
        ComputerScienceGrade = mComputerScienceGrade;
        MathsGrade = mMathsGrade;
        ScienceGrade = mScienceGrade;
        EnglishGrade = mEnglishGrade;
    }

    //toString() for ReportCard class.

    @Override
    public String toString()
    {
        return "StudentId:" + StudentId +"Student's name:" + StudentName +"CS grade(%):" + ComputerScienceGrade + "Maths grade(%):" + MathsGrade + "Science grade(%):" + ScienceGrade + "English grade(%):" + EnglishGrade;
    }



}
