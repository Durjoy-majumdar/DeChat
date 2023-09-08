package hv3;

import java.io.Serializable;

/* renamed from: hv3.a */
public class C87598a implements Serializable {

    /* renamed from: d */
    public boolean f253683d;

    /* renamed from: e */
    public String f253684e;

    /* renamed from: f */
    public long f253685f;

    /* renamed from: g */
    public long f253686g;

    /* renamed from: h */
    public boolean f253687h;

    /* renamed from: i */
    public Throwable f253688i;

    /* renamed from: j */
    public String f253689j;

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\nPatchResult: \n");
        stringBuffer.append("isSuccess:" + this.f253683d + "\n");
        stringBuffer.append("rawPatchFilePath:" + this.f253684e + "\n");
        stringBuffer.append("costTime:" + this.f253685f + "\n");
        stringBuffer.append("dexoptTriggerTime:" + this.f253686g + "\n");
        stringBuffer.append("isOatGenerated:" + this.f253687h + "\n");
        if (this.f253689j != null) {
            stringBuffer.append("patchVersion:" + this.f253689j + "\n");
        }
        if (this.f253688i != null) {
            stringBuffer.append("Throwable:" + this.f253688i.getMessage() + "\n");
        }
        return stringBuffer.toString();
    }
}
