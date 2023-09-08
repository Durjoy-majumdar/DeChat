package com.tencent.p014mm.mj_template.report;

import android.content.Intent;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderPageExposeStruct;
import com.tencent.p014mm.mj_template.api.MaasAlbumMultiTemplateRequestParams;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import eb0.C75592q0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.math.BigInteger;
import kotlin.Metadata;
import org.json.JSONObject;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64726td1;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/mj_template/report/MaasPageFinderReporter;", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onResume", "onPause", "", "sessionId", "", "currentCommentScene", "eid", "Landroid/content/Intent;", "intent", "<init>", "(Ljava/lang/String;ILjava/lang/String;Landroid/content/Intent;)V", "plugin-mj-template_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.mj_template.report.MaasPageFinderReporter */
public final class MaasPageFinderReporter implements C0124r {

    /* renamed from: d */
    public final String f10367d;

    /* renamed from: e */
    public final int f10368e;

    /* renamed from: f */
    public final String f10369f;

    /* renamed from: g */
    public final C13601g f10370g;

    /* renamed from: h */
    public final C13601g f10371h;

    /* renamed from: i */
    public final C13601g f10372i;

    /* renamed from: j */
    public final C13601g f10373j;

    /* renamed from: n */
    public final C13601g f10374n;

    /* renamed from: o */
    public JSONObject f10375o;

    /* renamed from: p */
    public long f10376p;

    /* renamed from: q */
    public final C13601g f10377q;

    /* renamed from: r */
    public String f10378r;

    /* renamed from: com.tencent.mm.mj_template.report.MaasPageFinderReporter$a */
    public static final class C1280a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ Intent f10379d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1280a(Intent intent) {
            super(0);
            this.f10379d = intent;
        }

        public Object invoke() {
            String stringExtra = this.f10379d.getStringExtra("key_click_tab_context_id");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.report.MaasPageFinderReporter$b */
    public static final class C1281b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ Intent f10380d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1281b(Intent intent) {
            super(0);
            this.f10380d = intent;
        }

        public Object invoke() {
            String stringExtra = this.f10380d.getStringExtra("key_finder_context_id");
            if (stringExtra != null) {
                return stringExtra;
            }
            String stringExtra2 = this.f10380d.getStringExtra("key_context_id");
            return stringExtra2 == null ? "" : stringExtra2;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.report.MaasPageFinderReporter$c */
    public static final class C1282c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ Intent f10381d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1282c(Intent intent) {
            super(0);
            this.f10381d = intent;
        }

        public Object invoke() {
            return Integer.valueOf(this.f10381d.getIntExtra("key_from_comment_scene", 0));
        }
    }

    /* renamed from: com.tencent.mm.mj_template.report.MaasPageFinderReporter$d */
    public static final class C1283d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ Intent f10382d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1283d(Intent intent) {
            super(0);
            this.f10382d = intent;
        }

        public Object invoke() {
            String stringExtra = this.f10382d.getStringExtra("key_jump_id");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.report.MaasPageFinderReporter$e */
    public static final class C1284e extends C87413o implements C32224a<MaasAlbumMultiTemplateRequestParams> {

        /* renamed from: d */
        public final /* synthetic */ Intent f10383d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1284e(Intent intent) {
            super(0);
            this.f10383d = intent;
        }

        public Object invoke() {
            return (MaasAlbumMultiTemplateRequestParams) this.f10383d.getParcelableExtra("request_params");
        }
    }

    /* renamed from: com.tencent.mm.mj_template.report.MaasPageFinderReporter$f */
    public static final class C1285f extends C87413o implements C32224a<C64726td1> {

        /* renamed from: d */
        public final /* synthetic */ Intent f10384d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1285f(Intent intent) {
            super(0);
            this.f10384d = intent;
        }

        public Object invoke() {
            byte[] byteArrayExtra = this.f10384d.getByteArrayExtra("KEY_FINDER_POST_MUSIC_INFO");
            C64726td1 td12 = new C64726td1();
            if (byteArrayExtra != null) {
                try {
                    td12.parseFrom(byteArrayExtra);
                    return td12;
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
            }
            return null;
        }
    }

    public MaasPageFinderReporter(String str, int i, String str2, Intent intent) {
        C87412m.m108594g(str, "sessionId");
        C87412m.m108594g(str2, "eid");
        C87412m.m108594g(intent, "intent");
        this.f10367d = str;
        this.f10368e = i;
        this.f10369f = str2;
        this.f10370g = C36568h.m40985a(new C1281b(intent));
        this.f10371h = C36568h.m40985a(new C1283d(intent));
        this.f10372i = C36568h.m40985a(new C1280a(intent));
        this.f10373j = C36568h.m40985a(new C1282c(intent));
        this.f10374n = C36568h.m40986b(C13602i.NONE, new C1284e(intent));
        this.f10375o = new JSONObject();
        this.f10377q = C36568h.m40985a(new C1285f(intent));
        this.f10378r = "";
    }

    /* renamed from: a */
    public final void mo1201a(String str, long j) {
        C87412m.m108594g(str, "key");
        JSONObject jSONObject = this.f10375o;
        BigInteger valueOf = BigInteger.valueOf(j);
        if (valueOf.signum() < 0) {
            valueOf = valueOf.add(BigInteger.ONE.shiftLeft(64));
        }
        String bigInteger = valueOf.toString();
        C87412m.m108593f(bigInteger, "b.toString()");
        jSONObject.put(str, bigInteger);
    }

    /* renamed from: b */
    public final String mo1202b() {
        return (String) ((C36570n) this.f10372i).getValue();
    }

    /* renamed from: c */
    public final String mo1203c() {
        return (String) ((C36570n) this.f10370g).getValue();
    }

    /* renamed from: d */
    public final int mo1204d() {
        return ((Number) ((C36570n) this.f10373j).getValue()).intValue();
    }

    /* renamed from: e */
    public final String mo1205e() {
        return (String) ((C36570n) this.f10371h).getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0144  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1206f(boolean r15) {
        /*
            r14 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "report 21874 session: "
            r0.append(r1)
            java.lang.String r1 = r14.f10367d
            r0.append(r1)
            java.lang.String r1 = " contextId: "
            r0.append(r1)
            java.lang.String r1 = r14.mo1203c()
            r0.append(r1)
            java.lang.String r1 = " jumpId: "
            r0.append(r1)
            java.lang.String r1 = r14.mo1205e()
            r0.append(r1)
            java.lang.String r1 = " clickTabContext: "
            r0.append(r1)
            java.lang.String r1 = r14.mo1202b()
            r0.append(r1)
            java.lang.String r1 = " currentCommentScene: "
            r0.append(r1)
            int r1 = r14.f10368e
            r0.append(r1)
            java.lang.String r1 = ", pageUdf: "
            r0.append(r1)
            org.json.JSONObject r1 = r14.f10375o
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "pageUdfObj.toString()"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r3 = ","
            java.lang.String r4 = ";"
            r5 = 0
            java.lang.String r1 = z04.C112551y.m153814n(r1, r3, r4, r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MaasPageFinderReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            org.json.JSONObject r0 = r14.f10375o
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0074
            java.lang.String r0 = "templateId"
            org.json.JSONObject r1 = r14.f10375o
            java.lang.String r6 = "0"
            r1.put(r0, r6)
        L_0x0074:
            rx3.g r0 = r14.f10377q
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            te3.td1 r0 = (te3.C64726td1) r0
            r1 = 1
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = r0.f185546s
            if (r0 == 0) goto L_0x0092
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x008d
            r0 = 1
            goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            if (r0 != r1) goto L_0x0092
            r0 = 1
            goto L_0x0093
        L_0x0092:
            r0 = 0
        L_0x0093:
            if (r0 == 0) goto L_0x00af
            rx3.g r0 = r14.f10377q
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            te3.td1 r0 = (te3.C64726td1) r0
            if (r0 == 0) goto L_0x00a5
            java.lang.String r0 = r0.f185546s
            if (r0 != 0) goto L_0x00a7
        L_0x00a5:
            java.lang.String r0 = ""
        L_0x00a7:
            org.json.JSONObject r6 = r14.f10375o
            java.lang.String r7 = "songid"
            r6.put(r7, r0)
        L_0x00af:
            java.lang.String r0 = r14.f10378r
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r1 = 0
        L_0x00b9:
            if (r1 == 0) goto L_0x00cb
            java.lang.String r0 = r14.f10378r
            java.lang.String r1 = "value"
            gy3.C87412m.m108594g(r0, r1)
            org.json.JSONObject r1 = r14.f10375o
            java.lang.String r6 = "templateid"
            r1.put(r6, r0)
        L_0x00cb:
            com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct
            r0.<init>()
            java.lang.String r1 = r14.f10367d
            r0.mo1036z(r1)
            java.lang.String r1 = r14.mo1203c()
            r0.mo1032v(r1)
            java.lang.String r1 = r14.mo1202b()
            r0.mo1029s(r1)
            java.lang.String r1 = eb0.C75592q0.m90778h()
            r0.mo1033w(r1)
            int r1 = r14.f10368e
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.mo1030t(r1)
            int r1 = r14.mo1204d()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.mo1035y(r1)
            r1 = r15 ^ 1
            r0.f9879g = r1
            long r6 = eb0.C31543z5.m39453c()
            java.lang.String r1 = java.lang.String.valueOf(r6)
            r0.mo1031u(r1)
            r6 = 0
            if (r15 != 0) goto L_0x0119
            long r8 = eb0.C31543z5.m39453c()
            long r10 = r14.f10376p
            long r8 = r8 - r10
            goto L_0x011a
        L_0x0119:
            r8 = r6
        L_0x011a:
            r0.f9885m = r8
            org.json.JSONObject r1 = r14.f10375o
            java.lang.String r1 = r1.toString()
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r1 = z04.C112551y.m153814n(r1, r3, r4, r5)
            r0.mo1028A(r1)
            java.lang.String r8 = r14.mo1205e()
            r11 = 0
            r12 = 4
            r13 = 0
            java.lang.String r9 = ","
            java.lang.String r10 = ";"
            java.lang.String r1 = z04.C112551y.m153816p(r8, r9, r10, r11, r12, r13)
            r0.mo1034x(r1)
            r0.mo86054n()
            if (r15 != 0) goto L_0x0144
            goto L_0x0148
        L_0x0144:
            long r6 = eb0.C31543z5.m39453c()
        L_0x0148:
            r14.f10376p = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mj_template.report.MaasPageFinderReporter.mo1206f(boolean):void");
    }

    /* renamed from: g */
    public final void mo1207g(boolean z, int i, String str) {
        C87412m.m108594g(str, "udfContent");
        Log.m105924i("MaasPageFinderReporter", "report 21874 session: " + this.f10367d + " contextId: " + mo1203c() + " jumpId: " + mo1205e() + " clickTabContext: " + mo1202b() + " currentCommentScene: " + this.f10368e + ", udf: " + str);
        if (this.f10375o.length() == 0) {
            this.f10375o.put("templateId", "0");
        }
        FinderPageExposeStruct finderPageExposeStruct = new FinderPageExposeStruct();
        finderPageExposeStruct.mo1036z(this.f10367d);
        finderPageExposeStruct.mo1032v(mo1203c());
        finderPageExposeStruct.mo1029s(mo1202b());
        finderPageExposeStruct.mo1033w(C75592q0.m90778h());
        finderPageExposeStruct.mo1030t(String.valueOf(i));
        finderPageExposeStruct.mo1035y(String.valueOf(mo1204d()));
        finderPageExposeStruct.f9879g = z ^ true ? 1 : 0;
        finderPageExposeStruct.mo1031u(String.valueOf(C31543z5.m39453c()));
        long j = 0;
        finderPageExposeStruct.f9885m = !z ? C31543z5.m39453c() - this.f10376p : 0;
        finderPageExposeStruct.mo1028A(str);
        finderPageExposeStruct.mo1034x(C112551y.m153816p(mo1205e(), ",", ";", false, 4, (Object) null));
        finderPageExposeStruct.mo86054n();
        if (z) {
            j = C31543z5.m39453c();
        }
        this.f10376p = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0063  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1208h(java.lang.String r11, boolean r12, java.lang.String r13) {
        /*
            r10 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            int r1 = r11.length()
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L_0x000f
            r1 = 1
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "templateid"
            r0.put(r1, r11)
        L_0x0018:
            rx3.g r1 = r10.f10377q
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            te3.td1 r1 = (te3.C64726td1) r1
            if (r1 == 0) goto L_0x0035
            java.lang.String r1 = r1.f185546s
            if (r1 == 0) goto L_0x0035
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0030
            r1 = 1
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            if (r1 != r3) goto L_0x0035
            r1 = 1
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            if (r1 == 0) goto L_0x0050
            rx3.g r1 = r10.f10377q
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            te3.td1 r1 = (te3.C64726td1) r1
            if (r1 == 0) goto L_0x0048
            java.lang.String r1 = r1.f185546s
            if (r1 != 0) goto L_0x004a
        L_0x0048:
            java.lang.String r1 = ""
        L_0x004a:
            java.lang.String r4 = "songid"
            r0.put(r4, r1)
        L_0x0050:
            rx3.g r1 = r10.f10374n
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams r1 = (com.tencent.p014mm.mj_template.api.MaasAlbumMultiTemplateRequestParams) r1
            if (r1 == 0) goto L_0x0060
            boolean r1 = r1.f157471f
            if (r1 != r3) goto L_0x0060
            r1 = 1
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            if (r1 == 0) goto L_0x0068
            java.lang.String r1 = "post_scene"
            r0.put(r1, r3)
        L_0x0068:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JSONObject().also {\n    …   }\n        }.toString()"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r1 = ","
            java.lang.String r4 = ";"
            java.lang.String r0 = z04.C112551y.m153814n(r0, r1, r4, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "report 21875 tid: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = " click: "
            r1.append(r11)
            r1.append(r12)
            java.lang.String r11 = " session: "
            r1.append(r11)
            java.lang.String r11 = r10.f10367d
            r1.append(r11)
            java.lang.String r11 = " contextId: "
            r1.append(r11)
            java.lang.String r11 = r10.mo1203c()
            r1.append(r11)
            java.lang.String r11 = " jumpId: "
            r1.append(r11)
            java.lang.String r11 = r10.mo1205e()
            r1.append(r11)
            java.lang.String r11 = " clickTabContext: "
            r1.append(r11)
            java.lang.String r11 = r10.mo1202b()
            r1.append(r11)
            java.lang.String r11 = " currentCommentScene: "
            r1.append(r11)
            int r11 = r10.f10368e
            r1.append(r11)
            java.lang.String r11 = ", eid: "
            r1.append(r11)
            r1.append(r13)
            java.lang.String r11 = ", udf: "
            r1.append(r11)
            r1.append(r0)
            java.lang.String r11 = r1.toString()
            java.lang.String r1 = "MaasPageFinderReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
            com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct r11 = new com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct
            r11.<init>()
            java.lang.String r1 = r10.f10367d
            r11.mo1041w(r1)
            java.lang.String r1 = r10.mo1203c()
            r11.mo1040v(r1)
            int r1 = r10.f10368e
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r11.mo1037s(r1)
            int r1 = r10.mo1204d()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "ref_commentscene"
            java.lang.String r1 = r11.mo86045b(r2, r1, r3)
            r11.f9907l = r1
            r11.f9902g = r12
            long r1 = eb0.C31543z5.m39453c()
            java.lang.String r12 = java.lang.String.valueOf(r1)
            r11.mo1039u(r12)
            r11.mo1038t(r13)
            r11.mo1042x(r0)
            java.lang.String r12 = r10.mo1202b()
            java.lang.String r13 = "clicktabcontextid"
            java.lang.String r12 = r11.mo86045b(r13, r12, r3)
            r11.f9906k = r12
            java.lang.String r4 = r10.mo1205e()
            r7 = 0
            r8 = 4
            r9 = 0
            java.lang.String r5 = ","
            java.lang.String r6 = ";"
            java.lang.String r12 = z04.C112551y.m153816p(r4, r5, r6, r7, r8, r9)
            java.lang.String r13 = "jump_id"
            java.lang.String r12 = r11.mo86045b(r13, r12, r3)
            r11.f9908m = r12
            r11.mo86054n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mj_template.report.MaasPageFinderReporter.mo1208h(java.lang.String, boolean, java.lang.String):void");
    }

    /* renamed from: i */
    public final void mo1209i(String str, String str2) {
        C87412m.m108594g(str, "templateId");
        C87412m.m108594g(str2, "eid");
        mo1208h(str, true, str2);
        this.f10378r = str;
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public final void onPause() {
        Log.m105924i("MaasPageFinderReporter", "onPause");
        mo1206f(false);
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public final void onResume() {
        Log.m105924i("MaasPageFinderReporter", "onResume");
        mo1206f(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MaasPageFinderReporter(String str, int i, String str2, Intent intent, int i2, C8480h hVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, str2, (i2 & 8) != 0 ? new Intent() : intent);
    }
}
