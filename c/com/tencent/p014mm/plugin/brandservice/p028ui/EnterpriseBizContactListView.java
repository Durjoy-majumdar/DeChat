package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.p136ui.base.sortview.BaseSortView;
import com.tencent.p014mm.p136ui.base.sortview.C44721b;
import com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizContactListUI;
import com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizEntranceListUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import gc0.C20828a;
import go3.C45940u;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ob0.C11385n;
import p196ln.C76705f;
import p248ug.C52558c;
import p629ny.C76979h;
import qj3.C47864f;
import qo3.C89779i0;
import rb0.C47969h;
import rb0.C48009v0;
import te3.C49566gj;
import te3.ey4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView */
public class EnterpriseBizContactListView extends BaseSortView {

    /* renamed from: A */
    public final EnterpriseBizEntranceListUI.C40630e f109090A = new EnterpriseBizEntranceListUI.C40630e(new C40610a());

    /* renamed from: B */
    public List<C40613d> f109091B;

    /* renamed from: s */
    public String f109092s;

    /* renamed from: t */
    public boolean f109093t;

    /* renamed from: u */
    public C40612c f109094u;

    /* renamed from: v */
    public int f109095v = -1;

    /* renamed from: w */
    public C40615f f109096w;

    /* renamed from: x */
    public C40614e f109097x;

    /* renamed from: y */
    public int f109098y = 0;

    /* renamed from: z */
    public int f109099z = 0;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView$a */
    public class C40610a implements EnterpriseBizEntranceListUI.C40630e.C40631a {
        public C40610a() {
        }

        /* renamed from: a */
        public String mo63506a() {
            return EnterpriseBizContactListView.this.f109092s;
        }

        public Context getContext() {
            return EnterpriseBizContactListView.this.getContext();
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView$b */
    public class C40611b implements C44721b.C44723b {
        public C40611b() {
        }

        /* renamed from: a */
        public View mo63508a(C47864f fVar, View view, ViewGroup viewGroup, int i, int i2, boolean z, boolean z2) {
            C40616g gVar;
            long currentTicks = Util.currentTicks();
            Context context = EnterpriseBizContactListView.this.getContext();
            if (view == null) {
                view = LayoutInflater.from(context).inflate(C0966R.C0971layout.a3k, (ViewGroup) null);
                gVar = new C40616g();
                gVar.f109113e = (TextView) view.findViewById(C0966R.C0970id.ay5);
                gVar.f109112d = view.findViewById(C0966R.C0970id.brg);
                gVar.f109115g = (ImageView) view.findViewById(C0966R.C0970id.f5862qp);
                gVar.f109114f = (ImageView) view.findViewById(C0966R.C0970id.hde);
                gVar.f109116h = (TextView) view.findViewById(C0966R.C0970id.aip);
                gVar.f109117i = view.findViewById(C0966R.C0970id.jab);
                view.setTag(gVar);
            } else {
                gVar = (C40616g) view.getTag();
            }
            C49566gj gjVar = (C49566gj) fVar.f128466b;
            if (gjVar == null) {
                Log.m105920e("MicroMsg.BrandService.EnterpriseBizContactListView", "should not be empty");
                return view;
            }
            boolean s2 = gjVar.f134064f.mo73501s2();
            int i3 = 8;
            if (!EnterpriseBizContactListView.this.f121306p || !z) {
                gVar.f109113e.setVisibility(8);
            } else if (fVar.f128465a.equals("!2")) {
                gVar.f109113e.setText(EnterpriseBizContactListView.this.getContext().getString(C0966R.string.cbd));
                gVar.f109113e.setVisibility(0);
            } else if (fVar.f128465a.equals("!1")) {
                gVar.f109113e.setVisibility(8);
            } else {
                gVar.f109113e.setText(fVar.f128465a);
                gVar.f109113e.setVisibility(0);
            }
            gVar.f109111c = null;
            if (s2) {
                gVar.f109109a = gjVar.f134062d;
                gVar.f109115g.setImageResource(C0966R.raw.enterprise_chat_entry_avatar);
                String string = EnterpriseBizContactListView.this.getResources().getString(C0966R.string.cau);
                EnterpriseBizContactListView enterpriseBizContactListView = EnterpriseBizContactListView.this;
                TextView textView = gVar.f109116h;
                EnterpriseBizContactListView.m43853h(enterpriseBizContactListView, textView, context, string, (int) textView.getTextSize());
            } else {
                if (gjVar instanceof C40613d) {
                    C40613d dVar = (C40613d) gjVar;
                    if (dVar.f109103g) {
                        ey4 ey4 = dVar.f109104h;
                        gVar.f109111c = ey4;
                        gVar.f109110b = ey4.f133176f;
                        C20828a.m22825b().mo32519h(gVar.f109110b, gVar.f109115g, EnterpriseBizEntranceListUI.C40636h.m43871a(context, C0966R.raw.enterprise_chat_entry_avatar));
                        EnterpriseBizContactListView enterpriseBizContactListView2 = EnterpriseBizContactListView.this;
                        TextView textView2 = gVar.f109116h;
                        EnterpriseBizContactListView.m43853h(enterpriseBizContactListView2, textView2, context, gVar.f109111c.f133175e, (int) textView2.getTextSize());
                    }
                }
                String str = gjVar.f134062d;
                gVar.f109109a = str;
                gVar.f109110b = gjVar.f134064f.field_brandIconURL;
                gVar.f109115g.setTag(str);
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(gVar.f109115g, gVar.f109109a);
                String f = gjVar.f134063e.mo62898f();
                EnterpriseBizContactListView enterpriseBizContactListView3 = EnterpriseBizContactListView.this;
                TextView textView3 = gVar.f109116h;
                EnterpriseBizContactListView.m43853h(enterpriseBizContactListView3, textView3, context, f, (int) textView3.getTextSize());
            }
            Log.m105927v("MicroMsg.BrandService.EnterpriseBizContactListView", "bizinfo status%d", Integer.valueOf(gjVar.f134064f.field_status));
            ImageView imageView = gVar.f109114f;
            if (gjVar.f134064f.field_status == 1) {
                i3 = 0;
            }
            imageView.setVisibility(i3);
            if (EnterpriseBizContactListView.this.getMode() != 0 || !z2) {
                gVar.f109117i.setBackgroundResource(C0966R.C0969drawable.bcr);
            } else {
                gVar.f109117i.setBackground((Drawable) null);
            }
            if (EnterpriseBizContactListView.this.f121307q) {
                View view2 = gVar.f109112d;
                view2.setPadding(view2.getPaddingLeft(), gVar.f109112d.getPaddingTop(), (int) EnterpriseBizContactListView.this.getContext().getResources().getDimension(C0966R.dimen.f3621e), gVar.f109112d.getPaddingBottom());
            } else {
                View view3 = gVar.f109112d;
                view3.setPadding(view3.getPaddingLeft(), gVar.f109112d.getPaddingTop(), (int) EnterpriseBizContactListView.this.getContext().getResources().getDimension(C0966R.dimen.f3926j6), gVar.f109112d.getPaddingBottom());
            }
            Log.m105927v("MicroMsg.BrandService.EnterpriseBizContactListView", "get view use %d ms", Long.valueOf(Util.ticksToNow(currentTicks)));
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView$c */
    public interface C40612c {
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView$d */
    public static class C40613d extends C49566gj {

        /* renamed from: i */
        public static ey4 f109102i = new ey4();

        /* renamed from: g */
        public boolean f109103g = false;

        /* renamed from: h */
        public ey4 f109104h = f109102i;
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView$e */
    public static class C40614e implements C11385n {

        /* renamed from: d */
        public String f109105d;

        /* renamed from: e */
        public C45940u f109106e;

        /* renamed from: f */
        public C89779i0 f109107f;

        /* renamed from: g */
        public WeakReference<EnterpriseBizContactListView> f109108g;

        public C40614e(EnterpriseBizContactListView enterpriseBizContactListView) {
            this.f109108g = new WeakReference<>(enterpriseBizContactListView);
        }

        public void finalize() {
            C86709a0.m107524d().mo123470p(1394, this);
            super.finalize();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            r0 = r4.f127055a.f127080a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSceneEnd(int r4, int r5, java.lang.String r6, ob0.C117747y r7) {
            /*
                r3 = this;
                java.lang.Class<f62.k0> r6 = f62.C75700k0.class
                qo3.i0 r0 = r3.f109107f
                if (r0 == 0) goto L_0x0011
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L_0x0011
                qo3.i0 r0 = r3.f109107f
                r0.dismiss()
            L_0x0011:
                if (r4 != 0) goto L_0x0113
                if (r5 == 0) goto L_0x0017
                goto L_0x0113
            L_0x0017:
                int r4 = r7.getType()
                r5 = 1394(0x572, float:1.953E-42)
                if (r4 != r5) goto L_0x0113
                r4 = r7
                ef2.d r4 = (ef2.C45654d) r4
                ob0.c r4 = r4.f123452e
                r5 = 0
                if (r4 == 0) goto L_0x0030
                ob0.c$c r0 = r4.f127055a
                pe3.a r0 = r0.f127080a
                if (r0 == 0) goto L_0x0030
                te3.td4 r0 = (te3.td4) r0
                goto L_0x0031
            L_0x0030:
                r0 = r5
            L_0x0031:
                if (r4 == 0) goto L_0x003c
                ob0.c$d r4 = r4.f127056b
                pe3.a r4 = r4.f127083a
                if (r4 == 0) goto L_0x003c
                r5 = r4
                te3.ud4 r5 = (te3.ud4) r5
            L_0x003c:
                r4 = 0
                r1 = 1
                if (r5 == 0) goto L_0x00dd
                te3.am3 r2 = r5.f142790d
                if (r2 == 0) goto L_0x00dd
                int r2 = r2.f130638d
                if (r2 == 0) goto L_0x004a
                goto L_0x00dd
            L_0x004a:
                boolean r5 = r0.f142140e
                if (r5 != 0) goto L_0x004f
                return
            L_0x004f:
                java.lang.String r5 = r0.f142139d
                ug.c r5 = rb0.C47984k.m53328b(r5)
                int r7 = r5.field_brandFlag
                r7 = r7 | r1
                r5.field_brandFlag = r7
                te3.by2 r7 = new te3.by2
                r7.<init>()
                int r1 = r5.field_brandFlag
                r7.f131388d = r1
                java.lang.String r0 = r0.f142139d
                r7.f131389e = r0
                k40.a r0 = f40.C86709a0.m107533q(r6)
                f62.k0 r0 = (f62.C75700k0) r0
                g62.m r0 = r0.mo96100XW()
                g62.n r1 = new g62.n
                r2 = 47
                r1.<init>(r2, r7)
                tc0.p r0 = (tc0.C77885p) r0
                r0.mo107993q(r1)
                rb0.j r7 = rb0.C48009v0.Fx0()
                java.lang.String[] r4 = new java.lang.String[r4]
                r7.update(r5, (java.lang.String[]) r4)
                k40.a r4 = f40.C86709a0.m107533q(r6)
                f62.k0 r4 = (f62.C75700k0) r4
                com.tencent.mm.storage.v3 r4 = r4.mo96094Ku()
                java.lang.String r7 = r5.field_username
                com.tencent.mm.storage.i2 r4 = (com.tencent.p014mm.storage.C44660i2) r4
                r4.mo69763f(r7)
                k40.a r4 = f40.C86709a0.m107533q(r6)
                f62.k0 r4 = (f62.C75700k0) r4
                com.tencent.mm.storage.v3 r4 = r4.mo96094Ku()
                java.lang.String r7 = r5.field_enterpriseFather
                com.tencent.mm.storage.i2 r4 = (com.tencent.p014mm.storage.C44660i2) r4
                int r4 = r4.mo69740K(r7)
                if (r4 > 0) goto L_0x00bd
                k40.a r4 = f40.C86709a0.m107533q(r6)
                f62.k0 r4 = (f62.C75700k0) r4
                com.tencent.mm.storage.v3 r4 = r4.mo96094Ku()
                java.lang.String r5 = r5.field_enterpriseFather
                com.tencent.mm.storage.i2 r4 = (com.tencent.p014mm.storage.C44660i2) r4
                r4.mo69763f(r5)
                goto L_0x00ce
            L_0x00bd:
                java.lang.Class<rb0.e0> r4 = rb0.C47966e0.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                rb0.e0 r4 = (rb0.C47966e0) r4
                com.tencent.mm.storage.b0 r4 = r4.mo72740wp()
                java.lang.String r5 = r5.field_enterpriseFather
                r4.mo69633b(r5)
            L_0x00ce:
                java.lang.ref.WeakReference<com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView> r4 = r3.f109108g
                java.lang.Object r4 = r4.get()
                com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView r4 = (com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizContactListView) r4
                if (r4 != 0) goto L_0x00d9
                return
            L_0x00d9:
                r4.mo63499i()
                goto L_0x0113
            L_0x00dd:
                java.lang.String r6 = "MicroMsg.BrandService.EnterpriseBizContactListView"
                if (r5 == 0) goto L_0x0102
                te3.am3 r0 = r5.f142790d
                if (r0 == 0) goto L_0x0102
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r7 = r7.getType()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r0[r4] = r7
                te3.am3 r4 = r5.f142790d
                int r4 = r4.f130638d
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r0[r1] = r4
                java.lang.String r4 = "chuangchen onSceneEnd type:%s, err:code:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r4, r0)
                goto L_0x0113
            L_0x0102:
                java.lang.Object[] r5 = new java.lang.Object[r1]
                int r7 = r7.getType()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r5[r4] = r7
                java.lang.String r4 = "chuangchen onSceneEnd type:%s, err:resp == null"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r4, r5)
            L_0x0113:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizContactListView.C40614e.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView$f */
    public interface C40615f {
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView$g */
    public static class C40616g {

        /* renamed from: a */
        public String f109109a;

        /* renamed from: b */
        public String f109110b;

        /* renamed from: c */
        public ey4 f109111c;

        /* renamed from: d */
        public View f109112d;

        /* renamed from: e */
        public TextView f109113e;

        /* renamed from: f */
        public ImageView f109114f;

        /* renamed from: g */
        public ImageView f109115g;

        /* renamed from: h */
        public TextView f109116h;

        /* renamed from: i */
        public View f109117i;
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView$h */
    public class C40617h implements Comparator<C47864f> {
        public C40617h(EnterpriseBizContactListView enterpriseBizContactListView, C40610a aVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
            if (r1 != false) goto L_0x0026;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(java.lang.Object r10, java.lang.Object r11) {
            /*
                r9 = this;
                qj3.f r10 = (qj3.C47864f) r10
                qj3.f r11 = (qj3.C47864f) r11
                java.lang.String r0 = r10.f128465a
                java.lang.String r1 = r11.f128465a
                r2 = 0
                if (r0 == 0) goto L_0x0012
                if (r1 == 0) goto L_0x0012
                int r3 = r0.compareToIgnoreCase(r1)
                goto L_0x0013
            L_0x0012:
                r3 = 0
            L_0x0013:
                r4 = -1
                r5 = 1
                if (r3 == 0) goto L_0x002c
                java.lang.String r10 = "#"
                boolean r11 = r0.equalsIgnoreCase(r10)
                if (r11 == 0) goto L_0x0020
                r3 = 1
            L_0x0020:
                boolean r10 = r1.equalsIgnoreCase(r10)
                if (r10 == 0) goto L_0x0029
            L_0x0026:
                r2 = -1
                goto L_0x0145
            L_0x0029:
                r2 = r3
                goto L_0x0145
            L_0x002c:
                java.lang.Object r10 = r10.f128466b
                te3.gj r10 = (te3.C49566gj) r10
                java.lang.Object r11 = r11.f128466b
                te3.gj r11 = (te3.C49566gj) r11
                if (r0 == 0) goto L_0x0080
                if (r1 == 0) goto L_0x0080
                java.lang.String r1 = "!2"
                boolean r1 = r0.equalsIgnoreCase(r1)
                if (r1 != 0) goto L_0x0048
                java.lang.String r1 = "!1"
                boolean r0 = r0.equalsIgnoreCase(r1)
                if (r0 == 0) goto L_0x0080
            L_0x0048:
                com.tencent.mm.storage.z1 r0 = r10.f134063e
                int r0 = r0.mo62901g3()
                com.tencent.mm.storage.z1 r1 = r11.f134063e
                int r1 = r1.mo62901g3()
                r3 = 90
                r6 = 122(0x7a, float:1.71E-43)
                r7 = 65
                r8 = 97
                if (r0 < r8) goto L_0x0060
                if (r0 <= r6) goto L_0x0065
            L_0x0060:
                if (r0 < r7) goto L_0x0067
                if (r0 <= r3) goto L_0x0065
                goto L_0x0067
            L_0x0065:
                r0 = 0
                goto L_0x0068
            L_0x0067:
                r0 = 1
            L_0x0068:
                if (r1 < r8) goto L_0x006c
                if (r1 <= r6) goto L_0x0071
            L_0x006c:
                if (r1 < r7) goto L_0x0073
                if (r1 <= r3) goto L_0x0071
                goto L_0x0073
            L_0x0071:
                r1 = 0
                goto L_0x0074
            L_0x0073:
                r1 = 1
            L_0x0074:
                if (r0 == 0) goto L_0x007b
                if (r1 != 0) goto L_0x007b
                r2 = 1
                goto L_0x0145
            L_0x007b:
                if (r0 != 0) goto L_0x0080
                if (r1 == 0) goto L_0x0080
                goto L_0x0026
            L_0x0080:
                com.tencent.mm.storage.z1 r0 = r10.f134063e
                if (r0 == 0) goto L_0x00bd
                java.lang.String r0 = r0.mo62945z2()
                if (r0 == 0) goto L_0x00bd
                com.tencent.mm.storage.z1 r0 = r10.f134063e
                java.lang.String r0 = r0.mo62945z2()
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x00bd
                com.tencent.mm.storage.z1 r0 = r11.f134063e
                if (r0 == 0) goto L_0x00bd
                java.lang.String r0 = r0.mo62945z2()
                if (r0 == 0) goto L_0x00bd
                com.tencent.mm.storage.z1 r0 = r11.f134063e
                java.lang.String r0 = r0.mo62945z2()
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x00bd
                com.tencent.mm.storage.z1 r0 = r10.f134063e
                java.lang.String r0 = r0.mo62945z2()
                com.tencent.mm.storage.z1 r1 = r11.f134063e
                java.lang.String r1 = r1.mo62945z2()
                int r0 = r0.compareToIgnoreCase(r1)
                goto L_0x00be
            L_0x00bd:
                r0 = 0
            L_0x00be:
                if (r0 == 0) goto L_0x00c3
            L_0x00c0:
                r2 = r0
                goto L_0x0145
            L_0x00c3:
                com.tencent.mm.storage.z1 r0 = r10.f134063e
                if (r0 == 0) goto L_0x0100
                java.lang.String r0 = r0.getNickname()
                if (r0 == 0) goto L_0x0100
                com.tencent.mm.storage.z1 r0 = r10.f134063e
                java.lang.String r0 = r0.getNickname()
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0100
                com.tencent.mm.storage.z1 r0 = r11.f134063e
                if (r0 == 0) goto L_0x0100
                java.lang.String r0 = r0.getNickname()
                if (r0 == 0) goto L_0x0100
                com.tencent.mm.storage.z1 r0 = r11.f134063e
                java.lang.String r0 = r0.getNickname()
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0100
                com.tencent.mm.storage.z1 r0 = r10.f134063e
                java.lang.String r0 = r0.getNickname()
                com.tencent.mm.storage.z1 r1 = r11.f134063e
                java.lang.String r1 = r1.getNickname()
                int r0 = r0.compareToIgnoreCase(r1)
                goto L_0x0101
            L_0x0100:
                r0 = 0
            L_0x0101:
                if (r0 == 0) goto L_0x0104
                goto L_0x00c0
            L_0x0104:
                com.tencent.mm.storage.z1 r0 = r10.f134063e
                if (r0 == 0) goto L_0x0141
                java.lang.String r0 = r0.getUsername()
                if (r0 == 0) goto L_0x0141
                com.tencent.mm.storage.z1 r0 = r10.f134063e
                java.lang.String r0 = r0.getUsername()
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0141
                com.tencent.mm.storage.z1 r0 = r11.f134063e
                if (r0 == 0) goto L_0x0141
                java.lang.String r0 = r0.getUsername()
                if (r0 == 0) goto L_0x0141
                com.tencent.mm.storage.z1 r0 = r11.f134063e
                java.lang.String r0 = r0.getUsername()
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0141
                com.tencent.mm.storage.z1 r10 = r10.f134063e
                java.lang.String r10 = r10.getUsername()
                com.tencent.mm.storage.z1 r11 = r11.f134063e
                java.lang.String r11 = r11.getUsername()
                int r10 = r10.compareToIgnoreCase(r11)
                goto L_0x0142
            L_0x0141:
                r10 = 0
            L_0x0142:
                if (r10 == 0) goto L_0x0145
                r2 = r10
            L_0x0145:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizContactListView.C40617h.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    public EnterpriseBizContactListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: g */
    public static void m43852g(EnterpriseBizContactListView enterpriseBizContactListView, C52558c cVar, int i) {
        enterpriseBizContactListView.getClass();
        C47969h jo = C48009v0.Ex0().mo72749jo(enterpriseBizContactListView.f109092s);
        long j = 0;
        long j2 = jo != null ? jo.field_wwCorpId : 0;
        if (jo != null) {
            j = jo.field_wwUserVid;
        }
        long o2 = cVar.mo73497o2();
        C115669n.INSTANCE.mo160131h(14507, Long.valueOf(j2), Long.valueOf(o2), Long.valueOf(j), 2, 2, Integer.valueOf(i));
        Log.m105919d("MicroMsg.BrandService.EnterpriseBizContactListView", "enter biz enterprise sub barnd report: %s,%s,%s,%s,%s,%s", Long.valueOf(j2), Long.valueOf(o2), Long.valueOf(j), 1, 2, Integer.valueOf(i));
    }

    private List<C47864f> getSortEntityList() {
        ArrayList arrayList = new ArrayList();
        Cursor DN = C48009v0.Fx0().mo72753DN(this.f109092s, this.f109093t);
        while (DN.moveToNext()) {
            C40613d dVar = new C40613d();
            C72996z1 z1Var = new C72996z1();
            z1Var.convertFrom(DN);
            C52558c cVar = new C52558c();
            cVar.convertFrom(DN);
            dVar.f134062d = z1Var.getUsername();
            dVar.f134063e = z1Var;
            dVar.f134064f = cVar;
            C47864f fVar = new C47864f();
            fVar.f128466b = dVar;
            if (dVar.f134064f.mo73501s2()) {
                fVar.f128465a = "!1";
            } else if (dVar.f134063e.mo62940x3()) {
                fVar.f128465a = "!2";
            } else {
                int g3 = dVar.f134063e.mo62901g3();
                if (g3 >= 97 && g3 <= 122) {
                    g3 -= 32;
                }
                if (g3 < 65 || g3 > 90) {
                    fVar.f128465a = "#";
                } else {
                    fVar.f128465a = ((char) g3) + "";
                }
            }
            arrayList.add(fVar);
        }
        DN.close();
        if (this.f109091B != null) {
            ArrayList arrayList2 = new ArrayList(this.f109091B.size());
            for (C40613d dVar2 : this.f109091B) {
                C47864f fVar2 = new C47864f();
                fVar2.f128466b = dVar2;
                fVar2.f128465a = "!1";
                arrayList2.add(fVar2);
            }
            arrayList.addAll(0, arrayList2);
        }
        this.f109095v = arrayList.size();
        Collections.sort(arrayList, new C40617h(this, (C40610a) null));
        return arrayList;
    }

    /* renamed from: h */
    public static void m43853h(EnterpriseBizContactListView enterpriseBizContactListView, TextView textView, Context context, String str, int i) {
        enterpriseBizContactListView.getClass();
        if (textView != null && !Util.isNullOrNil(str)) {
            try {
                textView.setText(new SpannableString(((C76979h) C86312j.m106911c(C76979h.class)).op0(context, str, i)));
            } catch (Exception unused) {
                textView.setText("");
            }
        }
    }

    /* renamed from: b */
    public View mo63491b() {
        return View.inflate(getContext(), C0966R.C0971layout.a3n, this);
    }

    /* renamed from: c */
    public boolean mo63492c(String str, C47864f fVar) {
        C49566gj gjVar;
        if (Util.isNullOrNil(str) || fVar == null || (gjVar = (C49566gj) fVar.f128466b) == null) {
            return false;
        }
        String f = gjVar.f134063e.mo62898f();
        String y2 = gjVar.f134063e.mo62942y2();
        String z2 = gjVar.f134063e.mo62945z2();
        String upperCase = str.toUpperCase();
        if (!Util.isNullOrNil(f) && f.toUpperCase().indexOf(upperCase) != -1) {
            return true;
        }
        if (Util.isNullOrNil(y2) || y2.toUpperCase().indexOf(upperCase) == -1) {
            return !Util.isNullOrNil(z2) && z2.toUpperCase().startsWith(upperCase);
        }
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f109098y = (int) motionEvent.getRawX();
            this.f109099z = (int) motionEvent.getRawY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getContactCount() {
        return this.f109095v;
    }

    public C44721b.C44723b getItemViewCreator() {
        return new C40611b();
    }

    public ListView getListView() {
        return (ListView) findViewById(C0966R.C0970id.fph);
    }

    public View getNoResultView() {
        TextView textView = (TextView) findViewById(C0966R.C0970id.hgp);
        textView.setText(C0966R.string.cb8);
        return textView;
    }

    public VerticalScrollBar getScrollBar() {
        return (VerticalScrollBar) findViewById(C0966R.C0970id.jkw);
    }

    /* renamed from: i */
    public void mo63499i() {
        List<C47864f> sortEntityList = getSortEntityList();
        C40612c cVar = this.f109094u;
        if (cVar != null) {
            int i = this.f109095v;
            EnterpriseBizContactListUI.C40607b bVar = (EnterpriseBizContactListUI.C40607b) cVar;
            EnterpriseBizContactListUI enterpriseBizContactListUI = EnterpriseBizContactListUI.this;
            if (enterpriseBizContactListUI.f109080g != null) {
                int i2 = 8;
                enterpriseBizContactListUI.f109079f.setVisibility(i > 0 ? 0 : 8);
                View view = EnterpriseBizContactListUI.this.f109080g;
                if (i <= 0) {
                    i2 = 0;
                }
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i2));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListUI$2", "onUpdate", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListUI$2", "onUpdate", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        mo69938e(sortEntityList);
        C44721b bVar2 = this.f121300g;
        bVar2.mo69954b(bVar2.f121310d);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C40615f fVar = this.f109096w;
        if (fVar != null) {
            ((EnterpriseBizSearchUI) fVar).hideVKB();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setEmptyListener(C40612c cVar) {
        this.f109094u = cVar;
    }

    public void setExcludeBizChat(boolean z) {
        this.f109093t = z;
    }

    public void setFatherBizName(String str) {
        this.f109092s = str;
    }

    public void setFixedBrandServiceItem(List<C40613d> list) {
        this.f109091B = list;
    }

    public void setOnTouchListener(C40615f fVar) {
        this.f109096w = fVar;
    }
}
