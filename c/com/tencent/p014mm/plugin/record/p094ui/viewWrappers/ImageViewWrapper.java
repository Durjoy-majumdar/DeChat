package com.tencent.p014mm.plugin.record.p094ui.viewWrappers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.record.p094ui.C94356i;
import com.tencent.p014mm.plugin.record.p094ui.RecordMsgImageUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k20.C9556a;
import p200lx.C46896e0;
import p200lx.C46900z;
import pb1.C100734q;
import pb1.C100755z;
import qg2.C101147j0;
import qo3.C77407n;
import sg2.C101616a;
import sg2.C101617b;
import te3.C101834rc0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.ImageViewWrapper */
public class ImageViewWrapper implements C94356i.C94363d {

    /* renamed from: a */
    public ListView f272758a;

    /* renamed from: b */
    public C94356i.C94359c f272759b;

    /* renamed from: c */
    public int f272760c;

    /* renamed from: d */
    public C77407n f272761d;

    /* renamed from: e */
    public int f272762e = 0;

    /* renamed from: f */
    public Map<String, C94378e> f272763f = new HashMap();

    /* renamed from: g */
    public C46900z f272764g;

    /* renamed from: h */
    public int f272765h = -1;

    /* renamed from: i */
    public int f272766i = -1;

    /* renamed from: j */
    public View.OnClickListener f272767j = new C94374b();

    /* renamed from: k */
    public View.OnLongClickListener f272768k = new C94375c();

    /* renamed from: l */
    public IListener f272769l;

    /* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.ImageViewWrapper$a */
    public class C94373a implements C46900z.C46901a {
        public C94373a() {
        }

        /* renamed from: a */
        public void mo64788a() {
            C77407n nVar = ImageViewWrapper.this.f272761d;
            if (nVar != null && nVar.mo107563h()) {
                ((C94375c) ImageViewWrapper.this.f272768k).onLongClick((View) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.ImageViewWrapper$b */
    public class C94374b implements View.OnClickListener {
        public C94374b() {
        }

        public void onClick(View view) {
            Bundle bundleExtra;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101617b bVar = (C101617b) view.getTag();
            Log.m105919d("justin", "ImageViewWrapper clickListener %s", Integer.valueOf(bVar.f297468e));
            int i = bVar.f297468e;
            if (i == 0) {
                Intent intent = new Intent(view.getContext(), RecordMsgImageUI.class);
                intent.putExtra("message_id", bVar.f297466c);
                intent.putExtra("record_data_id", bVar.f297464a.f299280T);
                intent.putExtra("record_xml", bVar.f297467d);
                intent.putExtra("from_scene", ImageViewWrapper.this.f272766i);
                intent.putExtra("chatTypeForAppbrand", ImageViewWrapper.this.f272765h);
                if (!(!(view.getContext() instanceof Activity) || ((Activity) view.getContext()).getIntent() == null || (bundleExtra = ((Activity) view.getContext()).getIntent().getBundleExtra("_stat_obj")) == null)) {
                    intent.putExtra("_stat_obj", bundleExtra);
                }
                Context context = view.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (i == 1) {
                Intent intent2 = new Intent();
                intent2.putExtra("key_detail_info_id", bVar.f297465b.field_localId);
                intent2.putExtra("key_detail_data_id", bVar.f297464a.f299280T);
                C100734q.m131877u0(view.getContext(), ".ui.FavImgGalleryUI", intent2, 1, (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.ImageViewWrapper$c */
    public class C94375c implements View.OnLongClickListener {

        /* renamed from: d */
        public Context f272773d;

        /* renamed from: e */
        public C101617b f272774e;

        /* renamed from: f */
        public C100755z f272775f;

        /* renamed from: g */
        public C101834rc0 f272776g;

        /* renamed from: h */
        public String f272777h;

        public C94375c() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            if (view != null) {
                this.f272773d = view.getContext();
                C101617b bVar = (C101617b) view.getTag();
                this.f272774e = bVar;
                this.f272775f = bVar.f297465b;
                this.f272776g = bVar.f297464a;
            }
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
            aVar.f264835a = 2;
            aVar.f264840f = this.f272774e.f297464a;
            favoriteOperationEvent.publish();
            String str = favoriteOperationEvent.f264834e.f264857c;
            this.f272777h = str;
            if (!C86013q1.m106450k(str)) {
                Log.m105928w("MicroMsg.ImageViewWrapper", "file not exists");
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
            ImageViewWrapper imageViewWrapper = ImageViewWrapper.this;
            if (imageViewWrapper.f272761d == null) {
                imageViewWrapper.f272761d = new C77407n(this.f272773d, 1, false);
            }
            C77407n nVar = ImageViewWrapper.this.f272761d;
            nVar.f225771i = new C94380a(this);
            nVar.f225782p = new C94381b(this);
            nVar.f225761d = new C94384c(this);
            nVar.mo107573q();
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.ImageViewWrapper$d */
    public class C94376d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101617b f272779d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f272780e;

        /* renamed from: f */
        public final /* synthetic */ ProgressBar f272781f;

        /* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.ImageViewWrapper$d$a */
        public class C94377a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f272783d;

            /* renamed from: e */
            public final /* synthetic */ int f272784e;

            public C94377a(Bitmap bitmap, int i) {
                this.f272783d = bitmap;
                this.f272784e = i;
            }

            public void run() {
                C94376d dVar = C94376d.this;
                ImageViewWrapper imageViewWrapper = ImageViewWrapper.this;
                ImageView imageView = dVar.f272780e;
                ProgressBar progressBar = dVar.f272781f;
                Bitmap bitmap = this.f272783d;
                C101617b bVar = dVar.f272779d;
                imageViewWrapper.mo129765c(imageView, progressBar, bitmap, ((C101616a) bVar).f297463j, this.f272784e, bVar.f297464a.f299280T);
            }
        }

        public C94376d(C101617b bVar, ImageView imageView, ProgressBar progressBar) {
            this.f272779d = bVar;
            this.f272780e = imageView;
            this.f272781f = progressBar;
        }

        public void run() {
            Bitmap bitmap;
            C101616a aVar = (C101616a) this.f272779d;
            int i = aVar.f297468e;
            int i2 = (i != 0 ? i != 1 || !Util.isNullOrNil(aVar.f297464a.f299325s) : !C101147j0.m132628i(aVar.f297464a, aVar.f297466c)) ? -1 : C0966R.raw.record_errpicture_icon;
            if (i2 == -1) {
                i2 = C0966R.raw.fav_list_img_default;
            }
            C101616a aVar2 = (C101616a) this.f272779d;
            ImageViewWrapper imageViewWrapper = ImageViewWrapper.this;
            C94356i.C94359c cVar = imageViewWrapper.f272759b;
            int i3 = imageViewWrapper.f272760c;
            C94356i.C94359c.C94361b bVar = new C94356i.C94359c.C94361b();
            C101834rc0 rc02 = aVar2.f297464a;
            bVar.f272736a = rc02;
            bVar.f272739d = false;
            bVar.f272738c = i3;
            C94356i.C94359c.C94362c cVar2 = new C94356i.C94359c.C94362c();
            cVar2.f272740a = rc02;
            int i4 = aVar2.f297468e;
            if (i4 == 0) {
                if (!C101147j0.m132628i(rc02, aVar2.f297466c)) {
                    bVar.f272737b = aVar2.f297466c;
                    bitmap = cVar.mo129735a(bVar);
                    aVar2.f297463j = true;
                    if (bitmap == null) {
                        cVar2.f272741b = aVar2.f297466c;
                        bitmap = cVar.mo129736b(cVar2);
                        aVar2.f297463j = false;
                    }
                    MMHandlerThread.postToMainThread(new C94377a(bitmap, i2));
                }
            } else if (i4 == 1) {
                bVar.f272737b = aVar2.f297465b.field_localId;
                bitmap = cVar.mo129735a(bVar);
                aVar2.f297463j = true;
                if (bitmap == null) {
                    cVar2.f272741b = aVar2.f297465b.field_localId;
                    bitmap = cVar.mo129736b(cVar2);
                    aVar2.f297463j = false;
                }
                MMHandlerThread.postToMainThread(new C94377a(bitmap, i2));
            }
            bitmap = null;
            MMHandlerThread.postToMainThread(new C94377a(bitmap, i2));
        }

        public String toString() {
            return super.toString() + "|fillView";
        }
    }

    /* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.ImageViewWrapper$e */
    public static final class C94378e {

        /* renamed from: a */
        public RecogQBarOfImageFileResultEvent f272786a;

        /* renamed from: b */
        public boolean f272787b;
    }

    public ImageViewWrapper(C94356i.C94359c cVar, ListView listView) {
        C943726 r0 = new IListener<RecogQBarOfImageFileResultEvent>(C40008f.f107254d) {
            {
                this.__eventId = 812146647;
            }

            public boolean callback(IEvent iEvent) {
                RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) iEvent;
                String str = recogQBarOfImageFileResultEvent.f265015d.f265016a;
                C94378e eVar = new C94378e();
                eVar.f272786a = recogQBarOfImageFileResultEvent;
                ((HashMap) ImageViewWrapper.this.f272763f).put(str, eVar);
                C77407n nVar = ImageViewWrapper.this.f272761d;
                if (nVar == null || !nVar.mo107563h()) {
                    return true;
                }
                ((C94375c) ImageViewWrapper.this.f272768k).onLongClick((View) null);
                return true;
            }
        };
        this.f272769l = r0;
        this.f272759b = cVar;
        this.f272758a = listView;
        r0.alive();
        this.f272764g = ((C46896e0) C86312j.m106911c(C46896e0.class)).mo71986Hu(listView.getContext(), new C94373a());
    }

    /* renamed from: a */
    public void mo129755a(View view, int i, C101617b bVar, Object obj) {
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.iht);
        ProgressBar progressBar = (ProgressBar) view.findViewById(C0966R.C0970id.g3h);
        imageView.setTag(bVar);
        imageView.setOnClickListener(this.f272767j);
        if (bVar.f297468e == 1) {
            imageView.setOnLongClickListener(this.f272768k);
        }
        C94356i.C94359c.C94361b bVar2 = new C94356i.C94359c.C94361b();
        int i2 = bVar.f297468e;
        if (i2 == 0) {
            bVar2.f272737b = bVar.f297466c;
        } else if (i2 == 1) {
            bVar2.f272737b = bVar.f297465b.field_localId;
        }
        bVar2.f272736a = bVar.f297464a;
        bVar2.f272739d = true;
        bVar2.f272738c = this.f272762e;
        Bitmap a = this.f272759b.mo129735a(bVar2);
        if (a != null) {
            Log.m105919d("MicroMsg.ImageViewWrapper", "get from dataId %s, cache %s", bVar2.f272736a.f299280T, a);
            mo129765c(imageView, progressBar, a, true, 0, bVar.f297464a.f299280T);
            return;
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C94376d(bVar, imageView, progressBar));
    }

    /* renamed from: b */
    public View mo129756b(Context context) {
        View inflate = View.inflate(context, C0966R.C0971layout.bqg, (ViewGroup) null);
        int a = ((context == null || !(context instanceof MMActivity)) ? MMApplicationContext.getResources().getDisplayMetrics() : ((MMActivity) context).getOriginalResources().getDisplayMetrics()).widthPixels - C74942w4.m89784a(context, 80);
        this.f272762e = a;
        int max = Math.max(a, 0);
        this.f272762e = max;
        if (max == 0) {
            this.f272762e = C74942w4.m89784a(context, C0947jz.f2205e);
        }
        this.f272760c = this.f272762e;
        return inflate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0163  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo129765c(android.widget.ImageView r19, android.widget.ProgressBar r20, android.graphics.Bitmap r21, boolean r22, int r23, java.lang.String r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r24
            java.lang.Object r5 = r19.getTag()
            sg2.b r5 = (sg2.C101617b) r5
            te3.rc0 r5 = r5.f297464a
            java.lang.String r5 = r5.f299280T
            boolean r5 = r5.equals(r4)
            java.lang.String r6 = "MicroMsg.ImageViewWrapper"
            r7 = 1
            r8 = 2
            r9 = 0
            if (r5 != 0) goto L_0x0030
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r9] = r4
            java.lang.Object r1 = r19.getTag()
            r2[r7] = r1
            java.lang.String r1 = "scroll over to next img. old tag %s, now tag %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r1, r2)
            return
        L_0x0030:
            if (r3 != 0) goto L_0x004d
            android.view.ViewGroup$LayoutParams r3 = r19.getLayoutParams()
            int r4 = r0.f272762e
            r3.height = r4
            r3.width = r4
            r3 = 2131099649(0x7f060001, float:1.7811657E38)
            r1.setBackgroundResource(r3)
            r3 = 2131231565(0x7f08034d, float:1.8079215E38)
            r1.setImageResource(r3)
            r2.setVisibility(r9)
            goto L_0x016f
        L_0x004d:
            r4 = 8
            r2.setVisibility(r4)
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r4 = r21.getWidth()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r9] = r4
            int r4 = r21.getHeight()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r7] = r4
            int r4 = r19.getWidth()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r8] = r4
            r4 = 3
            int r5 = r19.getHeight()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r4] = r5
            java.lang.String r4 = "update view bmp[%d, %d], iv[%d, %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r4, r2)
            android.view.ViewGroup$LayoutParams r2 = r19.getLayoutParams()
            int r4 = r21.getWidth()
            int r5 = r21.getHeight()
            r6 = 2131165216(0x7f070020, float:1.7944643E38)
            r10 = 2131165218(0x7f070022, float:1.7944647E38)
            r11 = 1073741824(0x40000000, float:2.0)
            if (r5 < r4) goto L_0x00f7
            float r5 = (float) r5
            float r4 = (float) r4
            float r5 = r5 / r4
            if (r22 == 0) goto L_0x00b1
            int r4 = r0.f272762e
            int r5 = r21.getHeight()
            int r5 = r5 * r4
            float r5 = (float) r5
            int r6 = r21.getWidth()
        L_0x00ac:
            float r6 = (float) r6
            float r5 = r5 / r6
            int r5 = (int) r5
            goto L_0x0151
        L_0x00b1:
            double r12 = (double) r5
            r14 = 4612811918334230528(0x4004000000000000, double:2.5)
            r4 = 1075838976(0x40200000, float:2.5)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x00da
            int r5 = r21.getHeight()
            int r12 = r21.getWidth()
            float r12 = (float) r12
            float r12 = r12 * r4
            int r12 = (int) r12
            int r5 = r5 - r12
            int r5 = r5 / r8
            int r8 = r21.getWidth()
            int r12 = r21.getWidth()
            float r12 = (float) r12
            float r12 = r12 * r4
            int r12 = (int) r12
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r9, r5, r8, r12)
            r5 = 1075838976(0x40200000, float:2.5)
        L_0x00da:
            int r4 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x00ea
            android.content.Context r4 = r19.getContext()
            int r4 = kg3.C76577a.m92155f(r4, r6)
            float r6 = (float) r4
            float r6 = r6 / r5
            int r5 = (int) r6
            goto L_0x013f
        L_0x00ea:
            android.content.Context r4 = r19.getContext()
            int r4 = kg3.C76577a.m92155f(r4, r10)
            float r6 = (float) r4
            float r6 = r6 * r5
            int r5 = (int) r6
            goto L_0x0151
        L_0x00f7:
            float r4 = (float) r4
            float r5 = (float) r5
            float r4 = r4 / r5
            r5 = 1075125944(0x40151eb8, float:2.33)
            int r12 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r12 <= 0) goto L_0x011f
            int r12 = r21.getWidth()
            int r13 = r21.getHeight()
            float r13 = (float) r13
            float r13 = r13 * r5
            int r13 = (int) r13
            int r12 = r12 - r13
            int r12 = r12 / r8
            int r8 = r21.getHeight()
            float r8 = (float) r8
            float r8 = r8 * r5
            int r5 = (int) r8
            int r8 = r21.getHeight()
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r12, r9, r5, r8)
        L_0x011f:
            if (r22 == 0) goto L_0x0130
            int r4 = r0.f272762e
            int r5 = r3.getHeight()
            int r5 = r5 * r4
            float r5 = (float) r5
            int r6 = r3.getWidth()
            goto L_0x00ac
        L_0x0130:
            int r5 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r5 > 0) goto L_0x0145
            android.content.Context r5 = r19.getContext()
            int r5 = kg3.C76577a.m92155f(r5, r6)
            float r6 = (float) r5
            float r6 = r6 / r4
            int r4 = (int) r6
        L_0x013f:
            r17 = r5
            r5 = r4
            r4 = r17
            goto L_0x0151
        L_0x0145:
            android.content.Context r5 = r19.getContext()
            int r5 = kg3.C76577a.m92155f(r5, r10)
            float r6 = (float) r5
            float r6 = r6 * r4
            int r4 = (int) r6
        L_0x0151:
            r2.width = r4
            r2.height = r5
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_XY
            r1.setScaleType(r2)
            com.tencent.p014mm.sdk.platformtools.ForceGpuUtil.decideLayerType(r1, r4, r5)
            int r2 = r19.getLayerType()
            if (r2 != r7) goto L_0x0169
            android.widget.ListView r2 = r0.f272758a
            r4 = 0
            r2.setLayerType(r7, r4)
        L_0x0169:
            r1.setImageBitmap(r3)
            r1.setBackgroundResource(r9)
        L_0x016f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.record.p094ui.viewWrappers.ImageViewWrapper.mo129765c(android.widget.ImageView, android.widget.ProgressBar, android.graphics.Bitmap, boolean, int, java.lang.String):void");
    }

    public void destroy() {
        this.f272769l.dead();
    }

    public void pause() {
    }
}
