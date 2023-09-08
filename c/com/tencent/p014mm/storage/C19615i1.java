package com.tencent.p014mm.storage;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.Map;
import z04.C112550d0;

/* renamed from: com.tencent.mm.storage.i1 */
public final class C19615i1 {

    /* renamed from: a */
    public static long f55497a;

    /* renamed from: b */
    public static String f55498b;

    /* renamed from: c */
    public static long f55499c;

    /* renamed from: d */
    public static Map<String, String> f55500d;

    /* renamed from: e */
    public static long f55501e;

    /* renamed from: f */
    public static Map<String, String> f55502f;

    /* renamed from: com.tencent.mm.storage.i1$a */
    public static final class C19616a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C19623o0 f55503d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19616a(C19623o0 o0Var) {
            super(0);
            this.f55503d = o0Var;
        }

        public Object invoke() {
            Map<String, String> k = C19615i1.m21064k(this.f55503d);
            if (k == null || Util.isNullOrNil(k.get(".msg.appmsg.mmreader.notify_msg.act"))) {
                return "";
            }
            String str = k.get(".msg.appmsg.mmreader.notify_msg.title");
            if (str == null) {
                str = "";
            }
            int i = 0;
            String str2 = "";
            while (i < 11) {
                StringBuilder sb = new StringBuilder();
                sb.append(".msg.appmsg.mmreader.notify_msg.msg.item");
                sb.append(i == 0 ? "" : Integer.valueOf(i));
                sb.append(".content");
                String str3 = k.get(sb.toString());
                if (Util.isNullOrNil(str3)) {
                    break;
                }
                str2 = str2 + str3;
                i++;
            }
            return (("" + str) + XVFSFile.PATH_SEPARATOR_CHAR) + str2;
        }
    }

    /* renamed from: com.tencent.mm.storage.i1$b */
    public static final class C19617b extends C87413o implements C32226l<String, SpannableString> {

        /* renamed from: d */
        public final /* synthetic */ Map<String, String> f55504d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19617b(Map<String, String> map) {
            super(1);
            this.f55504d = map;
        }

        public Object invoke(Object obj) {
            String str;
            String str2 = (String) obj;
            C87412m.m108594g(str2, "prefix");
            Map<String, String> map = this.f55504d;
            String str3 = map.get(str2 + ".content");
            if (str3 == null || (str = C112550d0.m153799i0(str3).toString()) == null) {
                str = "";
            }
            Map map2 = this.f55504d;
            Object obj2 = map2.get(str2 + ".android_color_light");
            if (C85875k4.m106211z()) {
                Map map3 = this.f55504d;
                obj2 = map3.get(str2 + ".android_color_dark");
            }
            Map<String, String> map4 = this.f55504d;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(".bold");
            boolean z = Util.getInt(map4.get(sb.toString()), 0) == 1;
            Map<String, String> map5 = this.f55504d;
            int i = Util.getInt(map5.get(str2 + ".size"), 15);
            SpannableString spannableString = new SpannableString(str);
            try {
                if (!Util.isNullOrNil((String) obj2)) {
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor((String) obj2)), 0, str.length(), 33);
                }
            } catch (Exception unused) {
                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "color error");
            }
            if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, str.length(), 33);
            }
            if (i > 0) {
                spannableString.setSpan(new AbsoluteSizeSpan(i, true), 0, str.length(), 33);
            }
            return spannableString;
        }
    }

    /* renamed from: com.tencent.mm.storage.i1$c */
    public static final class C19618c extends C87413o implements C32226l<String, SpannableString> {

        /* renamed from: d */
        public final /* synthetic */ Map<String, String> f55505d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19618c(Map<String, String> map) {
            super(1);
            this.f55505d = map;
        }

        public Object invoke(Object obj) {
            String str;
            String str2 = (String) obj;
            C87412m.m108594g(str2, "prefix");
            Map<String, String> map = this.f55505d;
            String str3 = map.get(str2 + ".content");
            if (str3 == null || (str = C112550d0.m153799i0(str3).toString()) == null) {
                str = "";
            }
            Map map2 = this.f55505d;
            Object obj2 = map2.get(str2 + ".android_color_light");
            if (C85875k4.m106211z()) {
                Map map3 = this.f55505d;
                obj2 = map3.get(str2 + ".android_color_dark");
            }
            Map<String, String> map4 = this.f55505d;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(".bold");
            boolean z = Util.getInt(map4.get(sb.toString()), 0) == 1;
            Map<String, String> map5 = this.f55505d;
            int i = Util.getInt(map5.get(str2 + ".size"), 15);
            SpannableString spannableString = new SpannableString(str);
            try {
                if (!Util.isNullOrNil((String) obj2)) {
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor((String) obj2)), 0, str.length(), 33);
                }
            } catch (Exception unused) {
                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "color error");
            }
            if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, str.length(), 33);
            }
            if (i > 0) {
                spannableString.setSpan(new AbsoluteSizeSpan(i, true), 0, str.length(), 33);
            }
            return spannableString;
        }
    }

    /* renamed from: a */
    public static final boolean m21054a(C19623o0 o0Var) {
        Map<String, String> k;
        C87412m.m108594g(o0Var, "info");
        if (!o0Var.mo25755C2() || (k = m21064k(o0Var)) == null) {
            return false;
        }
        if (!Util.isNullOrNil(k.get(".msg.appmsg.mmreader.notify_msg.act"))) {
            return true;
        }
        Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "checkNewDyeingTemplate false");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r0 = m21064k((r0 = rb0.C48009v0.Kx0().mo25733Ow(r0)));
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m21055b() {
        /*
            java.lang.String r0 = "brandService"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r0)
            java.lang.String r1 = "BizLastMsgId"
            long r0 = r0.decodeLong(r1)
            r2 = 1
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x003b
            com.tencent.mm.storage.d1 r3 = rb0.C48009v0.Kx0()
            com.tencent.mm.storage.o0 r0 = r3.mo25733Ow(r0)
            if (r0 == 0) goto L_0x003b
            boolean r1 = r0.mo25755C2()
            if (r1 == 0) goto L_0x003b
            java.util.Map r0 = m21064k(r0)
            if (r0 != 0) goto L_0x002a
            return r2
        L_0x002a:
            java.lang.String r1 = ".msg.appmsg.mmreader.notify_msg.is_show_msg_count"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)
            if (r0 != r2) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r0 = 0
            r2 = 0
        L_0x003b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19615i1.m21055b():boolean");
    }

    /* renamed from: c */
    public static final String m21056c(C19623o0 o0Var) {
        String str;
        C87412m.m108594g(o0Var, "info");
        if (o0Var.field_msgId != f55497a || (str = f55498b) == null) {
            Map<String, String> parseXml = XmlParser.parseXml(o0Var.field_content, "avatar_url", (String) null);
            String str2 = "";
            if (parseXml == null) {
                return str2;
            }
            String str3 = parseXml.get(".avatar_url");
            if (str3 != null) {
                str2 = str3;
            }
            f55498b = str2;
            f55497a = o0Var.field_msgId;
            return str2;
        }
        C87412m.m108591d(str);
        return str;
    }

    /* renamed from: d */
    public static final String m21057d(C19623o0 o0Var) {
        String str;
        Map<String, String> map;
        C87412m.m108594g(o0Var, "info");
        C19616a aVar = new C19616a(o0Var);
        String str2 = "";
        if (o0Var.mo25760H2() || o0Var.mo25756D2()) {
            map = m21061h(o0Var);
            str = ".msgsource.notify_msg.";
        } else if (o0Var.mo25755C2()) {
            map = m21064k(o0Var);
            str = ".msg.appmsg.mmreader.notify_msg.";
        } else {
            map = null;
            str = str2;
        }
        if (map != null) {
            String str3 = map.get(str + "box_digest");
            if (str3 != null) {
                str2 = str3;
            }
        }
        return (!Util.isNullOrNil(str2) || !o0Var.mo25755C2()) ? str2 : (String) aVar.invoke();
    }

    /* renamed from: e */
    public static final SpannableStringBuilder m21058e(C19623o0 o0Var, int i) {
        C87412m.m108594g(o0Var, "info");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Map<String, String> k = m21064k(o0Var);
        if (k == null || Util.isNullOrNil(k.get(".msg.appmsg.mmreader.notify_msg.act"))) {
            return spannableStringBuilder;
        }
        C19617b bVar = new C19617b(k);
        StringBuilder sb = new StringBuilder();
        sb.append(".msg.appmsg.mmreader.notify_msg.msg.item");
        sb.append(i == 0 ? "" : Integer.valueOf(i));
        String sb4 = sb.toString();
        if (!Util.isNullOrNil(k.get(sb4 + ".content"))) {
            spannableStringBuilder.append((CharSequence) bVar.invoke(sb4));
        }
        return spannableStringBuilder;
    }

    /* renamed from: f */
    public static final String m21059f(C19623o0 o0Var) {
        C87412m.m108594g(o0Var, "info");
        Map<String, String> h = m21061h(o0Var);
        String str = "";
        if (h == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String str2 = h.get(".msgsource.notify_msg.title2");
        if (str2 == null) {
            str2 = str;
        }
        sb.append(str2);
        sb.append(' ');
        String str3 = h.get(".msgsource.notify_msg.action");
        if (str3 != null) {
            str = str3;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: g */
    public static final SpannableStringBuilder m21060g(C19623o0 o0Var, int i) {
        C87412m.m108594g(o0Var, "info");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Map<String, String> h = m21061h(o0Var);
        if (h == null || Util.isNullOrNil(h.get(".msgsource.notify_msg.act"))) {
            return spannableStringBuilder;
        }
        C19618c cVar = new C19618c(h);
        StringBuilder sb = new StringBuilder();
        sb.append(".msgsource.notify_msg.msg.item");
        sb.append(i == 0 ? "" : Integer.valueOf(i));
        String sb4 = sb.toString();
        if (!Util.isNullOrNil(h.get(sb4 + ".content"))) {
            spannableStringBuilder.append((CharSequence) cVar.invoke(sb4));
        }
        return spannableStringBuilder;
    }

    /* renamed from: h */
    public static final Map<String, String> m21061h(C19623o0 o0Var) {
        Map<String, String> map;
        long j = o0Var.field_msgId;
        if (j == f55501e && (map = f55502f) != null) {
            return map;
        }
        f55501e = j;
        Map<String, String> parseXml = XmlParser.parseXml(o0Var.f356046F, "msgsource", (String) null);
        f55502f = parseXml;
        return parseXml;
    }

    /* renamed from: i */
    public static final int m21062i(C19623o0 o0Var) {
        C87412m.m108594g(o0Var, "info");
        Map<String, String> k = m21064k(o0Var);
        if (k == null) {
            return 0;
        }
        return Util.getInt(k.get(".msg.appmsg.mmreader.notify_msg.scene"), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r2 = r2.get(".msg.appmsg.mmreader.notify_msg.publisher_username");
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m21063j(com.tencent.p014mm.storage.C19623o0 r2) {
        /*
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r2, r0)
            java.util.Map r2 = m21064k(r2)
            java.lang.String r0 = ""
            if (r2 != 0) goto L_0x000e
            return r0
        L_0x000e:
            java.lang.String r1 = ".msg.appmsg.mmreader.notify_msg.publisher_username"
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r0 = r2
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19615i1.m21063j(com.tencent.mm.storage.o0):java.lang.String");
    }

    /* renamed from: k */
    public static final Map<String, String> m21064k(C19623o0 o0Var) {
        Map<String, String> map;
        long j = o0Var.field_msgId;
        if (j == f55499c && (map = f55500d) != null) {
            return map;
        }
        f55499c = j;
        Map<String, String> parseXml = XmlParser.parseXml(o0Var.field_content, "msg", (String) null);
        f55500d = parseXml;
        return parseXml;
    }

    /* renamed from: l */
    public static final int m21065l() {
        C30783v3 Ku = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku();
        C72976h2 j = Ku != null ? ((C44660i2) Ku).mo69771j("officialaccounts") : null;
        if (j == null) {
            return 0;
        }
        return j.mo108786G2() <= 0 ? ((j.mo108372k3(8388608) || j.mo108372k3(2097152)) && j.mo108788I2() > 0) ? 1 : 0 : (j.mo108372k3(16) || j.mo108372k3(64)) ? 1 : 0;
    }

    /* renamed from: m */
    public static final boolean m21066m(C72963f4 f4Var, String str) {
        if (f4Var == null) {
            return false;
        }
        if (!(f4Var.mo100992d4())) {
            Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToTimeline isTemplateMsg false");
            return false;
        } else if (!C72996z1.m85839j5(str)) {
            Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToTimeline isMsgClusterNotifyMessage = false");
            return false;
        } else {
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            if (!(hVar != null && hVar.mo58779Qe(C32735h.C32737c.clicfg_open_dyeing_template_to_timeline, 1) == 1)) {
                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToTimeline open = false");
                return false;
            }
            Map<String, String> parseXml = XmlParser.parseXml(f4Var.getContent(), "msg", (String) null);
            if (parseXml != null) {
                String str2 = parseXml.get(".msg.appmsg.mmreader.notify_msg.act");
                Log.m105925i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToTimeline notifyMsg = %s", Boolean.valueOf(!Util.isNullOrNil(str2)));
                return !Util.isNullOrNil(str2);
            }
            Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToTimeline false");
            return false;
        }
    }

    /* renamed from: n */
    public static final void m21067n(String str, int i, int i2, long j, int i3, int i4, int i5, int i6) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / ((long) 1000));
        C115669n.INSTANCE.mo160131h(17750, str, Integer.valueOf(currentTimeMillis), Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0082  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m21068o(com.tencent.p014mm.storage.C19623o0 r3, int r4, android.widget.TextView r5) {
        /*
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "view"
            gy3.C87412m.m108594g(r5, r0)
            java.util.Map r3 = m21061h(r3)
            if (r3 == 0) goto L_0x007f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".msgsource.notify_msg.msg.item"
            r0.append(r1)
            if (r4 != 0) goto L_0x0020
            java.lang.String r4 = ""
            goto L_0x0024
        L_0x0020:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0024:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = ".max_line_count"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "MicroMsg.BizTimeLineStorageLogicExKt"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x007f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 2
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r4)
            goto L_0x0080
        L_0x007f:
            r3 = 0
        L_0x0080:
            if (r3 != 0) goto L_0x0085
            r3 = 2147483647(0x7fffffff, float:NaN)
        L_0x0085:
            r5.setMaxLines(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19615i1.m21068o(com.tencent.mm.storage.o0, int, android.widget.TextView):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0082  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m21069p(com.tencent.p014mm.storage.C19623o0 r3, int r4, android.widget.TextView r5) {
        /*
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "view"
            gy3.C87412m.m108594g(r5, r0)
            java.util.Map r3 = m21064k(r3)
            if (r3 == 0) goto L_0x007f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".msg.appmsg.mmreader.notify_msg.msg.item"
            r0.append(r1)
            if (r4 != 0) goto L_0x0020
            java.lang.String r4 = ""
            goto L_0x0024
        L_0x0020:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0024:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = ".max_line_count"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "MicroMsg.BizTimeLineStorageLogicExKt"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x007f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 2
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r4)
            goto L_0x0080
        L_0x007f:
            r3 = 0
        L_0x0080:
            if (r3 != 0) goto L_0x0085
            r3 = 2147483647(0x7fffffff, float:NaN)
        L_0x0085:
            r5.setMaxLines(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19615i1.m21069p(com.tencent.mm.storage.o0, int, android.widget.TextView):void");
    }
}
