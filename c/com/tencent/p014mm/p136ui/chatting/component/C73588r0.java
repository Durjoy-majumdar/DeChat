package com.tencent.p014mm.p136ui.chatting.component;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.message.C40339m;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.C73304a;
import com.tencent.p014mm.p136ui.chatting.C73764n3;
import com.tencent.p014mm.p136ui.chatting.C73847t0;
import com.tencent.p014mm.p136ui.chatting.C74343y0;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C96789p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C86493v0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jr2.C76442r;
import nj3.C76879j;
import p645pj.C77092c;
import p680ru.C77569h;
import te3.C64878zd0;
import zj3.C79348e;
import zj3.C79387w;

/* renamed from: com.tencent.mm.ui.chatting.component.r0 */
public class C73588r0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C73655y0 f216101d;

    /* renamed from: com.tencent.mm.ui.chatting.component.r0$a */
    public class C73589a implements C75018a.C75025e {
        public C73589a() {
        }

        /* renamed from: a */
        public void mo6958a() {
            ((C79387w) C73588r0.this.f216101d.f215752d.f193278b.mo102812a(C79387w.class)).mo102178C();
        }

        public void onHide() {
            C73588r0.this.f216101d.mo102686y3();
        }

        public void onShow() {
            C73588r0.this.f216101d.mo102686y3();
            C73588r0.this.f216101d.f216260e.setVisibility(4);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.r0$b */
    public class C73590b implements DialogInterface.OnClickListener {
        public C73590b(C73588r0 r0Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.r0$c */
    public class C73591c implements Runnable {
        public C73591c() {
        }

        public void run() {
            int i;
            Activity activity;
            int i2;
            Activity activity2;
            C72963f4 f4Var;
            C68070l.C68072b u;
            C73588r0 r0Var = C73588r0.this;
            Class cls = C77569h.class;
            C73655y0 y0Var = r0Var.f216101d;
            y0Var.f216267o = "";
            List<C72963f4> n0 = y0Var.mo102683n0();
            if (C74343y0.m88779w(n0)) {
                C76879j.m92754y(r0Var.f216101d.f215752d.mo91565f(), r0Var.f216101d.f215752d.mo91565f().getString(C0966R.string.cof), "", r0Var.f216101d.f215752d.mo91565f().getString(C0966R.string.f7263q), new C73630v0(r0Var));
                return;
            }
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            Log.m105919d("MicroMsg.ChattingMoreBtnBarHelper", "want fav msgs from %s", r0Var.f216101d.f216263h.getUsername());
            LinkedList linkedList = (LinkedList) n0;
            if (linkedList.size() == 1 && (f4Var = (C72963f4) linkedList.get(0)) != null && (f4Var.mo101020w3() || f4Var.mo100967F3())) {
                if (!f4Var.mo101023z3() || (u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null)) == null || u.f195582i != 74) {
                    String a = C86493v0.m107223a("" + f4Var.mo108774y2());
                    C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
                    c.mo120962i("prePublishId", "msg_" + f4Var.mo108774y2());
                    c.mo120962i("preUsername", C74023i.m87890t(f4Var, r0Var.f216101d.f216264i, ((C79348e) r0Var.f216101d.f215752d.f193278b.mo102812a(C79348e.class)).mo70071q1()));
                    c.mo120962i("preChatName", r0Var.f216101d.f216263h.getUsername());
                    c.mo120962i("preMsgIndex", 0);
                    c.mo120962i("sendAppMsgScene", 1);
                    ((C76442r) C86312j.m106911c(C76442r.class)).mo106656pL("adExtStr", c, f4Var);
                    doFavoriteEvent.f264674d.f264683h = a;
                } else {
                    C76879j.m92754y(r0Var.f216101d.f215752d.mo91565f(), r0Var.f216101d.f215752d.mo91565f().getString(C0966R.string.f360441cv1), "", r0Var.f216101d.f215752d.mo91565f().getString(C0966R.string.f7263q), new C73639w0(r0Var));
                    return;
                }
            }
            if (C96789p0.m124273f(r0Var.f216101d.f215752d.mo91565f(), doFavoriteEvent, r0Var.f216101d.f216263h.getUsername(), n0, false, true)) {
                for (C72963f4 next : n0) {
                    if (next.mo101020w3()) {
                        ((C77569h) C86312j.m106911c(cls)).mo35238ci(next, C40339m.m43520a(next));
                    } else {
                        ((C77569h) C86312j.m106911c(cls)).mo35241nt(next);
                    }
                }
                r0Var.mo102575b(doFavoriteEvent);
                for (C72963f4 c2 : r0Var.f216101d.mo102683n0()) {
                    C73304a.m86447c(C73304a.C73306b.Fav, C73304a.C73307c.Samll, c2, 0);
                }
            } else if (((LinkedList) r0Var.f216101d.mo102683n0()).size() > 1) {
                Activity f = r0Var.f216101d.f215752d.mo91565f();
                if (doFavoriteEvent.f264674d.f264687l >= 0) {
                    activity = r0Var.f216101d.f215752d.mo91565f();
                    i = C0966R.string.coe;
                } else {
                    activity = r0Var.f216101d.f215752d.mo91565f();
                    i = C0966R.string.cod;
                }
                String string = activity.getString(i);
                if (doFavoriteEvent.f264674d.f264687l >= 0) {
                    activity2 = r0Var.f216101d.f215752d.mo91565f();
                    i2 = C0966R.string.bjb;
                } else {
                    activity2 = r0Var.f216101d.f215752d.mo91565f();
                    i2 = C0966R.string.f361137hk2;
                }
                C76879j.m92707A(f, string, "", activity2.getString(i2), r0Var.f216101d.f215752d.mo91565f().getString(C0966R.string.bj_), new C73650x0(r0Var, n0, doFavoriteEvent), (DialogInterface.OnClickListener) null);
            } else {
                C76879j.m92738i(r0Var.f216101d.f215752d.mo91565f(), doFavoriteEvent.f264674d.f264687l, 0);
            }
        }
    }

    public C73588r0(C73655y0 y0Var) {
        this.f216101d = y0Var;
    }

    /* renamed from: a */
    public final void mo102574a(HashSet<Long> hashSet) {
        if (hashSet.isEmpty()) {
            this.f216101d.f215752d.mo91571l().post(new C73591c());
        }
    }

    /* renamed from: b */
    public final void mo102575b(DoFavoriteEvent doFavoriteEvent) {
        C68070l.C68072b u;
        String str;
        DoFavoriteEvent doFavoriteEvent2 = doFavoriteEvent;
        List<C72963f4> n0 = this.f216101d.mo102683n0();
        Iterator<C72963f4> it = n0.iterator();
        do {
            String str2 = null;
            if (!it.hasNext()) {
                long f = C77092c.m93044f();
                C73847t0 t0Var = C73847t0.f216715a;
                if (t0Var.mo102884a(n0, f)) {
                    C76879j.m92754y(this.f216101d.f215752d.mo91565f(), this.f216101d.f215752d.mo91565f().getString(C0966R.string.f360443cv3, new Object[]{Util.getSizeKB(f)}), "", this.f216101d.f215752d.mo91565f().getString(C0966R.string.lkg), (DialogInterface.OnClickListener) null);
                    return;
                }
                long h = C77092c.m93046h();
                if (t0Var.mo102885b(n0, h)) {
                    C76879j.m92754y(this.f216101d.f215752d.mo91565f(), this.f216101d.f215752d.mo91565f().getString(C0966R.string.cv4, new Object[]{Util.getSizeKB(h)}), "", this.f216101d.f215752d.mo91565f().getString(C0966R.string.lkg), (DialogInterface.OnClickListener) null);
                    return;
                }
                DoFavoriteEvent.C92474a aVar = doFavoriteEvent2.f264674d;
                aVar.f264685j = this.f216101d.f215752d.f193286j;
                aVar.f264688m = 41;
                aVar.f264692q = new C73589a();
                doFavoriteEvent.publish();
                int i = doFavoriteEvent2.f264675e.f9046a == 0 ? 1 : 2;
                long nowSecond = Util.nowSecond();
                for (C72963f4 next : n0) {
                    if (next.mo101020w3() && (u = C68070l.C68072b.m80422u(Util.processXml(next.getContent()), str2)) != null && u.f195582i == 5 && !Util.isNullOrNil(u.f195586j)) {
                        int i2 = next.mo100967F3() ? 1 : 2;
                        Log.m105919d("MicroMsg.ChattingMoreBtnBarHelper", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", 13378, u.f195586j, Long.valueOf(nowSecond), Integer.valueOf(i2), 2, 1);
                        try {
                            str = URLEncoder.encode(u.f195586j, "UTF-8");
                        } catch (UnsupportedEncodingException e) {
                            Log.printErrStackTrace("MicroMsg.ChattingMoreBtnBarHelper", e, "", new Object[0]);
                            str = "";
                        }
                        C115669n.INSTANCE.mo160131h(13378, str, Long.valueOf(nowSecond), Integer.valueOf(i2), 2, Integer.valueOf(i));
                    }
                    str2 = null;
                }
                if (doFavoriteEvent2.f264675e.f9046a == 0) {
                    DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent2.f264674d;
                    if (14 != aVar2.f264678c) {
                        Log.m105918d("MicroMsg.ChattingMoreBtnBarHelper", "not record type, do not report");
                        return;
                    }
                    C64878zd0 zd02 = aVar2.f264677b;
                    if (zd02 == null) {
                        Log.m105920e("MicroMsg.ChattingMoreBtnBarHelper", "want to report record fav, but type count is null");
                        return;
                    } else {
                        C115669n.INSTANCE.mo160131h(11142, Integer.valueOf(zd02.f186671d), Integer.valueOf(doFavoriteEvent2.f264674d.f264677b.f186672e), Integer.valueOf(doFavoriteEvent2.f264674d.f264677b.f186673f), Integer.valueOf(doFavoriteEvent2.f264674d.f264677b.f186674g), Integer.valueOf(doFavoriteEvent2.f264674d.f264677b.f186675h), Integer.valueOf(doFavoriteEvent2.f264674d.f264677b.f186676i), Integer.valueOf(doFavoriteEvent2.f264674d.f264677b.f186677j), Integer.valueOf(doFavoriteEvent2.f264674d.f264677b.f186678n), Integer.valueOf(doFavoriteEvent2.f264674d.f264677b.f186679o), Integer.valueOf(doFavoriteEvent2.f264674d.f264677b.f186680p), Integer.valueOf(doFavoriteEvent2.f264674d.f264677b.f186681q), Integer.valueOf(doFavoriteEvent2.f264674d.f264677b.f186682r), Integer.valueOf(doFavoriteEvent2.f264674d.f264677b.f186683s), Integer.valueOf(doFavoriteEvent2.f264674d.f264677b.f186684t), Integer.valueOf(doFavoriteEvent2.f264674d.f264677b.f186685u));
                        return;
                    }
                } else {
                    return;
                }
            }
        } while (C73764n3.m87369a(it.next()));
        C76879j.m92754y(this.f216101d.f215752d.mo91565f(), this.f216101d.f215752d.mo91565f().getString(C0966R.string.cm7), "", this.f216101d.f215752d.mo91565f().getString(C0966R.string.lkg), (DialogInterface.OnClickListener) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0318 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r24) {
        /*
            r23 = this;
            r6 = r23
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r24
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$6"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r23
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.ui.chatting.component.y0 r0 = r6.f216101d
            java.util.List r0 = r0.mo102683n0()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x0034:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0048
            java.lang.Object r4 = r3.next()
            com.tencent.mm.storage.f4 r4 = (com.tencent.p014mm.storage.C72963f4) r4
            long r4 = r4.getMsgId()
            r2.append(r4)
            goto L_0x0034
        L_0x0048:
            java.lang.String r2 = r2.toString()
            com.tencent.mm.ui.chatting.component.y0 r3 = r6.f216101d
            java.lang.String r3 = r3.f216267o
            boolean r3 = r2.equals(r3)
            java.lang.String r4 = "(Landroid/view/View;)V"
            java.lang.String r5 = "onClick"
            java.lang.String r7 = "android/view/View$OnClickListener"
            java.lang.String r8 = "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$6"
            r9 = 0
            if (r3 == 0) goto L_0x0081
            com.tencent.mm.ui.chatting.component.y0 r0 = r6.f216101d
            ck3.b r0 = r0.f215752d
            android.app.Activity r0 = r0.mo91565f()
            com.tencent.mm.ui.chatting.component.y0 r1 = r6.f216101d
            ck3.b r1 = r1.f215752d
            android.app.Activity r1 = r1.mo91565f()
            r2 = 2131825597(0x7f1113bd, float:1.9284055E38)
            java.lang.String r1 = r1.getString(r2)
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r9)
            r0.show()
            j20.C117292a.m165361g(r6, r8, r7, r5, r4)
            return
        L_0x0081:
            boolean r3 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88778v(r0)
            java.lang.String r10 = ""
            java.lang.String r11 = "MicroMsg.ChattingMoreBtnBarHelper"
            if (r3 == 0) goto L_0x00b2
            java.lang.String r0 = "fav item isContainPlaceHolderMsg"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r0)
            com.tencent.mm.ui.chatting.component.y0 r0 = r6.f216101d
            ck3.b r0 = r0.f215752d
            android.app.Activity r0 = r0.mo91565f()
            r1 = 2131824448(0x7f110f40, float:1.9281724E38)
            java.lang.String r1 = r0.getString(r1)
            r2 = 2131820552(0x7f110008, float:1.9273822E38)
            java.lang.String r2 = r0.getString(r2)
            com.tencent.mm.ui.chatting.component.r0$b r3 = new com.tencent.mm.ui.chatting.component.r0$b
            r3.<init>(r6)
            nj3.C76879j.m92754y(r0, r1, r10, r2, r3)
            j20.C117292a.m165361g(r6, r8, r7, r5, r4)
            return
        L_0x00b2:
            com.tencent.mm.ui.chatting.component.y0 r3 = r6.f216101d
            r3.f216267o = r2
            java.util.Iterator r0 = r0.iterator()
        L_0x00ba:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0322
            java.lang.Object r2 = r0.next()
            com.tencent.mm.storage.f4 r2 = (com.tencent.p014mm.storage.C72963f4) r2
            boolean r3 = r2.mo101020w3()
            r15 = 1
            if (r3 == 0) goto L_0x01b7
            java.lang.String r3 = r2.getContent()
            r12 = 0
            com.tencent.mm.message.l$b r3 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r3, r12)
            if (r3 == 0) goto L_0x01b7
            int r12 = r3.f195582i
            r13 = 6
            if (r12 != r13) goto L_0x01b7
            java.lang.String r12 = r3.f195650z
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x01b7
            java.lang.String r12 = r3.f195606o
            com.tencent.mm.pluginsdk.model.app.d r12 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85069k(r2, r12)
            if (r12 == 0) goto L_0x01b7
            java.lang.String r13 = r12.field_fileFullPath
            boolean r13 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r13 == 0) goto L_0x010e
            java.lang.String r13 = r12.field_fileFullPath
            long r13 = com.tencent.p014mm.vfs.C86013q1.m106451l(r13)
            r24 = r10
            long r9 = r12.field_totalLen
            int r16 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r16 == 0) goto L_0x0104
            goto L_0x0110
        L_0x0104:
            r21 = r0
            r22 = r5
            r0 = r24
            r24 = r4
            goto L_0x01be
        L_0x010e:
            r24 = r10
        L_0x0110:
            java.lang.Object[] r9 = new java.lang.Object[r15]
            long r13 = r2.getMsgId()
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            r13 = 0
            r9[r13] = r10
            java.lang.String r10 = "oreh downloadTpFileAndFav startDownload msgID:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r10, r9)
            long r9 = r2.getMsgId()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r1.add(r9)
            gi.g r9 = new gi.g
            r9.<init>()
            java.lang.String r10 = "task_ChattingMoreComponent"
            r9.f287660d = r10
            com.tencent.mm.ui.chatting.component.u0 r10 = new com.tencent.mm.ui.chatting.component.u0
            r10.<init>(r6, r12, r2, r1)
            r9.f287662f = r10
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.String r10 = r2.mo108768t()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r21 = r0
            r0 = r24
            r15.append(r0)
            r24 = r4
            r22 = r5
            long r4 = r2.getMsgId()
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            java.lang.String r5 = "checkExist"
            java.lang.String r4 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r5, r13, r10, r4)
            r9.field_mediaId = r4
            java.lang.String r4 = r3.f195524R
            r9.field_aesKey = r4
            r4 = 19
            r9.field_fileType = r4
            java.lang.String r4 = r3.f195472C
            r9.field_authKey = r4
            java.lang.String r4 = r3.f195650z
            r9.f287672s = r4
            java.lang.String r4 = r12.field_fileFullPath
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0186
            java.lang.String r3 = r12.field_fileFullPath
            r9.field_fullpath = r3
            goto L_0x0198
        L_0x0186:
            eb0.c r4 = eb0.C97625j3.m125812b()
            java.lang.String r4 = r4.mo105889d()
            java.lang.String r5 = r3.f195570f
            java.lang.String r3 = r3.f195602n
            java.lang.String r3 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85063e(r4, r5, r3)
            r9.field_fullpath = r3
        L_0x0198:
            java.lang.Class<qo.l> r3 = p663qo.C101213l.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            qo.l r3 = (p663qo.C101213l) r3
            boolean r3 = r3.xf0(r9)
            if (r3 != 0) goto L_0x01be
            java.lang.String r3 = "openim attach download failed before rescend"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r3)
            long r3 = r2.getMsgId()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.remove(r3)
            goto L_0x01be
        L_0x01b7:
            r21 = r0
            r24 = r4
            r22 = r5
            r0 = r10
        L_0x01be:
            boolean r3 = r2.mo100979R3()
            if (r3 == 0) goto L_0x0275
            java.lang.Class<gt.k> r3 = p158gt.C98201k.class
            di3.d r4 = di3.C86312j.m106911c(r3)
            gt.k r4 = (p158gt.C98201k) r4
            gt.m r4 = r4.mo137277xi()
            java.lang.String r5 = r2.mo108768t()
            long r9 = r2.mo108774y2()
            com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
            com.tencent.mm.modelimage.k r4 = r4.mo127168NQ(r5, r9)
            int r5 = r2.mo108769t2()
            r9 = 1
            if (r5 != r9) goto L_0x01ec
            boolean r5 = r4.mo127145p()
            r17 = r5
            goto L_0x021d
        L_0x01ec:
            boolean r5 = r4.mo127145p()
            if (r5 != 0) goto L_0x01f3
            goto L_0x0218
        L_0x01f3:
            java.lang.Class<gt.l> r5 = p158gt.C76053l.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            gt.l r5 = (p158gt.C76053l) r5
            com.tencent.mm.modelimage.k r5 = r5.mo106261jD(r4)
            di3.d r9 = di3.C86312j.m106911c(r3)
            gt.k r9 = (p158gt.C98201k) r9
            gt.m r9 = r9.mo137277xi()
            java.lang.String r5 = r5.f267378e
            com.tencent.mm.modelimage.m r9 = (com.tencent.p014mm.modelimage.C92839m) r9
            r10 = 1
            java.lang.String r5 = r9.mo127174TY(r5, r0, r0, r10)
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r5 != 0) goto L_0x021b
        L_0x0218:
            r17 = 0
            goto L_0x021d
        L_0x021b:
            r17 = 1
        L_0x021d:
            int r5 = r4.f267376c
            int r9 = r4.f267377d
            if (r5 < r9) goto L_0x0225
            if (r9 != 0) goto L_0x0275
        L_0x0225:
            r5 = 1
            java.lang.Object[] r9 = new java.lang.Object[r5]
            long r12 = r2.getMsgId()
            java.lang.Long r10 = java.lang.Long.valueOf(r12)
            r12 = 0
            r9[r12] = r10
            java.lang.String r10 = "oreh downloadImgAndFav start  msgID:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r10, r9)
            long r9 = r2.getMsgId()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r1.add(r9)
            di3.d r3 = di3.C86312j.m106911c(r3)
            gt.k r3 = (p158gt.C98201k) r3
            gt.j r3 = r3.Jp0()
            long r13 = r4.f267374a
            long r15 = r2.getMsgId()
            r19 = 2131231570(0x7f080352, float:1.8079225E38)
            com.tencent.mm.ui.chatting.component.t0 r4 = new com.tencent.mm.ui.chatting.component.t0
            r4.<init>(r6, r2, r1)
            r12 = r3
            com.tencent.mm.modelimage.e r12 = (com.tencent.p014mm.modelimage.C92822e) r12
            r3 = 1
            r18 = r2
            r20 = r4
            boolean r4 = r12.mo127101c(r13, r15, r17, r18, r19, r20)
            if (r4 != 0) goto L_0x0276
            long r4 = r2.getMsgId()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.remove(r4)
            goto L_0x0276
        L_0x0275:
            r3 = 1
        L_0x0276:
            boolean r4 = r2.mo100994f4()
            if (r4 != 0) goto L_0x0286
            boolean r4 = r2.mo100989b4()
            if (r4 == 0) goto L_0x0283
            goto L_0x0286
        L_0x0283:
            r12 = 0
            goto L_0x0318
        L_0x0286:
            java.lang.Class<rz.u> r4 = p682rz.C101491u.class
            di3.d r5 = di3.C86312j.m106911c(r4)
            rz.u r5 = (p682rz.C101491u) r5
            java.lang.String r9 = r2.mo108765s2()
            hd0.n0 r5 = r5.mo140806Zd(r9)
            if (r5 == 0) goto L_0x0283
            int r9 = r5.f288562i
            r10 = 199(0xc7, float:2.79E-43)
            if (r9 == r10) goto L_0x0283
            long r9 = r2.getMsgId()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r1.add(r9)
            com.tencent.mm.ui.chatting.component.s0 r9 = new com.tencent.mm.ui.chatting.component.s0
            r9.<init>(r6, r2, r1)
            java.lang.Class<rz.s> r10 = p682rz.C101488s.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            rz.s r10 = (p682rz.C101488s) r10
            rz.t r10 = r10.Kj0()
            android.os.Looper r12 = android.os.Looper.getMainLooper()
            hd0.o0 r10 = (hd0.C98410o0) r10
            r10.mo137716b(r9, r12)
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            long r12 = r2.getMsgId()
            java.lang.Long r10 = java.lang.Long.valueOf(r12)
            r12 = 0
            r9[r12] = r10
            java.lang.String r10 = r2.mo108765s2()
            r9[r3] = r10
            java.lang.String r3 = "oreh downloadVideoAndFav start  msgID:%d, fileName:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r9)
            boolean r3 = r5.mo137711o()
            if (r3 == 0) goto L_0x02f7
            java.lang.String r3 = "start complete online video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            di3.d r3 = di3.C86312j.m106911c(r4)
            rz.u r3 = (p682rz.C101491u) r3
            java.lang.String r4 = r2.mo108765s2()
            int r3 = r3.mo140797FT(r4)
            goto L_0x030b
        L_0x02f7:
            java.lang.String r3 = "start complete offline video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            di3.d r3 = di3.C86312j.m106911c(r4)
            rz.u r3 = (p682rz.C101491u) r3
            java.lang.String r4 = r2.mo108765s2()
            int r3 = r3.M00(r4)
        L_0x030b:
            if (r3 == 0) goto L_0x0318
            long r2 = r2.getMsgId()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.remove(r2)
        L_0x0318:
            r4 = r24
            r10 = r0
            r0 = r21
            r5 = r22
            r9 = 0
            goto L_0x00ba
        L_0x0322:
            r24 = r4
            r22 = r5
            r6.mo102574a(r1)
            r0 = r24
            r1 = r22
            j20.C117292a.m165361g(r6, r8, r7, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73588r0.onClick(android.view.View):void");
    }
}
