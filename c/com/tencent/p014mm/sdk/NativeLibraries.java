package com.tencent.p014mm.sdk;

import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C45114t1;
import java.io.BufferedReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.tencent.mm.sdk.NativeLibraries */
public class NativeLibraries {
    private static final String TAG = "MicroMsg.NativeLibraries";

    public static Set list() {
        try {
            HashSet hashSet = new HashSet();
            BufferedReader bufferedReader = new BufferedReader(new C45114t1("/proc/" + Process.myPid() + "/maps"));
            Log.m105924i(TAG, "Dump NativeLibrares:");
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (readLine.endsWith(".so")) {
                    hashSet.add(readLine.substring(readLine.lastIndexOf(" ") + 1));
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Log.m105924i(TAG, "" + ((String) it.next()));
            }
            return hashSet;
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "", new Object[0]);
            return null;
        }
    }
}
