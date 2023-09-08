package pl1;

import gy3.C8480h;
import gy3.C87412m;
import te3.C49192du3;
import te3.C51765w03;
import up1.C27696y;

/* renamed from: pl1.d0 */
public final class C11977d0 extends C11976a {

    /* renamed from: e */
    public final String f34933e;

    /* renamed from: f */
    public final String f34934f;

    /* renamed from: g */
    public final boolean f34935g;

    /* renamed from: h */
    public final boolean f34936h;

    /* renamed from: i */
    public final C51765w03 f34937i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11977d0(String str, String str2, String str3, boolean z, boolean z2, C51765w03 w032, int i, C8480h hVar) {
        this(str, str2, str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : w032);
    }

    /* renamed from: b */
    public String mo11841b() {
        String str;
        String str2;
        if (this.f34937i == null || this.f34935g) {
            return this.f34934f + '_' + getMediaType();
        }
        String str3 = "";
        if (this.f34936h) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f34934f);
            sb.append('_');
            sb.append(getMediaType());
            sb.append('_');
            String str4 = this.f34937i.f143798d;
            if (str4 == null) {
                str4 = str3;
            }
            sb.append(str4);
            sb.append('_');
            C49192du3 du32 = this.f34937i.f143800f;
            if (!(du32 == null || (str2 = du32.f132537e) == null)) {
                str3 = str2;
            }
            sb.append(str3);
            return sb.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f34934f);
        sb4.append('_');
        sb4.append(getMediaType());
        sb4.append('_');
        String str5 = this.f34937i.f143798d;
        if (str5 == null) {
            str5 = str3;
        }
        sb4.append(str5);
        sb4.append('_');
        C49192du3 du33 = this.f34937i.f143799e;
        if (!(du33 == null || (str = du33.f132537e) == null)) {
            str3 = str;
        }
        sb4.append(str3);
        return sb4.toString();
    }

    public String getDecodeKey() {
        return "";
    }

    public C27696y getMediaType() {
        return this.f34935g ? C27696y.PREVIEW_PAG : this.f34936h ? C27696y.LANDSCAPE_PAG : C27696y.FULL_PAG;
    }

    public String getPath() {
        return "";
    }

    public String getThumbUrl() {
        return this.f34933e;
    }

    public String getThumbUrlToken() {
        return "";
    }

    public String getUrl() {
        return this.f34933e;
    }

    public String getUrlToken() {
        return "";
    }

    public C11977d0(String str, String str2, String str3, boolean z, boolean z2, C51765w03 w032) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str2, "id");
        C87412m.m108594g(str3, "name");
        this.f34933e = str;
        this.f34934f = str2;
        this.f34935g = z;
        this.f34936h = z2;
        this.f34937i = w032;
    }
}
