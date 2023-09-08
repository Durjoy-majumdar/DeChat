package cc3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import sm2.C101650a;

/* renamed from: cc3.d */
public class C26835d extends C101650a {

    /* renamed from: f */
    public String f74635f = "";

    /* renamed from: g */
    public int f74636g;

    /* renamed from: h */
    public String f74637h = "";

    /* renamed from: i */
    public String f74638i = "";

    /* renamed from: j */
    public String f74639j = "";

    /* renamed from: k */
    public String f74640k = "";

    /* renamed from: l */
    public int f74641l;

    /* renamed from: m */
    public int f74642m;

    /* renamed from: n */
    public String f74643n = "";

    /* renamed from: o */
    public String f74644o = "";

    public C26835d() {
        this.f297564a = C26836e.class;
    }

    /* renamed from: A */
    public String mo53864A() {
        return this.f74640k;
    }

    /* renamed from: B */
    public String mo53865B() {
        return this.f74635f;
    }

    /* renamed from: C */
    public String mo53866C() {
        return this.f74643n;
    }

    /* renamed from: D */
    public String mo53867D() {
        return this.f74638i;
    }

    /* renamed from: E */
    public int mo53868E() {
        return this.f74636g;
    }

    /* renamed from: F */
    public int mo53869F() {
        return this.f74642m;
    }

    /* renamed from: G */
    public String mo53870G() {
        return this.f74637h;
    }

    /* renamed from: H */
    public int mo53871H() {
        return this.f74641l;
    }

    /* renamed from: I */
    public String mo53872I() {
        return this.f74644o;
    }

    /* renamed from: J */
    public String mo53873J() {
        return this.f74639j;
    }

    /* renamed from: K */
    public void mo53874K(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f74640k = str;
    }

    /* renamed from: L */
    public void mo53875L(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f74635f = str;
    }

    /* renamed from: M */
    public void mo53876M(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f74643n = str;
    }

    /* renamed from: N */
    public void mo53877N(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f74638i = str;
    }

    /* renamed from: O */
    public void mo53878O(int i) {
        this.f74636g = i;
    }

    /* renamed from: P */
    public void mo53879P(int i) {
        this.f74642m = i;
    }

    /* renamed from: Q */
    public void mo53880Q(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f74637h = str;
    }

    /* renamed from: R */
    public void mo53881R(int i) {
        this.f74641l = i;
    }

    /* renamed from: S */
    public void mo53882S(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f74644o = str;
    }

    /* renamed from: T */
    public void mo53883T(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f74639j = str;
    }

    /* renamed from: a */
    public boolean mo53884a(String str, Object obj, boolean z) {
        C87412m.m108594g(str, "fieldSerializeName");
        if (C87412m.m108589b(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            return false;
        }
        return super.mo53884a(str, obj, z);
    }
}
