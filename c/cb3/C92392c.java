package cb3;

import android.view.View;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;

/* renamed from: cb3.c */
public class C92392c {

    /* renamed from: a */
    public WXRTEditText f264393a;

    /* renamed from: b */
    public WXRTEditText f264394b;

    /* renamed from: c */
    public WXRTEditText f264395c;

    /* renamed from: d */
    public WXRTEditText f264396d;

    /* renamed from: e */
    public int f264397e;

    /* renamed from: f */
    public View f264398f;

    public C92392c() {
        this.f264393a = null;
        this.f264394b = null;
        this.f264395c = null;
        this.f264396d = null;
        this.f264397e = 0;
        this.f264398f = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NoteRTEInfo{rteBody=");
        WXRTEditText wXRTEditText = this.f264393a;
        Integer num = null;
        sb.append(wXRTEditText != null ? Integer.valueOf(wXRTEditText.hashCode()) : null);
        sb.append(", rtePre=");
        WXRTEditText wXRTEditText2 = this.f264394b;
        sb.append(wXRTEditText2 != null ? Integer.valueOf(wXRTEditText2.hashCode()) : null);
        sb.append(", rteNext=");
        WXRTEditText wXRTEditText3 = this.f264395c;
        sb.append(wXRTEditText3 != null ? Integer.valueOf(wXRTEditText3.hashCode()) : null);
        sb.append(", rteInterval=");
        WXRTEditText wXRTEditText4 = this.f264396d;
        if (wXRTEditText4 != null) {
            num = Integer.valueOf(wXRTEditText4.hashCode());
        }
        sb.append(num);
        sb.append('}');
        return sb.toString();
    }

    public C92392c(WXRTEditText wXRTEditText) {
        this.f264394b = null;
        this.f264395c = null;
        this.f264396d = null;
        this.f264397e = 0;
        this.f264398f = null;
        this.f264393a = wXRTEditText;
    }

    public C92392c(WXRTEditText wXRTEditText, WXRTEditText wXRTEditText2) {
        this.f264393a = null;
        this.f264396d = null;
        this.f264397e = 0;
        this.f264398f = null;
        this.f264394b = wXRTEditText;
        this.f264395c = wXRTEditText2;
    }
}
