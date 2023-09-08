package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.NotifyWNNoteOperationEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.LinkedList;
import pb1.C100734q;
import pb1.C100745t;
import pb1.C100755z;
import te3.C101811md0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101841sc0;
import te3.C101846tc0;
import te3.C77911cd0;

/* renamed from: com.tencent.mm.plugin.fav.ui.p0 */
public class C93685p0 {

    /* renamed from: com.tencent.mm.plugin.fav.ui.p0$a */
    public class C93686a implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.cancel();
            }
        }
    }

    /* renamed from: a */
    public static void m118379a(C100755z zVar, int i, String str) {
        C101834rc0 rc02 = new C101834rc0();
        rc02.mo141260p(1);
        rc02.mo141265u(str);
        zVar.field_favProto.f298618f.add(i, rc02);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041 A[Catch:{ all -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065 A[Catch:{ all -> 0x0091 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m118380b(com.tencent.p014mm.p136ui.MMActivity r8, long r9, pb1.C100695a0.C100696a r11) {
        /*
            java.lang.Class<pb1.j1> r0 = pb1.C100718j1.class
            r1 = 0
            di3.d r2 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0091 }
            pb1.j1 r2 = (pb1.C100718j1) r2     // Catch:{ all -> 0x0091 }
            pb1.w0 r2 = r2.mo128199Jq()     // Catch:{ all -> 0x0091 }
            xb1.d r2 = (xb1.C102614d) r2     // Catch:{ all -> 0x0091 }
            pb1.z r9 = r2.mo142266Yt(r9)     // Catch:{ all -> 0x0091 }
            te3.kd0 r10 = r9.field_favProto     // Catch:{ all -> 0x0091 }
            r2 = 1
            if (r10 == 0) goto L_0x003e
            java.util.LinkedList<te3.rc0> r10 = r10.f298618f     // Catch:{ all -> 0x0091 }
            if (r10 == 0) goto L_0x003e
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0091 }
        L_0x0020:
            boolean r3 = r10.hasNext()     // Catch:{ all -> 0x0091 }
            if (r3 == 0) goto L_0x003e
            java.lang.Object r3 = r10.next()     // Catch:{ all -> 0x0091 }
            te3.rc0 r3 = (te3.C101834rc0) r3     // Catch:{ all -> 0x0091 }
            long r3 = r3.f299276R     // Catch:{ all -> 0x0091 }
            di3.d r5 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0091 }
            pb1.j1 r5 = (pb1.C100718j1) r5     // Catch:{ all -> 0x0091 }
            long r5 = r5.mo128210aN(r1)     // Catch:{ all -> 0x0091 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0020
            r10 = 0
            goto L_0x003f
        L_0x003e:
            r10 = 1
        L_0x003f:
            if (r10 != 0) goto L_0x0065
            r9 = 2131825769(0x7f111469, float:1.9284403E38)
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x0091 }
            di3.d r11 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0091 }
            pb1.j1 r11 = (pb1.C100718j1) r11     // Catch:{ all -> 0x0091 }
            int r11 = r11.mo128211cX(r1)     // Catch:{ all -> 0x0091 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0091 }
            r10[r1] = r11     // Catch:{ all -> 0x0091 }
            java.lang.String r9 = r8.getString(r9, r10)     // Catch:{ all -> 0x0091 }
            java.lang.String r10 = ""
            com.tencent.mm.plugin.fav.ui.p0$a r11 = new com.tencent.mm.plugin.fav.ui.p0$a     // Catch:{ all -> 0x0091 }
            r11.<init>()     // Catch:{ all -> 0x0091 }
            nj3.C76879j.m92749t(r8, r9, r10, r11)     // Catch:{ all -> 0x0091 }
            return
        L_0x0065:
            m118384f(r9)     // Catch:{ all -> 0x0091 }
            m118381c(r8, r9)     // Catch:{ all -> 0x0091 }
            te3.md0 r10 = new te3.md0     // Catch:{ all -> 0x0091 }
            r10.<init>()     // Catch:{ all -> 0x0091 }
            if (r11 == 0) goto L_0x008a
            int r0 = r11.f295016a     // Catch:{ all -> 0x0091 }
            r10.f298813d = r0     // Catch:{ all -> 0x0091 }
            int r0 = r11.f295033r     // Catch:{ all -> 0x0091 }
            r10.f298814e = r0     // Catch:{ all -> 0x0091 }
            int r0 = r11.f295017b     // Catch:{ all -> 0x0091 }
            r10.f298815f = r0     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r11.f295036u     // Catch:{ all -> 0x0091 }
            r10.f298817h = r0     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r11.f295034s     // Catch:{ all -> 0x0091 }
            r10.f298816g = r0     // Catch:{ all -> 0x0091 }
            java.lang.String r11 = r11.f295037v     // Catch:{ all -> 0x0091 }
            r10.f298818i = r11     // Catch:{ all -> 0x0091 }
        L_0x008a:
            m118382d(r8, r9, r2, r10)     // Catch:{ all -> 0x0091 }
            r8.finish()     // Catch:{ all -> 0x0091 }
            goto L_0x009f
        L_0x0091:
            r9 = 2131825767(0x7f111467, float:1.92844E38)
            java.lang.String r9 = r8.getString(r9)
            android.widget.Toast r8 = p910lj.C76701a.makeText((android.content.Context) r8, (java.lang.CharSequence) r9, (int) r1)
            r8.show()
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.C93685p0.m118380b(com.tencent.mm.ui.MMActivity, long, pb1.a0$a):void");
    }

    /* renamed from: c */
    public static void m118381c(Context context, C100755z zVar) {
        C101841sc0 sc02;
        String str;
        String str2;
        zVar.field_flag = 0;
        zVar.field_updateTime = System.currentTimeMillis();
        zVar.field_localId = -1;
        zVar.field_sourceType = 6;
        C101835rd0 rd02 = zVar.field_favProto.f298616d;
        if (rd02 != null) {
            rd02.mo141278n("");
            zVar.field_favProto.f298616d.mo141277m(6);
            zVar.field_favProto.f298616d.mo141275k(C75592q0.m90789s());
        }
        zVar.field_fromUser = C75592q0.m90789s();
        if (zVar.field_type == 1) {
            zVar.field_favProto.mo141211f(new LinkedList());
            m118379a(zVar, 0, m118385g(zVar.field_favProto.f298628s));
        } else if (zVar.field_favProto.f298618f != null) {
            int i = 0;
            int i2 = 1;
            while (i < zVar.field_favProto.f298618f.size()) {
                C101834rc0 rc02 = zVar.field_favProto.f298618f.get(i);
                if (zVar.field_type != 18 || !rc02.f299308i1.equals("WeNoteHtmlFile")) {
                    String w = C100734q.m131880w(rc02);
                    String Q = C100734q.m131826Q(rc02);
                    rc02.mo141257m(C100745t.m131892d(rc02.toString(), 18));
                    String w2 = C100734q.m131880w(rc02);
                    String Q2 = C100734q.m131826Q(rc02);
                    if (!Util.isNullOrNil(w) && !Util.isNullOrNil(w2) && C86013q1.m106450k(w)) {
                        C86013q1.m106442c(w, w2);
                    }
                    if (!Util.isNullOrNil(Q) && !Util.isNullOrNil(Q2) && C86013q1.m106450k(Q)) {
                        C86013q1.m106442c(Q, Q2);
                    }
                }
                int i3 = zVar.field_type;
                if (i3 != 18) {
                    if (rc02.f299258I != 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("WeNote_");
                        int i4 = i2 + 1;
                        sb.append(i2);
                        rc02.mo141228A(sb.toString());
                        if (zVar.field_type == 14 && rc02.f299298d1 != null) {
                            m118379a(zVar, i, m118385g(rc02.f299298d1 + XVFSFile.PATH_SEPARATOR));
                            i++;
                        }
                        int i5 = rc02.f299258I;
                        if (!(i5 == 1 || i5 == 2 || i5 == 3 || i5 == 6 || i5 == 8 || i5 == 4 || i5 == 0 || i5 == 22)) {
                            m118383e(context, zVar, i, rc02);
                        } else if (!(i5 != 4 || (sc02 = rc02.f299296c1) == null || sc02.f299422x == null)) {
                            m118383e(context, zVar, i, rc02);
                        }
                        if (rc02.f299258I == 3) {
                            rc02.mo141260p(20);
                        }
                        i2 = i4;
                    } else if (i3 == 14) {
                        if (rc02.f299301f == null) {
                            str = "\n";
                        } else {
                            str = rc02.f299301f + "\n";
                        }
                        if (rc02.f299298d1 == null) {
                            str2 = "";
                        } else {
                            str2 = rc02.f299298d1 + ":\n";
                        }
                        rc02.mo141265u(m118385g(str2 + str + "\n"));
                    } else if (!Util.isNullOrNil(rc02.f299301f)) {
                        rc02.mo141265u(m118385g(rc02.f299301f));
                    }
                } else if (rc02.f299258I == 20) {
                    rc02.mo141254j("");
                    rc02.mo141253f("");
                }
                i++;
            }
        }
        zVar.field_localId = System.currentTimeMillis();
        zVar.field_type = 18;
        zVar.field_xml = C100755z.m131907w2(zVar);
    }

    /* renamed from: d */
    public static void m118382d(Context context, C100755z zVar, boolean z, C101811md0 md02) {
        NotifyWNNoteOperationEvent notifyWNNoteOperationEvent = new NotifyWNNoteOperationEvent();
        NotifyWNNoteOperationEvent.C92535a aVar = notifyWNNoteOperationEvent.f264942d;
        aVar.field_localId = zVar.field_localId;
        aVar.f264954k = 5;
        aVar.f264945b = zVar.field_xml;
        aVar.f264947d = context;
        Bundle bundle = new Bundle();
        C77911cd0 cd02 = zVar.field_favProto.f298608G;
        if (cd02 != null) {
            bundle.putString("noteauthor", cd02.f227115d);
            bundle.putString("noteeditor", cd02.f227116e);
        }
        bundle.putLong("edittime", zVar.field_updateTime);
        NotifyWNNoteOperationEvent.C92535a aVar2 = notifyWNNoteOperationEvent.f264942d;
        aVar2.f264951h = bundle;
        aVar2.field_favProto = zVar.field_favProto;
        aVar2.f264944a = 2;
        aVar2.f264955l = z;
        aVar2.f264956m = md02;
        notifyWNNoteOperationEvent.publish();
    }

    /* renamed from: e */
    public static void m118383e(Context context, C100755z zVar, int i, C101834rc0 rc02) {
        String str;
        C101846tc0 tc02;
        String str2;
        zVar.field_favProto.f298618f.remove(i);
        int i2 = rc02.f299258I;
        if (i2 != 4) {
            str = "";
            if (i2 != 5) {
                if (i2 != 7) {
                    if (i2 != 22) {
                        if (i2 != 29) {
                            if (i2 == 16) {
                                str2 = context.getString(C0966R.string.f8018ze);
                                C86709a0.m107528h();
                                C72963f4.C72964b Rv0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Rv0(rc02.f299301f);
                                str2 = str2 + " " + Rv0.f212676b;
                                str = str2;
                            } else if (i2 == 17) {
                                str = context.getString(C0966R.string.a2b);
                            } else if (i2 == 19) {
                                str2 = context.getString(C0966R.string.f7572k1);
                                try {
                                    str2 = str2 + " " + rc02.f299296c1.f299420v.f259747j;
                                } catch (Exception unused) {
                                }
                                str = str2;
                            } else if (i2 != 20) {
                                str = rc02.f299301f;
                            } else {
                                str = context.getString(C0966R.string.a47) + " " + C68924p1.m81172a(context, rc02.f299338y / 1000) + "\n";
                            }
                        }
                    } else if (!C100734q.m131837a0()) {
                        str = context.getString(C0966R.string.f8009z5);
                    }
                }
                str2 = rc02.f299301f;
                if (!Util.isNullOrNil(rc02.f299297d)) {
                    str2 = rc02.f299297d + " " + str2;
                }
                str = str2;
            } else {
                C101841sc0 sc02 = rc02.f299296c1;
                if (!(sc02 == null || (tc02 = sc02.f299405d) == null)) {
                    str = tc02.f299535y;
                }
                if (Util.isNullOrNil(str)) {
                    str = rc02.f299242A;
                }
            }
        } else {
            str = context.getString(C0966R.string.f360103a43);
        }
        String str3 = "\n\n";
        if (str != null) {
            str3 = "\n" + str + str3;
        }
        m118379a(zVar, i, m118385g(str3));
    }

    /* renamed from: f */
    public static void m118384f(C100755z zVar) {
        C115669n.INSTANCE.mo160131h(15378, Integer.valueOf(zVar.field_id), Integer.valueOf(zVar.field_type));
        Log.m105919d("fav.FavNoteConvertLogic", "report 15378, id:%s, type:%s", Integer.valueOf(zVar.field_id), Integer.valueOf(zVar.field_type));
    }

    /* renamed from: g */
    public static String m118385g(String str) {
        return str.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll(" ", "&nbsp;");
    }
}
