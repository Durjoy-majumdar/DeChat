package com.google.android.gms.common.util;

import android.os.Binder;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

public class ProcessUtils {
    private static String zzaai;
    private static int zzaaj;

    public static class SystemGroupsNotAvailableException extends Exception {
        public SystemGroupsNotAvailableException(String str) {
            super(str);
        }

        public SystemGroupsNotAvailableException(String str, Throwable th) {
            super(str, th);
        }
    }

    private ProcessUtils() {
    }

    public static String getCallingProcessName() {
        int callingPid = Binder.getCallingPid();
        return callingPid == zzde() ? getMyProcessName() : zzl(callingPid);
    }

    public static String getMyProcessName() {
        if (zzaai == null) {
            zzaai = zzl(zzde());
        }
        return zzaai;
    }

    public static boolean hasSystemGroups() {
        try {
            int zzde = zzde();
            StringBuilder sb = new StringBuilder(24);
            sb.append("/proc/");
            sb.append(zzde);
            sb.append("/status");
            BufferedReader zzm = zzm(sb.toString());
            boolean zzk = zzk(zzm);
            IOUtils.closeQuietly((Closeable) zzm);
            return zzk;
        } catch (IOException e) {
            throw new SystemGroupsNotAvailableException("Unable to access /proc/pid/status.", e);
        } catch (Throwable th) {
            IOUtils.closeQuietly((Closeable) null);
            throw th;
        }
    }

    private static int zzde() {
        if (zzaaj == 0) {
            zzaaj = Process.myPid();
        }
        return zzaaj;
    }

    private static boolean zzk(BufferedReader bufferedReader) {
        String trim;
        do {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                trim = readLine.trim();
            } else {
                throw new SystemGroupsNotAvailableException("Missing Groups entry from proc/pid/status.");
            }
        } while (!trim.startsWith("Groups:"));
        for (String parseLong : trim.substring(7).trim().split("\\s", -1)) {
            try {
                long parseLong2 = Long.parseLong(parseLong);
                if (parseLong2 >= 1000 && parseLong2 < 2000) {
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    private static String zzl(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        String str = null;
        if (i <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            bufferedReader = zzm(sb.toString());
            try {
                str = bufferedReader.readLine().trim();
            } catch (IOException unused) {
            } catch (Throwable th4) {
                th = th4;
                IOUtils.closeQuietly((Closeable) bufferedReader);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
            IOUtils.closeQuietly((Closeable) bufferedReader);
            throw th;
        }
        IOUtils.closeQuietly((Closeable) bufferedReader);
        return str;
    }

    private static BufferedReader zzm(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
