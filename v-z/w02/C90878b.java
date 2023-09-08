package w02;

import java.io.Serializable;

/* renamed from: w02.b */
public class C90878b implements Serializable {

    /* renamed from: d */
    public boolean f260855d;

    /* renamed from: e */
    public int f260856e;

    /* renamed from: f */
    public boolean f260857f;

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\nMMDIffPatchResult: \n");
        stringBuffer.append("isMMMergeSuccess:" + this.f260855d + "\n");
        stringBuffer.append("code:" + this.f260856e + "\n");
        stringBuffer.append("isAuto:" + this.f260857f + "\n");
        return stringBuffer.toString();
    }
}
