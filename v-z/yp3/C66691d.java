package yp3;

import com.tencent.xweb.file.XVFSFile;

/* renamed from: yp3.d */
public class C66691d {
    public String toString() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace == null || stackTrace.length < 4) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 3; i < stackTrace.length; i++) {
            if (stackTrace[i].getClassName().contains("com.tencent.mm") && !stackTrace[i].getClassName().contains("sdk.platformtools.Log")) {
                sb.append("[");
                sb.append(stackTrace[i].getClassName().substring(15));
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(stackTrace[i].getMethodName());
                sb.append("(" + stackTrace[i].getLineNumber() + ")]");
            }
        }
        return sb.toString();
    }
}
