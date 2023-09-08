package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.location.model.LocationInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di0.C86299o;
import di0.C97479p;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import kr0.C76630x0;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import p755xs.C102720b;
import qo3.C77407n;
import te3.C101857vk;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.s0$$k */
public class s0$$k implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ List f272036d;

    /* renamed from: e */
    public final /* synthetic */ C94167s0 f272037e;

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.s0$$k$a */
    public class C94168a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.location.ui.impl.s0$$k$a$a */
        public class C94169a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ C77407n f272039d;

            /* renamed from: com.tencent.mm.plugin.location.ui.impl.s0$$k$a$a$a */
            public class C94170a implements C102720b.C78973a {

                /* renamed from: d */
                public final /* synthetic */ C76874e0 f272041d;

                /* renamed from: com.tencent.mm.plugin.location.ui.impl.s0$$k$a$a$a$a */
                public class C94171a implements Runnable {

                    /* renamed from: d */
                    public final /* synthetic */ String f272043d;

                    /* renamed from: e */
                    public final /* synthetic */ Bitmap f272044e;

                    public C94171a(String str, Bitmap bitmap) {
                        this.f272043d = str;
                        this.f272044e = bitmap;
                    }

                    public void run() {
                        Bitmap bitmap;
                        if (s0$$k.this.f272037e.f272015S0.containsKey(this.f272043d) && (bitmap = this.f272044e) != null && !bitmap.isRecycled()) {
                            int intValue = s0$$k.this.f272037e.f272015S0.remove(this.f272043d).intValue();
                            if (C94170a.this.f272041d.getItem(intValue) != null) {
                                MenuItem item = C94170a.this.f272041d.getItem(intValue);
                                Bitmap bitmap2 = this.f272044e;
                                item.setIcon(new BitmapDrawable(BitmapUtil.extractThumbNail(BitmapUtil.getRoundedCornerBitmap(bitmap2, false, ((float) bitmap2.getWidth()) / 2.0f, false), s0$$k.this.f272037e.f271948d.getResources().getDimensionPixelOffset(C0966R.dimen.f4181vb), s0$$k.this.f272037e.f271948d.getResources().getDimensionPixelOffset(C0966R.dimen.f4181vb), true, false)));
                                C94169a.this.f272039d.mo107564i();
                            }
                        }
                    }
                }

                public C94170a(C76874e0 e0Var) {
                    this.f272041d = e0Var;
                }

                /* renamed from: j3 */
                public void mo24656j3(String str, Bitmap bitmap) {
                    MMHandlerThread.postToMainThread(new C94171a(str, bitmap));
                }
            }

            public C94169a(C77407n nVar) {
                this.f272039d = nVar;
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                Class cls = C102720b.class;
                this.f272039d.mo107569n(View.inflate(s0$$k.this.f272037e.f271948d, C0966R.C0971layout.c8i, (ViewGroup) null), false);
                for (int i = 0; i < s0$$k.this.f272036d.size(); i++) {
                    C101857vk vkVar = (C101857vk) s0$$k.this.f272036d.get(i);
                    Bitmap N6 = ((C102720b) C86312j.m106911c(cls)).mo142104N6(new C69123r0(vkVar.f299677f));
                    ((C102720b) C86312j.m106911c(cls)).Lu0(new C94170a(e0Var));
                    BitmapDrawable bitmapDrawable = N6 != null ? new BitmapDrawable(BitmapUtil.extractThumbNail(BitmapUtil.getRoundedCornerBitmap(N6, false, ((float) N6.getWidth()) / 2.0f, false), s0$$k.this.f272037e.f271948d.getResources().getDimensionPixelOffset(C0966R.dimen.f4181vb), s0$$k.this.f272037e.f271948d.getResources().getDimensionPixelOffset(C0966R.dimen.f4181vb), true, false)) : null;
                    if (bitmapDrawable == null) {
                        s0$$k.this.f272037e.f272015S0.put(vkVar.f299677f, Integer.valueOf(i));
                    }
                    e0Var.mo107153m(i, vkVar.f299678g, bitmapDrawable, 0);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.location.ui.impl.s0$$k$a$b */
        public class C94172b implements C11184p0 {
            public C94172b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                Class cls = C76630x0.class;
                Log.m105925i("MicroMsg.TrackMapUI", "taxi weapp, index: %s, itemId: %s.", Integer.valueOf(i), Integer.valueOf(menuItem.getItemId()));
                C101857vk vkVar = (C101857vk) s0$$k.this.f272036d.get(i);
                Log.m105925i("MicroMsg.TrackMapUI", "taxi weapp info: appid %s, page_url %s, username %s, version %s, version_type %s.", vkVar.f299676e, vkVar.f299680i, vkVar.f299675d, Integer.valueOf(vkVar.f299681j), Integer.valueOf(vkVar.f299679h));
                C115669n.INSTANCE.mo160131h(12809, 4, "weapp_id_".concat(vkVar.f299676e));
                if (C86312j.m106911c(cls) != null) {
                    C86299o oVar = new C86299o();
                    oVar.f250930b = vkVar.f299676e;
                    oVar.f250929a = vkVar.f299675d;
                    oVar.f250931c = vkVar.f299679h;
                    oVar.f250932d = vkVar.f299681j;
                    oVar.f250934f = vkVar.f299680i;
                    oVar.f250939k = 1146;
                    C97479p pVar = new C97479p();
                    LocationInfo locationInfo = s0$$k.this.f272037e.f271951g;
                    pVar.f286114d = (float) locationInfo.f271930e;
                    pVar.f286115e = (float) locationInfo.f271931f;
                    pVar.f286116f = locationInfo.f271935j;
                    Log.m105925i("MicroMsg.TrackMapUI", "pennqin, extra data: %s.", pVar.mo3693a());
                    oVar.f250937i = pVar;
                    ((C76630x0) C86312j.m106911c(cls)).mo106898tv(s0$$k.this.f272037e.f271948d, oVar);
                }
            }
        }

        public C94168a() {
        }

        public void onClick(View view) {
            Class cls = C76630x0.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/TrackMapUI$9$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (1 == s0$$k.this.f272036d.size()) {
                Log.m105924i("MicroMsg.TrackMapUI", "pennqin, only one taxi weapp.");
                C101857vk vkVar = (C101857vk) s0$$k.this.f272036d.get(0);
                Log.m105925i("MicroMsg.TrackMapUI", "taxi weapp info: appid %s, page_url %s, username %s, version %s, version_type %s.", vkVar.f299676e, vkVar.f299680i, vkVar.f299675d, Integer.valueOf(vkVar.f299681j), Integer.valueOf(vkVar.f299679h));
                C115669n.INSTANCE.mo160131h(12809, 4, "weapp_id_".concat(vkVar.f299676e));
                if (C86312j.m106911c(cls) != null) {
                    C86299o oVar = new C86299o();
                    oVar.f250930b = vkVar.f299676e;
                    oVar.f250929a = vkVar.f299675d;
                    oVar.f250931c = vkVar.f299679h;
                    oVar.f250932d = vkVar.f299681j;
                    oVar.f250934f = vkVar.f299680i;
                    oVar.f250939k = 1146;
                    C97479p pVar = new C97479p();
                    LocationInfo locationInfo = s0$$k.this.f272037e.f271951g;
                    pVar.f286114d = (float) locationInfo.f271930e;
                    pVar.f286115e = (float) locationInfo.f271931f;
                    pVar.f286116f = locationInfo.f271935j;
                    Log.m105925i("MicroMsg.TrackMapUI", "pennqin, extra data: %s.", pVar.mo3693a());
                    oVar.f250937i = pVar;
                    ((C76630x0) C86312j.m106911c(cls)).mo106898tv(s0$$k.this.f272037e.f271948d, oVar);
                    s0$$k.this.f272037e.f272018V.mo107572p();
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$9$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C77407n nVar = new C77407n((Context) s0$$k.this.f272037e.f271948d, 1, true);
            nVar.f225792t1 = true;
            nVar.f225781o1 = true;
            nVar.f225771i = new C94169a(nVar);
            nVar.f225782p = new C94172b();
            s0$$k.this.f272037e.f272018V.mo107572p();
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$9$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public s0$$k(C94167s0 s0Var, List list) {
        this.f272037e = s0Var;
        this.f272036d = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0189, code lost:
        r4 = ((h81.C32735h) di3.C86312j.m106911c(h81.C32735h.class)).mo58779Qe(h81.C32735h.C32737c.clicfg_android_tencent_map_show_max_limit, 99);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateMMMenu(nj3.C76874e0 r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.List r3 = r0.f272036d
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
            r5 = 0
            r6 = 2
            r7 = 1
            java.lang.String r8 = "|"
            if (r3 != 0) goto L_0x00f0
            com.tencent.mm.plugin.location.ui.impl.s0 r3 = r0.f272037e
            android.app.Activity r3 = r3.f271948d
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r9 = 2131497913(0x7f0c13b9, float:1.8619433E38)
            android.widget.FrameLayout r10 = new android.widget.FrameLayout
            com.tencent.mm.plugin.location.ui.impl.s0 r11 = r0.f272037e
            android.app.Activity r11 = r11.f271948d
            r10.<init>(r11)
            android.view.View r3 = r3.inflate(r9, r10, r5)
            r9 = 2131316921(0x7f0950b9, float:1.8252337E38)
            android.view.View r9 = r3.findViewById(r9)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            com.tencent.mm.plugin.location.ui.impl.s0 r10 = r0.f272037e
            android.app.Activity r10 = r10.f271948d
            r11 = 24
            int r10 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r10, r11)
            com.tencent.mm.plugin.location.ui.impl.s0 r11 = r0.f272037e
            android.app.Activity r11 = r11.f271948d
            int r11 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r11, r6)
            hc0.c$b r12 = new hc0.c$b
            r12.<init>()
            r12.f59364t = r7
            r12.f59354j = r10
            r12.f59355k = r10
            hc0.c r12 = r12.mo32666a()
            java.util.List r13 = r0.f272036d
            java.util.Iterator r13 = r13.iterator()
        L_0x005f:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0099
            java.lang.Object r14 = r13.next()
            te3.vk r14 = (te3.C101857vk) r14
            android.widget.ImageView r15 = new android.widget.ImageView
            com.tencent.mm.plugin.location.ui.impl.s0 r6 = r0.f272037e
            android.app.Activity r6 = r6.f271948d
            r15.<init>(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r10, r10)
            r6.leftMargin = r11
            r6.rightMargin = r11
            r9.addView(r15, r6)
            gc0.a r6 = gc0.C20828a.m22825b()
            java.lang.String r4 = r14.f299677f
            r6.mo32519h(r4, r15, r12)
            java.lang.String r4 = "weapp_id_"
            r2.append(r4)
            java.lang.String r4 = r14.f299676e
            r2.append(r4)
            r2.append(r8)
            r6 = 2
            goto L_0x005f
        L_0x0099:
            java.util.List r4 = r0.f272036d
            int r4 = r4.size()
            if (r7 != r4) goto L_0x00e1
            android.widget.TextView r4 = new android.widget.TextView
            com.tencent.mm.plugin.location.ui.impl.s0 r6 = r0.f272037e
            android.app.Activity r6 = r6.f271948d
            r4.<init>(r6)
            com.tencent.mm.plugin.location.ui.impl.s0 r6 = r0.f272037e
            android.app.Activity r6 = r6.f271948d
            android.content.res.Resources r6 = r6.getResources()
            r10 = 2131101252(0x7f060644, float:1.7814908E38)
            int r6 = r6.getColor(r10)
            r4.setTextColor(r6)
            r6 = 1099431936(0x41880000, float:17.0)
            r4.setTextSize(r6)
            r6 = 17
            r4.setGravity(r6)
            java.util.List r6 = r0.f272036d
            java.lang.Object r6 = r6.get(r5)
            te3.vk r6 = (te3.C101857vk) r6
            java.lang.String r6 = r6.f299678g
            r4.setText(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r10 = -2
            r6.<init>(r10, r10)
            r10 = 3
            int r11 = r11 * 3
            r6.leftMargin = r11
            r9.addView(r4, r6)
        L_0x00e1:
            com.tencent.mm.plugin.location.ui.impl.s0$$k$a r4 = new com.tencent.mm.plugin.location.ui.impl.s0$$k$a
            r4.<init>()
            r3.setOnClickListener(r4)
            com.tencent.mm.plugin.location.ui.impl.s0 r4 = r0.f272037e
            qo3.n r4 = r4.f272018V
            r4.mo107567l(r3)
        L_0x00f0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.tencent.mm.plugin.location.ui.impl.s0 r4 = r0.f272037e
            x22.d r6 = r4.f271949e
            com.tencent.mm.plugin.location.model.LocationInfo r9 = r4.f271951g
            r6.getClass()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r11 = "com.tencent.map"
            r10.add(r11)
            java.lang.String r12 = "com.google.android.apps.maps"
            r10.add(r12)
            java.lang.String r12 = "com.baidu.BaiduMap"
            r10.add(r12)
            java.lang.String r12 = "com.autonavi.minimap"
            r10.add(r12)
            java.lang.String r12 = "com.sogou.map.android.maps"
            r10.add(r12)
            r12 = 2
            java.lang.Object[] r13 = new java.lang.Object[r12]
            double r14 = r9.f271930e
            java.lang.Double r12 = java.lang.Double.valueOf(r14)
            r13[r5] = r12
            double r14 = r9.f271931f
            java.lang.Double r9 = java.lang.Double.valueOf(r14)
            r13[r7] = r9
            java.lang.String r9 = "geo:%f,%f"
            java.lang.String r9 = java.lang.String.format(r9, r13)
            android.net.Uri r9 = android.net.Uri.parse(r9)
            android.content.Intent r12 = new android.content.Intent
            java.lang.String r13 = "android.intent.action.VIEW"
            r12.<init>(r13, r9)
            android.content.Context r9 = r6.f261352a
            android.content.pm.PackageManager r9 = r9.getPackageManager()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            r14 = 65536(0x10000, float:9.18355E-41)
            java.util.List r9 = r9.queryIntentActivities(r12, r14)
            java.util.Iterator r9 = r9.iterator()
        L_0x0155:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x0181
            java.lang.Object r12 = r9.next()
            android.content.pm.ResolveInfo r12 = (android.content.pm.ResolveInfo) r12
            android.content.pm.ActivityInfo r14 = r12.activityInfo
            java.lang.String r14 = r14.packageName
            boolean r14 = r10.contains(r14)
            if (r14 == 0) goto L_0x0155
            android.content.pm.ActivityInfo r12 = r12.activityInfo
            java.lang.String r14 = r12.packageName
            android.content.Context r15 = r6.f261352a
            android.content.pm.PackageManager r15 = r15.getPackageManager()
            java.lang.CharSequence r12 = r12.loadLabel(r15)
            java.lang.String r12 = r12.toString()
            r13.put(r14, r12)
            goto L_0x0155
        L_0x0181:
            r4.f272019W = r13
            boolean r4 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.isGPVersion()
            if (r4 != 0) goto L_0x01a1
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            h81.h r4 = (h81.C32735h) r4
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_android_tencent_map_show_max_limit
            r9 = 99
            int r4 = r4.mo58779Qe(r6, r9)
            com.tencent.mm.plugin.location.ui.impl.s0 r6 = r0.f272037e
            int r6 = r6.f272020X
            if (r6 >= r4) goto L_0x01a1
            r4 = 1
            goto L_0x01a2
        L_0x01a1:
            r4 = 0
        L_0x01a2:
            if (r4 != 0) goto L_0x01be
            com.tencent.mm.plugin.location.ui.impl.s0 r6 = r0.f272037e
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f272019W
            boolean r6 = r6.containsKey(r11)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            r9[r5] = r10
            java.lang.String r10 = "MicroMsg.TrackMapUI"
            java.lang.String r12 = "install tencent map: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r12, r9)
            if (r6 == 0) goto L_0x01be
            r4 = 1
        L_0x01be:
            if (r4 == 0) goto L_0x01cd
            r3.append(r11)
            r3.append(r8)
            r4 = 2131837838(0x7f11438e, float:1.9308882E38)
            r6 = 2
            r1.mo107135b(r6, r4, r5)
        L_0x01cd:
            com.tencent.mm.plugin.location.ui.impl.s0 r4 = r0.f272037e
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f272019W
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            r10 = 3
        L_0x01da:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x020a
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r9 = r6.getKey()
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0207
            java.lang.Object r9 = r6.getKey()
            java.lang.String r9 = (java.lang.String) r9
            r3.append(r9)
            r3.append(r8)
            java.lang.Object r6 = r6.getValue()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r1.mo107144g(r10, r6, r5)
        L_0x0207:
            int r10 = r10 + 1
            goto L_0x01da
        L_0x020a:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 12809(0x3209, float:1.7949E-41)
            r6 = 3
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8[r5] = r6
            java.lang.String r3 = r3.toString()
            r8[r7] = r3
            java.lang.String r2 = r2.toString()
            r3 = 2
            r8[r3] = r2
            r1.mo160131h(r4, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.location.p069ui.impl.s0$$k.onCreateMMMenu(nj3.e0):void");
    }
}
