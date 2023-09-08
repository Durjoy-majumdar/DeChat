package com.tencent.p014mm.plugin.shake.p103ui;

import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ShakeActionReportStruct;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.WCWebUpdater;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import di3.C86312j;
import eb0.C97625j3;
import gc0.C20828a;
import hl0.C87552j;
import j20.C117292a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedList;
import jn2.C21268a;
import jn2.C21269b;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import lj3.C46863b;
import nj3.C11184p0;
import nj3.C76879j;
import nn2.C47288f;
import nn2.C47289g;
import nn2.C76942m;
import p196ln.C76705f;
import p196ln.C76708i;
import p214om.C11502f;
import p629ny.C76979h;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C77328l;
import sn2.C48438k;
import sn2.C48447s;
import sn2.C64057o;
import te3.C50874pt2;
import te3.C51155rt2;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.shake.ui.ShakeItemListUI */
public class ShakeItemListUI extends MMActivity {

    /* renamed from: d */
    public long f116418d = 0;

    /* renamed from: e */
    public boolean f116419e = false;

    /* renamed from: f */
    public C43010i f116420f;

    /* renamed from: g */
    public ListView f116421g;

    /* renamed from: h */
    public View f116422h;

    /* renamed from: i */
    public int f116423i;

    /* renamed from: j */
    public C20828a f116424j = null;

    /* renamed from: n */
    public int f116425n;

    /* renamed from: o */
    public C11184p0 f116426o = new C43009h();

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeItemListUI$a */
    public class C43001a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeItemListUI$a$a */
        public class C43002a implements DialogInterface.OnClickListener {
            public C43002a() {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
                if (r5 != 5) goto L_0x0096;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.content.DialogInterface r5, int r6) {
                /*
                    r4 = this;
                    com.tencent.mm.plugin.shake.ui.ShakeItemListUI$a r5 = com.tencent.p014mm.plugin.shake.p103ui.ShakeItemListUI.C43001a.this
                    com.tencent.mm.plugin.shake.ui.ShakeItemListUI r5 = com.tencent.p014mm.plugin.shake.p103ui.ShakeItemListUI.this
                    int r5 = r5.f116423i
                    r6 = -12
                    r0 = 8
                    r1 = 11
                    r2 = 0
                    if (r5 == r6) goto L_0x008f
                    if (r5 == r1) goto L_0x008f
                    r6 = 100
                    if (r5 == r6) goto L_0x0076
                    r6 = -6
                    if (r5 == r6) goto L_0x0043
                    r6 = -5
                    r1 = 4
                    if (r5 == r6) goto L_0x002f
                    r6 = -1
                    if (r5 == r6) goto L_0x0027
                    if (r5 == 0) goto L_0x0027
                    if (r5 == r1) goto L_0x002f
                    r6 = 5
                    if (r5 == r6) goto L_0x0043
                    goto L_0x0096
                L_0x0027:
                    nn2.g r5 = nn2.C76942m.zx0()
                    r5.mo72325jo(r2)
                    goto L_0x0096
                L_0x002f:
                    com.tencent.mm.sdk.platformtools.MMHandlerThread r5 = f40.C86709a0.m107525e()
                    sn2.n r6 = new sn2.n
                    r6.<init>()
                    r5.postToWorker(r6)
                    nn2.g r5 = nn2.C76942m.zx0()
                    r5.mo72325jo(r1)
                    goto L_0x0096
                L_0x0043:
                    nn2.g r5 = nn2.C76942m.zx0()
                    r6 = 7
                    r5.mo72325jo(r6)
                    nn2.g r5 = nn2.C76942m.zx0()
                    r6 = 6
                    r5.mo72325jo(r6)
                    nn2.g r5 = nn2.C76942m.zx0()
                    r5.mo72325jo(r0)
                    nn2.g r5 = nn2.C76942m.zx0()
                    r6 = 9
                    r5.mo72325jo(r6)
                    nn2.g r5 = nn2.C76942m.zx0()
                    r6 = 10
                    r5.mo72325jo(r6)
                    nn2.g r5 = nn2.C76942m.zx0()
                    r6 = 12
                    r5.mo72325jo(r6)
                    goto L_0x0096
                L_0x0076:
                    nn2.g r5 = nn2.C76942m.zx0()
                    r5.mo72325jo(r2)
                    nn2.g r5 = nn2.C76942m.zx0()
                    com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r5.f126951d
                    java.lang.String r1 = "shakeitem1"
                    java.lang.String r3 = "delete from shakeitem1"
                    r6.execSQL(r1, r3)
                    r5.doNotify()
                    goto L_0x0096
                L_0x008f:
                    nn2.g r5 = nn2.C76942m.zx0()
                    r5.mo72325jo(r1)
                L_0x0096:
                    com.tencent.mm.plugin.shake.ui.ShakeItemListUI$a r5 = com.tencent.p014mm.plugin.shake.p103ui.ShakeItemListUI.C43001a.this
                    com.tencent.mm.plugin.shake.ui.ShakeItemListUI r5 = com.tencent.p014mm.plugin.shake.p103ui.ShakeItemListUI.this
                    com.tencent.mm.plugin.shake.ui.ShakeItemListUI$i r5 = r5.f116420f
                    r5.mo1333o()
                    com.tencent.mm.plugin.shake.ui.ShakeItemListUI$a r5 = com.tencent.p014mm.plugin.shake.p103ui.ShakeItemListUI.C43001a.this
                    com.tencent.mm.plugin.shake.ui.ShakeItemListUI r5 = com.tencent.p014mm.plugin.shake.p103ui.ShakeItemListUI.this
                    android.widget.ListView r5 = r5.f116421g
                    r5.setVisibility(r0)
                    com.tencent.mm.plugin.shake.ui.ShakeItemListUI$a r5 = com.tencent.p014mm.plugin.shake.p103ui.ShakeItemListUI.C43001a.this
                    com.tencent.mm.plugin.shake.ui.ShakeItemListUI r5 = com.tencent.p014mm.plugin.shake.p103ui.ShakeItemListUI.this
                    r6 = 2131310041(0x7f0935d9, float:1.8238383E38)
                    android.view.View r5 = r5.findViewById(r6)
                    android.widget.TextView r5 = (android.widget.TextView) r5
                    com.tencent.mm.plugin.shake.ui.ShakeItemListUI$a r6 = com.tencent.p014mm.plugin.shake.p103ui.ShakeItemListUI.C43001a.this
                    com.tencent.mm.plugin.shake.ui.ShakeItemListUI r6 = com.tencent.p014mm.plugin.shake.p103ui.ShakeItemListUI.this
                    int r0 = r6.f116423i
                    int r6 = r6.mo67203H7(r0)
                    r5.setText(r6)
                    r5.setVisibility(r2)
                    com.tencent.mm.plugin.shake.ui.ShakeItemListUI$a r5 = com.tencent.p014mm.plugin.shake.p103ui.ShakeItemListUI.C43001a.this
                    com.tencent.mm.plugin.shake.ui.ShakeItemListUI r5 = com.tencent.p014mm.plugin.shake.p103ui.ShakeItemListUI.this
                    r5.enableOptionMenu(r2)
                    com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct r5 = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct
                    r5.<init>()
                    r6 = 102(0x66, float:1.43E-43)
                    zt3.t r0 = zt3.C119157j.f356862d
                    jn2.a r1 = new jn2.a
                    r1.<init>(r5, r6)
                    zt3.j r0 = (zt3.C119157j) r0
                    r0.getClass()
                    r5 = 0
                    r2 = 100
                    r0.mo183889t(r1, r2, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.shake.p103ui.ShakeItemListUI.C43001a.C43002a.onClick(android.content.DialogInterface, int):void");
            }
        }

        public C43001a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ShakeItemListUI shakeItemListUI = ShakeItemListUI.this;
            C76879j.m92717K(shakeItemListUI, true, shakeItemListUI.getString(C0966R.string.iau), "", ShakeItemListUI.this.getString(C0966R.string.f7930wk), ShakeItemListUI.this.getString(C0966R.string.f7926wf), new C43002a(), (DialogInterface.OnClickListener) null);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeItemListUI$b */
    public class C43003b implements View.OnClickListener {
        public C43003b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0039, code lost:
            if (r0 != 0) goto L_0x00d4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r13) {
            /*
                r12 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r13)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$2"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r12
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.shake.ui.ShakeItemListUI r13 = com.tencent.p014mm.plugin.shake.p103ui.ShakeItemListUI.this
                int r0 = r13.f116423i
                int r0 = ~r0
                r13.f116423i = r0
                com.tencent.mm.plugin.shake.ui.ShakeItemListUI$i r1 = r13.f116420f
                r1.f116438o = r0
                r1.mo1332l()
                r1 = -12
                r2 = 2131313355(0x7f0942cb, float:1.8245104E38)
                r3 = 0
                if (r0 == r1) goto L_0x008a
                r1 = 11
                if (r0 == r1) goto L_0x003d
                r1 = -1
                if (r0 == r1) goto L_0x008a
                if (r0 == 0) goto L_0x003d
                goto L_0x00d4
            L_0x003d:
                android.view.View r13 = r13.f116422h
                if (r13 == 0) goto L_0x00d4
                android.view.View r13 = r13.findViewById(r2)
                r0 = 8
                k20.a r1 = new k20.a
                r1.<init>()
                java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.mo10233c(r0)
                java.lang.Object[] r5 = r1.mo10232b()
                java.lang.String r6 = "com/tencent/mm/plugin/shake/ui/ShakeItemListUI"
                java.lang.String r7 = "setShowType"
                java.lang.String r8 = "(I)V"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setVisibility"
                java.lang.String r11 = "(I)V"
                r4 = r13
                j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
                java.lang.Object r0 = r1.mo10231a(r3)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r13.setVisibility(r0)
                java.lang.String r5 = "com/tencent/mm/plugin/shake/ui/ShakeItemListUI"
                java.lang.String r6 = "setShowType"
                java.lang.String r7 = "(I)V"
                java.lang.String r8 = "android/view/View_EXEC_"
                java.lang.String r9 = "setVisibility"
                java.lang.String r10 = "(I)V"
                j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
                goto L_0x00d4
            L_0x008a:
                android.view.View r13 = r13.f116422h
                if (r13 == 0) goto L_0x00d4
                android.view.View r13 = r13.findViewById(r2)
                k20.a r0 = new k20.a
                r0.<init>()
                java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r0.mo10233c(r1)
                java.lang.Object[] r5 = r0.mo10232b()
                java.lang.String r6 = "com/tencent/mm/plugin/shake/ui/ShakeItemListUI"
                java.lang.String r7 = "setShowType"
                java.lang.String r8 = "(I)V"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setVisibility"
                java.lang.String r11 = "(I)V"
                r4 = r13
                j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
                java.lang.Object r0 = r0.mo10231a(r3)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r13.setVisibility(r0)
                java.lang.String r5 = "com/tencent/mm/plugin/shake/ui/ShakeItemListUI"
                java.lang.String r6 = "setShowType"
                java.lang.String r7 = "(I)V"
                java.lang.String r8 = "android/view/View_EXEC_"
                java.lang.String r9 = "setVisibility"
                java.lang.String r10 = "(I)V"
                j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            L_0x00d4:
                java.lang.String r13 = "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$2"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r12, r13, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.shake.p103ui.ShakeItemListUI.C43003b.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeItemListUI$c */
    public class C43004c implements AdapterView.OnItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f116430d;

        public C43004c(int i) {
            this.f116430d = i;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int i2;
            char c;
            int i3 = i;
            Class cls = C11502f.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/shake/ui/ShakeItemListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C47288f fVar = (C47288f) ShakeItemListUI.this.f116420f.getItem(i3);
            if (fVar == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            C47289g zx02 = C76942m.zx0();
            zx02.getClass();
            fVar.field_insertBatch = 1;
            fVar.f126948p0 = 1024;
            ISQLiteDatabase iSQLiteDatabase = zx02.f126951d;
            ContentValues convertTo = fVar.convertTo();
            if (-1 != iSQLiteDatabase.update("shakeitem1", convertTo, "shakeItemID=? and insertBatch=?", new String[]{"" + fVar.field_shakeItemID, "2"})) {
                zx02.doNotify();
            }
            int i4 = fVar.field_type;
            String str = null;
            if (i4 == 4) {
                String str2 = fVar.field_reserved3;
                if (str2 == null || !str2.equals("newShake")) {
                    ShakeItemListUI shakeItemListUI = ShakeItemListUI.this;
                    shakeItemListUI.getClass();
                    if (C64057o.m75411b(fVar.field_lvbuffer, 0) == null) {
                        shakeItemListUI.mo67204I7(fVar);
                    } else {
                        Intent intent = new Intent();
                        if (C77328l.m93192a()) {
                            C101093a.m132488j(C64057o.m75411b(fVar.field_lvbuffer, 0));
                        } else {
                            C101093a.m132490l();
                            intent.putExtra("key_mode", 1);
                            intent.putExtra("KGlobalShakeMusic", true);
                            C101093a.m132489k(C64057o.m75411b(fVar.field_lvbuffer, 0));
                        }
                        intent.putExtra("key_scene", 3);
                        intent.putExtra("session_id", C21269b.f60082a);
                        C88144b.m109791i(shakeItemListUI, "music", ".ui.MusicMainUI", intent, (Bundle) null);
                        ShakeActionReportStruct shakeActionReportStruct = new ShakeActionReportStruct();
                        C119179t tVar = C119157j.f356862d;
                        C21268a aVar = new C21268a(shakeActionReportStruct, 103);
                        C119157j jVar = (C119157j) tVar;
                        jVar.getClass();
                        jVar.mo183889t(aVar, 100, (String) null);
                    }
                } else {
                    ShakeItemListUI.this.mo67204I7(fVar);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            } else if (i4 == 11) {
                long currentTimeMillis = System.currentTimeMillis();
                ShakeItemListUI shakeItemListUI2 = ShakeItemListUI.this;
                if (currentTimeMillis - shakeItemListUI2.f116418d > 2000) {
                    shakeItemListUI2.f116418d = System.currentTimeMillis();
                    String str3 = fVar.field_reserved3;
                    if (str3 == null || str3.split(",").length != 3 || fVar.field_reserved3.split(",")[0] == null || fVar.field_reserved3.split(",")[0].equals("")) {
                        Intent intent2 = new Intent();
                        intent2.putExtra("rawUrl", fVar.getCity());
                        intent2.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 27);
                        intent2.putExtra("stastic_scene", 5);
                        C88144b.m109791i(MMApplicationContext.getContext(), "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
                    } else {
                        String[] split = fVar.field_reserved3.split(",");
                        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                        StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
                        aVar2.f9526a = split[0];
                        aVar2.f9527b = Util.nullAs(split[1], "");
                        startAppBrandUIFromOuterEvent.f9522d.f9528c = Integer.parseInt(split[2]);
                        startAppBrandUIFromOuterEvent.f9522d.f9529d = C87552j.CTRL_INDEX;
                        startAppBrandUIFromOuterEvent.publish();
                    }
                    if (ShakeItemListUI.this.f116419e) {
                        C48438k.m53791f(fVar);
                        try {
                            str = new String(fVar.field_lvbuffer, "utf-8");
                            c = 1;
                        } catch (UnsupportedEncodingException e) {
                            c = 1;
                            Log.printErrStackTrace("MicroMsg.ShakeIbeaconService", e, "%s", "Unsupported");
                        }
                        if (str != null) {
                            String[] split2 = str.split(",");
                            if (split2.length == 4) {
                                String str4 = split2[c];
                                String str5 = split2[2];
                                String str6 = split2[3];
                                C48438k.C48443e eVar = new C48438k.C48443e();
                                eVar.f129632a = str4;
                                eVar.f129633b = Util.getInt(str5, 0);
                                eVar.f129634c = Util.getInt(str6, 0);
                            }
                        }
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            } else if (C48447s.m53802d(i4)) {
                C48447s.m53801c(fVar, ShakeItemListUI.this, true);
                ShakeActionReportStruct shakeActionReportStruct2 = new ShakeActionReportStruct();
                C119179t tVar2 = C119157j.f356862d;
                C21268a aVar3 = new C21268a(shakeActionReportStruct2, 104);
                C119157j jVar2 = (C119157j) tVar2;
                jVar2.getClass();
                jVar2.mo183889t(aVar3, 100, (String) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            } else {
                String str7 = fVar.field_username;
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str7);
                StringBuilder sb = new StringBuilder();
                sb.append("listView onTtemClick username:");
                sb.append(str7);
                sb.append(" display:");
                sb.append(fVar.field_nickname);
                sb.append(" position:");
                sb.append(i3);
                sb.append(" contactName");
                String str8 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
                sb.append(z1Var.getUsername());
                Log.m105918d("MicroMsg.ShakeItemListUI", sb.toString());
                StringBuilder sb4 = new StringBuilder();
                String str9 = "onItemClick";
                sb4.append("isContact:");
                sb4.append(z1Var.mo62927s3());
                sb4.append("  contact:");
                sb4.append(z1Var);
                Log.m105918d("MicroMsg.ShakeItemListUI", sb4.toString());
                String str10 = "android/widget/AdapterView$OnItemClickListener";
                String str11 = "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$3";
                String str12 = "MicroMsg.ShakeItemListUI";
                String str13 = " contactName";
                if (z1Var.mo62927s3()) {
                    Intent intent3 = new Intent();
                    intent3.putExtra("Contact_User", str7);
                    intent3.putExtra("Contact_Scene", this.f116430d == fVar.field_sex ? 23 : 24);
                    intent3.putExtra("Sns_from_Scene", 22);
                    if (str7 != null && str7.length() > 0) {
                        if (z1Var.mo62916m3()) {
                            C115669n nVar = C115669n.INSTANCE;
                            nVar.kvStat(10298, fVar.field_username + "," + intent3.getIntExtra("Contact_Scene", 23));
                            intent3.putExtra("Contact_Scene", 23);
                        }
                        intent3.putExtra("CONTACT_INFO_UI_SOURCE", 31);
                        intent3.putExtra("CONTACT_INFO_UI_SUB_SOURCE", 3104);
                        ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93174g(intent3, ShakeItemListUI.this);
                    }
                    i2 = i;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("listView onTtemClick username:");
                    sb5.append(str7);
                    sb5.append(" display:");
                    sb5.append(fVar.field_nickname);
                    sb5.append(" position:");
                    i2 = i;
                    sb5.append(i2);
                    sb5.append(str13);
                    sb5.append(z1Var.getUsername());
                    Log.m105918d(str12, sb5.toString());
                    Intent intent4 = new Intent();
                    intent4.putExtra("Contact_User", fVar.field_username);
                    intent4.putExtra("Contact_Nick", fVar.field_nickname);
                    intent4.putExtra("Contact_Distance", fVar.field_distance);
                    intent4.putExtra("Contact_Signature", fVar.field_signature);
                    intent4.putExtra("Contact_Province", fVar.getProvince());
                    intent4.putExtra("Contact_City", fVar.getCity());
                    intent4.putExtra("Contact_Sex", fVar.field_sex);
                    intent4.putExtra("Contact_IsLBSFriend", true);
                    intent4.putExtra("Contact_VUser_Info", fVar.field_reserved3);
                    intent4.putExtra("Contact_VUser_Info_Flag", fVar.field_reserved1);
                    intent4.putExtra("Contact_Scene", this.f116430d == fVar.field_sex ? 23 : 24);
                    intent4.putExtra("Sns_from_Scene", 22);
                    intent4.putExtra("Contact_KSnsIFlag", fVar.field_snsFlag);
                    intent4.putExtra("Contact_KSnsBgUrl", fVar.field_sns_bgurl);
                    if ((fVar.field_reserved1 & 8) > 0) {
                        C115669n nVar2 = C115669n.INSTANCE;
                        nVar2.kvStat(10298, fVar.field_username + "," + intent4.getIntExtra("Contact_Scene", 23));
                    }
                    intent4.putExtra("CONTACT_INFO_UI_SOURCE", 31);
                    intent4.putExtra("CONTACT_INFO_UI_SUB_SOURCE", 3104);
                    ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93174g(intent4, ShakeItemListUI.this);
                }
                ShakeActionReportStruct shakeActionReportStruct3 = new ShakeActionReportStruct();
                shakeActionReportStruct3.f48567h = (long) (i2 + 1);
                shakeActionReportStruct3.f48565f = shakeActionReportStruct3.mo86045b("ToUsername", fVar.field_username, true);
                shakeActionReportStruct3.f48570k = Util.isNullOrNil(fVar.field_signature) ? 1 : 2;
                shakeActionReportStruct3.f48568i = (long) fVar.field_sex;
                shakeActionReportStruct3.f48569j = shakeActionReportStruct3.mo86045b("ToUinDistanceStr", fVar.field_distance, true);
                C119179t tVar3 = C119157j.f356862d;
                C21268a aVar4 = new C21268a(shakeActionReportStruct3, 101);
                C119157j jVar3 = (C119157j) tVar3;
                jVar3.getClass();
                jVar3.mo183889t(aVar4, 100, (String) null);
                C117292a.m165361g(this, str11, str10, str9, str8);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeItemListUI$d */
    public class C43005d implements AdapterView.OnItemLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C45082x0 f116432d;

        public C43005d(C45082x0 x0Var) {
            this.f116432d = x0Var;
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i < ShakeItemListUI.this.f116421g.getHeaderViewsCount()) {
                Log.m105928w("MicroMsg.ShakeItemListUI", "on header view long click, ignore");
                return true;
            }
            C45082x0 x0Var = this.f116432d;
            ShakeItemListUI shakeItemListUI = ShakeItemListUI.this;
            x0Var.mo70437c(view, i, j, shakeItemListUI, shakeItemListUI.f116426o);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeItemListUI$e */
    public class C43006e implements MenuItem.OnMenuItemClickListener {
        public C43006e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ShakeItemListUI.this.hideVKB();
            ShakeItemListUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeItemListUI$f */
    public class C43007f implements View.OnClickListener {
        public C43007f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/shake/ui/ShakeItemListUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ListView listView = ShakeItemListUI.this.f116421g;
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$6", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$6", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeItemListUI$g */
    public class C43008g implements View.OnTouchListener {
        public C43008g() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C46863b bVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/shake/ui/ShakeItemListUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C43010i iVar = ShakeItemListUI.this.f116420f;
            if (!(iVar == null || (bVar = iVar.f116440q) == null)) {
                bVar.mo72073c(motionEvent);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeItemListUI$h */
    public class C43009h implements C11184p0 {
        public C43009h() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C76942m.zx0().mo72322Lo(ShakeItemListUI.this.f116425n);
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeItemListUI$i */
    public class C43010i extends C6975i1<C47288f> {

        /* renamed from: o */
        public int f116438o = 0;

        /* renamed from: p */
        public C46863b.C46867d f116439p = null;

        /* renamed from: q */
        public C46863b f116440q = new C46863b(15, new C43011a(this));

        /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeItemListUI$i$a */
        public class C43011a implements C46863b.C46866c {
            public C43011a(C43010i iVar) {
            }

            /* renamed from: a */
            public Bitmap mo63515a(String str) {
                return ((C76708i) C86312j.m106911c(C76708i.class)).N50(str);
            }
        }

        /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeItemListUI$i$b */
        public class C43012b implements C46863b.C46867d {
            public C43012b() {
            }

            /* renamed from: a */
            public int mo63517a() {
                return C43010i.this.getCount();
            }

            /* renamed from: b */
            public String mo63518b(int i) {
                if (i < 0 || i >= C43010i.this.getCount()) {
                    Log.m105920e("MicroMsg.ShakeFriendAdapter", "pos is invalid");
                    return null;
                }
                C47288f fVar = (C47288f) C43010i.this.getItem(i);
                if (fVar == null) {
                    return null;
                }
                return fVar.field_username;
            }
        }

        /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeItemListUI$i$c */
        public class C43013c {

            /* renamed from: a */
            public ImageView f116443a;

            /* renamed from: b */
            public TextView f116444b;

            /* renamed from: c */
            public View f116445c;

            /* renamed from: d */
            public TextView f116446d;

            /* renamed from: e */
            public ImageView f116447e;

            /* renamed from: f */
            public TextView f116448f;

            /* renamed from: g */
            public TextView f116449g;

            /* renamed from: h */
            public ImageView f116450h;

            /* renamed from: i */
            public TextView f116451i;

            /* renamed from: j */
            public LinearLayout f116452j;

            /* renamed from: k */
            public TextView f116453k;

            public C43013c(C43010i iVar) {
            }

            /* renamed from: a */
            public void mo67215a() {
                ImageView imageView = this.f116443a;
                if (imageView != null) {
                    imageView.setImageDrawable((Drawable) null);
                    this.f116443a.setVisibility(8);
                }
                TextView textView = this.f116444b;
                if (textView != null) {
                    textView.setText("");
                    this.f116444b.setVisibility(8);
                }
                TextView textView2 = this.f116446d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                ImageView imageView2 = this.f116447e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                TextView textView3 = this.f116448f;
                if (textView3 != null) {
                    textView3.setText("");
                    this.f116448f.setVisibility(8);
                }
                TextView textView4 = this.f116449g;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                    View view = this.f116445c;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$ShakeItemListAdapter$ViewHolder", "clear", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$ShakeItemListAdapter$ViewHolder", "clear", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                ImageView imageView3 = this.f116450h;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                TextView textView5 = this.f116451i;
                if (textView5 != null) {
                    textView5.setText("");
                    this.f116451i.setVisibility(8);
                }
            }
        }

        public C43010i(ShakeItemListUI shakeItemListUI) {
            super(shakeItemListUI, new C47288f());
            mo1332l();
        }

        /* renamed from: d */
        public Object mo1330d(Object obj, Cursor cursor) {
            C47288f fVar = (C47288f) obj;
            if (fVar == null) {
                fVar = new C47288f();
            }
            if (cursor != null) {
                fVar.convertFrom(cursor);
            }
            return fVar;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C43013c cVar;
            Class cls = C76979h.class;
            if (this.f116439p == null) {
                this.f116439p = new C43012b();
            }
            C46863b bVar = this.f116440q;
            if (bVar != null) {
                bVar.mo72072b(i, this.f116439p);
            } else {
                int i2 = i;
            }
            if (view == null) {
                cVar = new C43013c(this);
                view2 = View.inflate(this.f24696e, C0966R.C0971layout.bye, (ViewGroup) null);
                cVar.f116443a = (ImageView) view2.findViewById(C0966R.C0970id.h_u);
                cVar.f116444b = (TextView) view2.findViewById(C0966R.C0970id.f358830ha0);
                cVar.f116446d = (TextView) view2.findViewById(C0966R.C0970id.h_x);
                cVar.f116447e = (ImageView) view2.findViewById(C0966R.C0970id.f358832ha2);
                cVar.f116448f = (TextView) view2.findViewById(C0966R.C0970id.h_v);
                cVar.f116449g = (TextView) view2.findViewById(C0966R.C0970id.f358833ha3);
                cVar.f116450h = (ImageView) view2.findViewById(C0966R.C0970id.ha5);
                cVar.f116451i = (TextView) view2.findViewById(C0966R.C0970id.jh7);
                cVar.f116445c = view2.findViewById(C0966R.C0970id.f359097iu1);
                cVar.f116452j = (LinearLayout) view2.findViewById(C0966R.C0970id.jfq);
                cVar.f116453k = (TextView) view2.findViewById(C0966R.C0970id.jfr);
                view2.setTag(cVar);
            } else {
                cVar = (C43013c) view.getTag();
                view2 = view;
            }
            C47288f fVar = (C47288f) getItem(i);
            if (fVar == null) {
                cVar.mo67215a();
                return view2;
            }
            cVar.mo67215a();
            int i3 = fVar.field_type;
            if (4 == i3 || (C48447s.m53802d(i3) && 6 != fVar.field_type)) {
                if (4 != fVar.field_type) {
                    cVar.f116443a.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
                C19239e.m20384b(cVar.f116443a, fVar.field_sns_bgurl, C0966R.raw.app_attach_file_icon_webpage, false);
            } else if (11 == fVar.field_type) {
                ShakeItemListUI.this.f116424j.mo32518g(fVar.getProvince(), cVar.f116443a);
            } else {
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(cVar.f116443a, fVar.field_username);
            }
            cVar.f116443a.setVisibility(0);
            int i4 = fVar.field_type;
            if (7 == i4 || 10 == i4 || 12 == i4 || 13 == i4 || (8 == i4 && Util.isNullOrNil(fVar.field_nickname) && Util.isNullOrNil(fVar.field_username))) {
                if (8 == fVar.field_type) {
                    cVar.f116453k.setText(fVar.field_distance);
                } else {
                    cVar.f116453k.setText(fVar.field_nickname);
                }
                cVar.f116453k.setVisibility(0);
                cVar.f116452j.setVisibility(8);
                return view2;
            }
            cVar.f116453k.setVisibility(8);
            cVar.f116452j.setVisibility(0);
            if (8 == fVar.field_type && Util.isNullOrNil(fVar.field_nickname)) {
                fVar.field_nickname = fVar.field_distance;
                fVar.field_distance = fVar.field_username;
            }
            cVar.f116444b.setText(((C76979h) C86312j.m106911c(cls)).yp0(this.f24696e, Util.nullAsNil(fVar.field_nickname), cVar.f116444b.getTextSize()));
            cVar.f116444b.setVisibility(0);
            int paddingBottom = view2.getPaddingBottom();
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), paddingBottom);
            int i5 = fVar.field_type;
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                cVar.f116451i.setText(fVar.field_nickname);
                cVar.f116451i.setVisibility(0);
                return view2;
            }
            View view3 = cVar.f116445c;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$ShakeItemListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI$ShakeItemListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            cVar.f116448f.setText(fVar.field_distance);
            cVar.f116448f.setVisibility(0);
            String str = fVar.field_signature;
            if (str == null || str.trim().equals("")) {
                cVar.f116449g.setVisibility(8);
            } else {
                cVar.f116449g.setVisibility(0);
                cVar.f116449g.setText(((C76979h) C86312j.m106911c(cls)).yp0(this.f24696e, fVar.field_signature, cVar.f116444b.getTextSize()));
            }
            int i6 = fVar.field_sex;
            if (i6 == 1) {
                cVar.f116447e.setVisibility(0);
                cVar.f116447e.setImageDrawable(C76577a.m92158i(this.f24696e, C0966R.raw.ic_sex_male));
                cVar.f116447e.setContentDescription(this.f24696e.getString(C0966R.string.gms));
            } else if (i6 == 2) {
                cVar.f116447e.setVisibility(0);
                cVar.f116447e.setImageDrawable(C76577a.m92158i(this.f24696e, C0966R.raw.ic_sex_female));
                cVar.f116447e.setContentDescription(this.f24696e.getString(C0966R.string.csp));
            } else {
                cVar.f116447e.setVisibility(8);
            }
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(fVar.field_username);
            if (z1Var == null || !z1Var.mo62927s3()) {
                cVar.f116446d.setVisibility(8);
            } else {
                cVar.f116446d.setVisibility(0);
                if (C72996z1.m85810M4(fVar.field_reserved1)) {
                    cVar.f116446d.setText(this.f24696e.getString(C0966R.string.h5l));
                } else {
                    cVar.f116446d.setText(this.f24696e.getString(C0966R.string.h5q));
                }
            }
            if (6 == fVar.field_type) {
                cVar.f116448f.setText(this.f24696e.getString(C0966R.string.f361350j41));
                cVar.f116446d.setVisibility(8);
            }
            if (fVar.field_reserved1 == 0) {
                cVar.f116450h.setVisibility(8);
                return view2;
            }
            cVar.f116450h.setVisibility(0);
            throw null;
        }

        /* renamed from: l */
        public void mo1332l() {
            mo5580b();
            mo1333o();
        }

        /* renamed from: o */
        public void mo1333o() {
            if (C97625j3.m125811a()) {
                int i = this.f116438o;
                if (i == -12) {
                    C47289g zx02 = C76942m.zx0();
                    int intExtra = ShakeItemListUI.this.getIntent().getIntExtra("_ibeacon_new_insert_size", 2);
                    zx02.getClass();
                    mo7998r(zx02.rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by reserved2 desc, shakeItemID desc limit ? ", "11", "" + intExtra));
                } else if (i == 11) {
                    mo7998r(C76942m.zx0().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by reserved2 desc, shakeItemID desc ", "11"));
                } else if (i == 100) {
                    mo7998r(C76942m.zx0().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   order by shakeItemID desc ", new String[0]));
                } else if (i == -6) {
                    mo7998r(C76942m.zx0().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? and insertBatch = ?  order by shakeItemID desc ", "8", "2"));
                } else if (i == -5) {
                    mo7998r(C76942m.zx0().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? and insertBatch = ?  order by shakeItemID desc ", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, "2"));
                } else if (i == -1) {
                    mo7998r(C76942m.zx0().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? and insertBatch = ?  order by reserved2 desc, shakeItemID desc ", "0", "2"));
                } else if (i == 0) {
                    mo7998r(C76942m.zx0().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by reserved2 desc, shakeItemID desc ", "0"));
                } else if (i == 4) {
                    mo7998r(C76942m.zx0().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by shakeItemID desc ", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL));
                } else if (i == 5) {
                    mo7998r(C76942m.zx0().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type in (?, ?, ?, ?, ?) order by shakeItemID desc ", "7", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN, "8", "9", PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "12"));
                }
                notifyDataSetChanged();
            }
        }
    }

    /* renamed from: H7 */
    public int mo67203H7(int i) {
        return (i == -12 || i == 11) ? C0966R.string.j45 : i != 100 ? i != -6 ? (i == -5 || i == 4) ? C0966R.string.j4v : i != 5 ? C0966R.string.j3y : C0966R.string.j65 : C0966R.string.j65 : C0966R.string.f361351j42;
    }

    /* renamed from: I7 */
    public final void mo67204I7(C47288f fVar) {
        C119179t tVar = C119157j.f356862d;
        C21268a aVar = new C21268a((ShakeActionReportStruct) null, 103);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183889t(aVar, 100, (String) null);
        C51155rt2 rt22 = new C51155rt2();
        try {
            rt22.parseFrom(fVar.field_lvbuffer);
            LinkedList<C50874pt2> linkedList = rt22.f141139i;
            if (linkedList != null) {
                if (linkedList.size() == 1) {
                    C50874pt2 pt22 = rt22.f141139i.get(0);
                    C101106m a = C64057o.m75410a(pt22);
                    Intent intent = new Intent();
                    if (pt22.f139963q != null) {
                        C101093a.m132489k(a);
                        intent.putExtra("key_copyright", true);
                    } else {
                        C101093a.m132489k(a);
                    }
                    intent.putExtra("key_offset", a.f295961f);
                    intent.putExtra("key_pure", pt22.f139971y);
                    intent.putExtra("key_byuser", pt22.f139953d);
                    intent.putExtra("key_history", true);
                    C88144b.m109791i(getContext(), "mv", ".ui.shake.MusicMainUINew", intent, (Bundle) null);
                    return;
                }
            }
            LinkedList<C50874pt2> linkedList2 = rt22.f141139i;
            if (linkedList2 != null && linkedList2.size() > 1) {
                C50874pt2 pt23 = rt22.f141139i.get(0);
                C101106m a2 = C64057o.m75410a(pt23);
                C101093a.m132489k(a2);
                ArrayList arrayList = new ArrayList();
                for (int i = 1; i < rt22.f141139i.size(); i++) {
                    C101106m a3 = C64057o.m75410a(rt22.f141139i.get(i));
                    if (a2 != null) {
                        arrayList.add(a3);
                    }
                }
                Intent intent2 = new Intent();
                intent2.putExtra("key_offset", a2.f295961f);
                intent2.putExtra("key_pure", pt23.f139971y);
                intent2.putExtra("key_recommend_list", arrayList);
                intent2.putExtra("key_byuser", pt23.f139953d);
                intent2.putExtra("key_history", true);
                C88144b.m109791i(getContext(), "mv", ".ui.shake.MusicMainUINew", intent2, (Bundle) null);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ShakeItemListUI", e, "catch Exception in NewShake History", new Object[0]);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.byd;
    }

    public void initView() {
        this.f116424j = new C20828a((Context) this);
        int nullAs = Util.nullAs((Integer) C97625j3.m125812b().mo105906u().mo119684e(12290, (Object) null), 0);
        this.f116423i = getIntent().getIntExtra("_key_show_type_", 0);
        String stringExtra = getIntent().getStringExtra("_key_title_");
        if (!Util.isNullOrNil(stringExtra)) {
            setMMTitle(stringExtra);
        }
        this.f116419e = getIntent().getBooleanExtra("_key_show_from_shake_", false);
        addTextOptionMenu(0, getString(C0966R.string.f7930wk), new C43001a());
        this.f116421g = (ListView) findViewById(C0966R.C0970id.h_z);
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.byf, (ViewGroup) null);
        this.f116422h = inflate;
        inflate.findViewById(C0966R.C0970id.jfl).setOnClickListener(new C43003b());
        this.f116421g.addFooterView(this.f116422h);
        if (this.f116423i == -1) {
            View findViewById = this.f116422h.findViewById(C0966R.C0970id.jfl);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeItemListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View findViewById2 = this.f116422h.findViewById(C0966R.C0970id.jfl);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeItemListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C43010i iVar = new C43010i(this);
        this.f116420f = iVar;
        iVar.f116438o = this.f116423i;
        iVar.mo1332l();
        if (this.f116420f.getCount() <= 0) {
            this.f116421g.setVisibility(8);
            TextView textView = (TextView) findViewById(C0966R.C0970id.f358831ha1);
            textView.setText(mo67203H7(this.f116423i));
            textView.setVisibility(0);
            enableOptionMenu(false);
        } else {
            this.f116421g.setAdapter(this.f116420f);
            this.f116421g.setOnItemClickListener(new C43004c(nullAs));
            this.f116421g.setOnItemLongClickListener(new C43005d(new C45082x0(this)));
        }
        setBackBtn(new C43006e());
        setToTop(new C43007f());
        this.f116421g.setOnTouchListener(new C43008g());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        C76942m.zx0().add(this.f116420f);
        this.f116420f.mo1332l();
        Log.m105924i("MicroMsg.ShakeItemListUI", "onResume");
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        this.f116425n = ((C47288f) this.f116420f.getItem(adapterContextMenuInfo.position)).field_shakeItemID;
        contextMenu.add(adapterContextMenuInfo.position, 0, 0, C0966R.string.f7944x1);
    }

    public void onDestroy() {
        this.f116420f.mo5580b();
        C43010i iVar = this.f116420f;
        C46863b bVar = iVar.f116440q;
        if (bVar != null) {
            bVar.mo72071a();
            iVar.f116440q = null;
        }
        C76942m.zx0().remove(this.f116420f);
        Log.m105924i("MicroMsg.ShakeItemListUI", "onPause");
        C20828a aVar = this.f116424j;
        if (aVar != null) {
            aVar.mo32514c();
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }
}
