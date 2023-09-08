package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/* renamed from: com.tencent.mm.ui.chatting.QQMailHistoryExporter */
public class QQMailHistoryExporter {

    /* renamed from: f */
    public static final String f215343f;

    /* renamed from: g */
    public static final char[] f215344g = {'<', '>', '\"', '\'', '&', 10};

    /* renamed from: h */
    public static final String[] f215345h = {"&lt;", "&gt;", "&quot;", "&apos;", "&amp;", "<br />"};

    /* renamed from: a */
    public Context f215346a;

    /* renamed from: b */
    public List<C72963f4> f215347b;

    /* renamed from: c */
    public String f215348c = null;

    /* renamed from: d */
    public C72996z1 f215349d;

    /* renamed from: e */
    public float f215350e = 1.0f;

    /* renamed from: com.tencent.mm.ui.chatting.QQMailHistoryExporter$ImageSpanData */
    public static class ImageSpanData implements Parcelable {
        public static final Parcelable.Creator<ImageSpanData> CREATOR = new C24299a();

        /* renamed from: d */
        public int f69767d;

        /* renamed from: e */
        public int f69768e;

        /* renamed from: f */
        public String f69769f;

        /* renamed from: g */
        public int f69770g = 0;

        /* renamed from: com.tencent.mm.ui.chatting.QQMailHistoryExporter$ImageSpanData$a */
        public class C24299a implements Parcelable.Creator<ImageSpanData> {
            public Object createFromParcel(Parcel parcel) {
                ImageSpanData imageSpanData = new ImageSpanData();
                imageSpanData.f69767d = parcel.readInt();
                imageSpanData.f69768e = parcel.readInt();
                imageSpanData.f69769f = parcel.readString();
                imageSpanData.f69770g = parcel.readInt();
                return imageSpanData;
            }

            public Object[] newArray(int i) {
                return new ImageSpanData[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f69767d);
            parcel.writeInt(this.f69768e);
            parcel.writeString(this.f69769f);
            parcel.writeInt(this.f69770g);
        }
    }

    static {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("<img id=\"%s\" src=\"%s\" height=\"100\" onclick=\"");
        QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
        if (Util.isNullOrNil("weixin://img_onclick/") || Util.isNullOrNil("this.id + '@@' + this.src")) {
            Log.m105921e("MicroMsg.WebViewUtil", "genJsCode fail, invalid argument, scheme = %s, jsCode = %s", "weixin://img_onclick/", "this.id + '@@' + this.src");
            str = null;
        } else {
            Log.m105919d("MicroMsg.WebViewUtil", "genJsCode, scheme = %s, jsCode = %s", "weixin://img_onclick/", "this.id + '@@' + this.src");
            str = "document.getElementById('_edw_iframe_').src = 'weixin://img_onclick/' + this.id + '@@' + this.src";
        }
        sb.append(str);
        sb.append("\"></img>");
        f215343f = sb.toString();
    }

    public QQMailHistoryExporter(Context context, List<C72963f4> list, C72996z1 z1Var) {
        this.f215346a = context;
        this.f215347b = list;
        this.f215349d = z1Var;
    }

    /* renamed from: b */
    public static String m86432b(String str) {
        if (str == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            boolean z = true;
            int length2 = f215344g.length - 1;
            while (true) {
                if (length2 < 0) {
                    break;
                } else if (f215344g[length2] == charAt) {
                    stringBuffer.append(f215345h[length2]);
                    z = false;
                    break;
                } else {
                    length2--;
                }
            }
            if (z) {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public final String mo102116a(C72963f4 f4Var) {
        String str;
        Class cls = C75339i.class;
        if (!C72996z1.m85820U5(this.f215349d.getUsername())) {
            str = ((C75339i) C86312j.m106911c(cls)).getDisplayName(f4Var.mo108768t());
        } else {
            String content = f4Var.getContent();
            int t = C75604z3.m90848t(content);
            if (t != -1) {
                str = ((C75339i) C86312j.m106911c(cls)).getDisplayName(content.substring(0, t).trim());
            } else {
                str = null;
            }
        }
        if (f4Var.mo108769t2() == 1) {
            Log.m105924i("MicroMsg.QQMailHistoryExporter", "isSend");
            str = C75592q0.m90783m();
        }
        String format = new SimpleDateFormat("HH:mm").format(new Date(f4Var.getCreateTime()));
        return "" + str + "  " + format;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo102117c(com.tencent.p014mm.storage.C72963f4 r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r17.mo100995g4()
            java.lang.String r4 = "MicroMsg.QQMailHistoryExporter"
            r5 = 3
            r6 = 0
            r7 = 2
            java.lang.String r8 = "[%s]"
            r9 = 0
            r10 = 1
            if (r2 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r10]
            android.content.Context r6 = r0.f215346a
            r11 = 2131824843(0x7f1110cb, float:1.9282525E38)
            java.lang.String r6 = r6.getString(r11)
            r2[r9] = r6
            java.lang.String r6 = java.lang.String.format(r8, r2)
            goto L_0x038b
        L_0x0026:
            boolean r2 = r17.mo101002k4()
            if (r2 == 0) goto L_0x0048
            int r2 = r17.mo108769t2()
            if (r2 != r10) goto L_0x003d
            android.content.Context r2 = r0.f215346a
            r6 = 2131824841(0x7f1110c9, float:1.9282521E38)
            java.lang.String r6 = r2.getString(r6)
            goto L_0x038b
        L_0x003d:
            android.content.Context r2 = r0.f215346a
            r6 = 2131824840(0x7f1110c8, float:1.928252E38)
            java.lang.String r6 = r2.getString(r6)
            goto L_0x038b
        L_0x0048:
            boolean r2 = r17.mo100982U3()
            if (r2 == 0) goto L_0x006a
            com.tencent.mm.autogen.events.LocationServerEvent r2 = new com.tencent.mm.autogen.events.LocationServerEvent
            r2.<init>()
            com.tencent.mm.autogen.events.LocationServerEvent$a r6 = r2.f193728d
            r6.f193730a = r10
            r6.f193733d = r1
            r2.publish()
            com.tencent.mm.autogen.events.LocationServerEvent$b r2 = r2.f193729e
            java.lang.String r2 = r2.f193734a
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r6[r9] = r2
            java.lang.String r6 = java.lang.String.format(r8, r6)
            goto L_0x038b
        L_0x006a:
            boolean r2 = r17.mo101020w3()
            r12 = 2131824836(0x7f1110c4, float:1.9282511E38)
            java.lang.String r13 = "/"
            java.lang.String r14 = "[%s: %s]"
            if (r2 == 0) goto L_0x02d1
            java.lang.Class<ym.l> r2 = p763ym.C79138l.class
            java.lang.String r15 = r17.getContent()
            com.tencent.mm.storage.z1 r11 = r0.f215349d
            java.lang.String r11 = r11.getUsername()
            boolean r11 = com.tencent.p014mm.storage.C72996z1.m85820U5(r11)
            if (r11 == 0) goto L_0x00a6
            java.lang.String r11 = "chatroom msg, parse it"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r11)
            java.lang.String r11 = r17.getContent()
            int r11 = eb0.C75604z3.m90848t(r11)
            r3 = -1
            if (r11 == r3) goto L_0x00a6
            java.lang.String r3 = r17.getContent()
            int r11 = r11 + r10
            java.lang.String r3 = r3.substring(r11)
            java.lang.String r15 = r3.trim()
        L_0x00a6:
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r15)
            com.tencent.mm.message.l$b r3 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r3, r6)
            r6 = 2131824833(0x7f1110c1, float:1.9282505E38)
            if (r3 != 0) goto L_0x00c9
            java.lang.String r2 = "appmsg content is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)
            java.lang.Object[] r2 = new java.lang.Object[r10]
            android.content.Context r3 = r0.f215346a
            java.lang.String r3 = r3.getString(r6)
            r2[r9] = r3
            java.lang.String r2 = java.lang.String.format(r8, r2)
        L_0x00c6:
            r6 = r2
            goto L_0x038b
        L_0x00c9:
            di3.d r11 = di3.C86312j.m106911c(r2)
            ym.l r11 = (p763ym.C79138l) r11
            java.lang.String r15 = r3.f195562d
            com.tencent.mm.pluginsdk.model.app.j r11 = r11.getAppInfo(r15)
            if (r11 == 0) goto L_0x00e3
            java.lang.String r15 = r11.field_appName
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 == 0) goto L_0x00e0
            goto L_0x00e3
        L_0x00e0:
            java.lang.String r15 = r11.field_appName
            goto L_0x00e5
        L_0x00e3:
            java.lang.String r15 = r3.f195484F
        L_0x00e5:
            di3.d r2 = di3.C86312j.m106911c(r2)
            ym.l r2 = (p763ym.C79138l) r2
            android.content.Context r6 = r0.f215346a
            java.lang.String r2 = r2.mo74019xG(r6, r11, r15)
            boolean r6 = r17.mo100963C3()
            if (r6 == 0) goto L_0x0115
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r6 == 0) goto L_0x0104
            java.lang.String r2 = r3.f195570f
            java.lang.String r2 = m86432b(r2)
            goto L_0x00c6
        L_0x0104:
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r6[r9] = r2
            java.lang.String r2 = r3.f195570f
            java.lang.String r2 = m86432b(r2)
            r6[r10] = r2
            java.lang.String r2 = java.lang.String.format(r14, r6)
            goto L_0x00c6
        L_0x0115:
            boolean r6 = r17.mo100961A3()
            java.lang.String r11 = "file://"
            if (r6 == 0) goto L_0x017a
            java.lang.String r2 = com.tencent.p014mm.p136ui.chatting.C73869u3.m87558a(r1, r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x02ad
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            android.net.Uri r6 = com.tencent.p014mm.vfs.C116299g2.m163858n(r2)
            java.lang.String r8 = r6.getPath()
            if (r8 == 0) goto L_0x015a
            java.lang.String r8 = com.tencent.p014mm.vfs.C116299g2.m163855k(r8, r9, r9)
            java.lang.String r11 = r6.getPath()
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L_0x015a
            android.net.Uri$Builder r6 = r6.buildUpon()
            android.net.Uri$Builder r6 = r6.path(r8)
            android.net.Uri r6 = r6.build()
        L_0x015a:
            java.lang.String r8 = f215343f
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.String r6 = r6.getPath()
            int r12 = r6.lastIndexOf(r13)
            if (r12 >= 0) goto L_0x0169
            goto L_0x016e
        L_0x0169:
            int r12 = r12 + r10
            java.lang.String r6 = r6.substring(r12)
        L_0x016e:
            r11[r9] = r6
            r11[r10] = r3
            r11[r7] = r2
            java.lang.String r2 = java.lang.String.format(r8, r11)
            goto L_0x00c6
        L_0x017a:
            int r6 = r3.f195582i
            switch(r6) {
                case 1: goto L_0x02b1;
                case 2: goto L_0x0250;
                case 3: goto L_0x020b;
                case 4: goto L_0x01f3;
                case 5: goto L_0x01f3;
                case 6: goto L_0x01a2;
                case 7: goto L_0x017f;
                case 8: goto L_0x0192;
                default: goto L_0x017f;
            }
        L_0x017f:
            java.lang.Object[] r2 = new java.lang.Object[r10]
            android.content.Context r3 = r0.f215346a
            r6 = 2131824833(0x7f1110c1, float:1.9282505E38)
            java.lang.String r3 = r3.getString(r6)
            r2[r9] = r3
            java.lang.String r2 = java.lang.String.format(r8, r2)
            goto L_0x00c6
        L_0x0192:
            java.lang.Object[] r2 = new java.lang.Object[r10]
            android.content.Context r3 = r0.f215346a
            java.lang.String r3 = r3.getString(r12)
            r2[r9] = r3
            java.lang.String r2 = java.lang.String.format(r8, r2)
            goto L_0x00c6
        L_0x01a2:
            java.lang.String r2 = r3.f195574g
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r6 = 2131824837(0x7f1110c5, float:1.9282513E38)
            if (r2 == 0) goto L_0x01c5
            java.lang.Object[] r2 = new java.lang.Object[r7]
            android.content.Context r8 = r0.f215346a
            java.lang.String r6 = r8.getString(r6)
            r2[r9] = r6
            java.lang.String r3 = r3.f195570f
            java.lang.String r3 = m86432b(r3)
            r2[r10] = r3
            java.lang.String r2 = java.lang.String.format(r14, r2)
            goto L_0x00c6
        L_0x01c5:
            r2 = 4
            java.lang.Object[] r8 = new java.lang.Object[r2]
            android.content.Context r2 = r0.f215346a
            java.lang.String r2 = r2.getString(r6)
            r8[r9] = r2
            java.lang.String r2 = r3.f195570f
            java.lang.String r2 = m86432b(r2)
            r8[r10] = r2
            java.lang.String r2 = r3.f195574g
            java.lang.String r2 = m86432b(r2)
            r8[r7] = r2
            android.content.Context r2 = r0.f215346a
            r3 = 2131824834(0x7f1110c2, float:1.9282507E38)
            java.lang.String r2 = r2.getString(r3)
            r8[r5] = r2
            java.lang.String r2 = "[%s: %s-%s(%s)]"
            java.lang.String r2 = java.lang.String.format(r2, r8)
            goto L_0x00c6
        L_0x01f3:
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r6 = r3.f195570f
            java.lang.String r6 = m86432b(r6)
            r2[r9] = r6
            java.lang.String r3 = r3.f195586j
            java.lang.String r3 = m86432b(r3)
            r2[r10] = r3
            java.lang.String r2 = java.lang.String.format(r14, r2)
            goto L_0x00c6
        L_0x020b:
            java.lang.String r2 = r3.f195574g
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r6 = 2131824839(0x7f1110c7, float:1.9282517E38)
            if (r2 == 0) goto L_0x022e
            java.lang.Object[] r2 = new java.lang.Object[r7]
            android.content.Context r8 = r0.f215346a
            java.lang.String r6 = r8.getString(r6)
            r2[r9] = r6
            java.lang.String r3 = r3.f195570f
            java.lang.String r3 = m86432b(r3)
            r2[r10] = r3
            java.lang.String r2 = java.lang.String.format(r14, r2)
            goto L_0x00c6
        L_0x022e:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            android.content.Context r8 = r0.f215346a
            java.lang.String r6 = r8.getString(r6)
            r2[r9] = r6
            java.lang.String r6 = r3.f195570f
            java.lang.String r6 = m86432b(r6)
            r2[r10] = r6
            java.lang.String r3 = r3.f195574g
            java.lang.String r3 = m86432b(r3)
            r2[r7] = r3
            java.lang.String r3 = "[%s: %s-%s]"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            goto L_0x00c6
        L_0x0250:
            java.lang.String r2 = com.tencent.p014mm.p136ui.chatting.C73869u3.m87558a(r1, r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x02ad
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            android.net.Uri r6 = com.tencent.p014mm.vfs.C116299g2.m163858n(r2)
            java.lang.String r8 = r6.getPath()
            if (r8 == 0) goto L_0x028d
            java.lang.String r8 = com.tencent.p014mm.vfs.C116299g2.m163855k(r8, r9, r9)
            java.lang.String r11 = r6.getPath()
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L_0x028d
            android.net.Uri$Builder r6 = r6.buildUpon()
            android.net.Uri$Builder r6 = r6.path(r8)
            android.net.Uri r6 = r6.build()
        L_0x028d:
            java.lang.String r8 = f215343f
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.String r6 = r6.getPath()
            int r12 = r6.lastIndexOf(r13)
            if (r12 >= 0) goto L_0x029c
            goto L_0x02a1
        L_0x029c:
            int r12 = r12 + r10
            java.lang.String r6 = r6.substring(r12)
        L_0x02a1:
            r11[r9] = r6
            r11[r10] = r3
            r11[r7] = r2
            java.lang.String r2 = java.lang.String.format(r8, r11)
            goto L_0x00c6
        L_0x02ad:
            java.lang.String r2 = ""
            goto L_0x00c6
        L_0x02b1:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r6 == 0) goto L_0x02bf
            java.lang.String r2 = r3.f195570f
            java.lang.String r2 = m86432b(r2)
            goto L_0x00c6
        L_0x02bf:
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r6[r9] = r2
            java.lang.String r2 = r3.f195570f
            java.lang.String r2 = m86432b(r2)
            r6[r10] = r2
            java.lang.String r2 = java.lang.String.format(r14, r6)
            goto L_0x00c6
        L_0x02d1:
            boolean r2 = r17.mo100975N3()
            if (r2 == 0) goto L_0x0300
            eb0.c r2 = eb0.C97625j3.m125812b()
            g62.l r2 = r2.mo105911z()
            java.lang.String r3 = r17.getContent()
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4$b r2 = r2.Rv0(r3)
            java.lang.String r2 = r2.f212676b
            java.lang.Object[] r3 = new java.lang.Object[r7]
            android.content.Context r6 = r0.f215346a
            r8 = 2131824835(0x7f1110c3, float:1.928251E38)
            java.lang.String r6 = r6.getString(r8)
            r3[r9] = r6
            r3[r10] = r2
            java.lang.String r6 = java.lang.String.format(r14, r3)
            goto L_0x038b
        L_0x0300:
            boolean r2 = r17.mo100994f4()
            if (r2 == 0) goto L_0x0371
            java.lang.Object[] r2 = new java.lang.Object[r5]
            android.content.Context r3 = r0.f215346a
            r6 = 2131824842(0x7f1110ca, float:1.9282523E38)
            java.lang.String r3 = r3.getString(r6)
            r2[r9] = r3
            java.lang.Class<rz.s> r3 = p682rz.C101488s.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            rz.s r3 = (p682rz.C101488s) r3
            rz.t r3 = r3.Kj0()
            java.lang.String r6 = r17.mo108765s2()
            hd0.o0 r3 = (hd0.C98410o0) r3
            java.lang.String r3 = r3.mo137728q(r6)
            android.net.Uri r3 = com.tencent.p014mm.vfs.C116299g2.m163858n(r3)
            java.lang.String r6 = r3.getPath()
            if (r6 == 0) goto L_0x034d
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r9, r9)
            java.lang.String r8 = r3.getPath()
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x034d
            android.net.Uri$Builder r3 = r3.buildUpon()
            android.net.Uri$Builder r3 = r3.path(r6)
            android.net.Uri r3 = r3.build()
        L_0x034d:
            java.lang.String r3 = r3.getPath()
            int r6 = r3.lastIndexOf(r13)
            if (r6 >= 0) goto L_0x0358
            goto L_0x035d
        L_0x0358:
            int r6 = r6 + r10
            java.lang.String r3 = r3.substring(r6)
        L_0x035d:
            r2[r10] = r3
            android.content.Context r3 = r0.f215346a
            r6 = 2131824834(0x7f1110c2, float:1.9282507E38)
            java.lang.String r3 = r3.getString(r6)
            r2[r7] = r3
            java.lang.String r3 = "[%s: %s(%s)]"
            java.lang.String r6 = java.lang.String.format(r3, r2)
            goto L_0x038b
        L_0x0371:
            boolean r2 = r17.mo100973L3()
            if (r2 != 0) goto L_0x037d
            boolean r2 = r17.mo101022y3()
            if (r2 == 0) goto L_0x038b
        L_0x037d:
            java.lang.Object[] r2 = new java.lang.Object[r10]
            android.content.Context r3 = r0.f215346a
            java.lang.String r3 = r3.getString(r12)
            r2[r9] = r3
            java.lang.String r6 = java.lang.String.format(r8, r2)
        L_0x038b:
            java.lang.Object[] r2 = new java.lang.Object[r10]
            r2[r9] = r6
            java.lang.String r3 = "formatOtherMsg, msgStr = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r3, r2)
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            float r3 = r0.f215350e
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r2[r9] = r3
            java.lang.String r1 = r16.mo102116a(r17)
            r2[r10] = r1
            float r1 = r0.f215350e
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2[r7] = r1
            r2[r5] = r6
            java.lang.String r1 = "<p style=\"font-size:%fem;\"><b>%s</b></p>\n  <p style=\"font-size:%fem;\">%s</p>\n <p style=\"line-height:1.5em;\"></p>\n"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.QQMailHistoryExporter.mo102117c(com.tencent.mm.storage.f4):java.lang.String");
    }
}
