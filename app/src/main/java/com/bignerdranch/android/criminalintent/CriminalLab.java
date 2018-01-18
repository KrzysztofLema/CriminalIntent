package com.bignerdranch.android.criminalintent;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by krzyszof on 16.01.18.
 */

public class CriminalLab {
    private static CriminalLab sCriminalLab;
    private List<Crime> mCrimes;
    public static CriminalLab get(Context context){
        if (sCriminalLab == null){
            sCriminalLab = new CriminalLab(context);
        }return sCriminalLab;
    }
    private CriminalLab(Context context){
        mCrimes = new ArrayList<>();

    }
    public void addCrime(Crime c){
        mCrimes.add(c);
    }
    public List<Crime>getCrimes(){
        return mCrimes;
    }
    public Crime getCrime(UUID id){
        for (Crime crime : mCrimes) {
            if (crime.getId().equals(id)){
                return crime;
            }
        }return null;
    }

}
