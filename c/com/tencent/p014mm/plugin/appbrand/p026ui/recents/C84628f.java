package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.appusage.C81526t1;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k20.C60958c;
import k20.C9556a;
import lb0.C88394b;
import te3.C49962j90;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.f */
public abstract class C84628f extends C84620b implements View.OnClickListener {

    /* renamed from: e */
    public FragmentActivity f246909e;

    /* renamed from: f */
    public ViewGroup f246910f;

    /* renamed from: g */
    public ImageView f246911g = ((ImageView) this.f246910f.findViewById(C0966R.C0970id.f5882ra));

    /* renamed from: h */
    public WeImageView f246912h = ((WeImageView) this.f246910f.findViewById(C0966R.C0970id.f15));

    /* renamed from: i */
    public View f246913i;

    /* renamed from: j */
    public ImageView f246914j;

    /* renamed from: n */
    public MMAnimateView f246915n;

    /* renamed from: o */
    public TextView f246916o;

    /* renamed from: p */
    public View f246917p = this.f246910f.findViewById(C0966R.C0970id.iis);

    /* renamed from: q */
    public C49962j90 f246918q;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.f$a */
    public class C84629a implements C84631b.C84632a {

        /* renamed from: a */
        public final /* synthetic */ C49962j90 f246919a;

        /* renamed from: b */
        public final /* synthetic */ C81526t1.C81529c f246920b;

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.f$a$a */
        public class C84630a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f246922d;

            /* renamed from: e */
            public final /* synthetic */ byte[] f246923e;

            public C84630a(Bitmap bitmap, byte[] bArr) {
                this.f246922d = bitmap;
                this.f246923e = bArr;
            }

            public void run() {
                C84629a aVar = C84629a.this;
                C84628f fVar = C84628f.this;
                C49962j90 j902 = aVar.f246919a;
                C81526t1.C81529c cVar = aVar.f246920b;
                Bitmap bitmap = this.f246922d;
                byte[] bArr = this.f246923e;
                boolean z = fVar.f246913i.getVisibility() != 0;
                int ordinal = cVar.ordinal();
                if (ordinal == 0) {
                    View view = fVar.f246913i;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    fVar.f246915n.mo129237x();
                } else if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4 && bArr != null && bArr.length != 0 && !TextUtils.isEmpty(j902.f135939g)) {
                                View view2 = fVar.f246913i;
                                C9556a aVar3 = new C9556a();
                                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                aVar3.mo10233c(0);
                                View view3 = view2;
                                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(view3, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                fVar.f246914j.setVisibility(8);
                                fVar.f246916o.setVisibility(0);
                                fVar.f246915n.setVisibility(0);
                                fVar.f246916o.setText(j902.f135939g);
                                fVar.f246915n.mo129233t(bArr, "");
                                fVar.f246915n.mo129236w();
                                if (z) {
                                    fVar.mo117340o();
                                }
                            }
                        } else if (bitmap != null && bArr != null && bArr.length != 0 && !TextUtils.isEmpty(j902.f135939g)) {
                            View view4 = fVar.f246913i;
                            C9556a aVar4 = new C9556a();
                            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                            aVar4.mo10233c(0);
                            View view5 = view4;
                            C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                            C117292a.m165359e(view5, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            fVar.f246914j.setVisibility(0);
                            fVar.f246916o.setVisibility(0);
                            fVar.f246915n.setVisibility(0);
                            fVar.f246914j.setImageBitmap(bitmap);
                            fVar.f246916o.setText(j902.f135939g);
                            fVar.f246915n.mo129233t(bArr, "");
                            fVar.f246915n.mo129236w();
                            if (z) {
                                fVar.mo117340o();
                            }
                        }
                    } else if (bitmap != null && !TextUtils.isEmpty(j902.f135939g)) {
                        View view6 = fVar.f246913i;
                        C9556a aVar5 = new C9556a();
                        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                        aVar5.mo10233c(0);
                        View view7 = view6;
                        C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view6.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view7, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        fVar.f246914j.setVisibility(0);
                        fVar.f246916o.setVisibility(0);
                        fVar.f246915n.setVisibility(8);
                        fVar.f246914j.setImageBitmap(bitmap);
                        fVar.f246916o.setText(j902.f135939g);
                        fVar.f246915n.mo129237x();
                        if (z) {
                            fVar.mo117340o();
                        }
                    }
                } else if (!TextUtils.isEmpty(j902.f135939g)) {
                    View view8 = fVar.f246913i;
                    C9556a aVar6 = new C9556a();
                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                    aVar6.mo10233c(0);
                    View view9 = view8;
                    C117292a.m165358d(view9, aVar6.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view9, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "innerShowShowCaseView", "(Lcom/tencent/mm/protocal/protobuf/EntranceInfo;Lcom/tencent/mm/plugin/appbrand/appusage/WxaDesktopHeaderEntranceLogic$ShowCaseType;Landroid/graphics/Bitmap;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    fVar.f246914j.setVisibility(8);
                    fVar.f246916o.setVisibility(0);
                    fVar.f246915n.setVisibility(8);
                    fVar.f246915n.mo129237x();
                    fVar.f246916o.setText(j902.f135939g);
                    if (z) {
                        fVar.mo117340o();
                    }
                }
            }
        }

        public C84629a(C49962j90 j902, C81526t1.C81529c cVar) {
            this.f246919a = j902;
            this.f246920b = cVar;
        }

        /* renamed from: a */
        public void mo117341a(Bitmap bitmap, byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("[LoadShowcaseImageTask#onLoadDone]  bitmap == null ");
            int i = 0;
            sb.append(bitmap == null);
            sb.append(" rightImageBytes length=");
            if (bArr != null) {
                i = bArr.length;
            }
            sb.append(i);
            Log.m105924i("AppBrandLauncherListHeaderFolderEntrance", sb.toString());
            MMHandlerThread.postToMainThread(new C84630a(bitmap, bArr));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.f$b */
    public static class C84631b {

        /* renamed from: a */
        public final String f246925a;

        /* renamed from: b */
        public final String f246926b;

        /* renamed from: c */
        public final C84632a f246927c;

        /* renamed from: d */
        public final AtomicInteger f246928d;

        /* renamed from: e */
        public Bitmap f246929e = null;

        /* renamed from: f */
        public byte[] f246930f = null;

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.f$b$a */
        public interface C84632a {
        }

        public C84631b(String str, String str2, C84632a aVar) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f246928d = atomicInteger;
            this.f246925a = str;
            this.f246926b = str2;
            this.f246927c = aVar;
            if (!TextUtils.isEmpty(str)) {
                atomicInteger.incrementAndGet();
            }
            if (!TextUtils.isEmpty(str2)) {
                atomicInteger.incrementAndGet();
            }
            if (atomicInteger.get() == 0 && aVar != null) {
                ((C84629a) aVar).mo117341a((Bitmap) null, (byte[]) null);
            }
        }

        /* renamed from: a */
        public void mo117343a() {
            C84632a aVar;
            if (this.f246928d.decrementAndGet() == 0 && (aVar = this.f246927c) != null) {
                ((C84629a) aVar).mo117341a(this.f246929e, this.f246930f);
            }
        }
    }

    public C84628f(FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        super(fragmentActivity, viewGroup);
        this.f246909e = fragmentActivity;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(fragmentActivity).inflate(C0966R.C0971layout.f6450f7, viewGroup, false);
        this.f246910f = viewGroup2;
        viewGroup2.setOnClickListener(this);
        ((TextView) this.f246910f.findViewById(C0966R.C0970id.knx)).setText(mo117283m());
        WeImageView weImageView = this.f246912h;
        if (weImageView != null) {
            mo117282j(weImageView);
        }
        this.f246913i = this.f246910f.findViewById(C0966R.C0970id.jkf);
        this.f246914j = (ImageView) this.f246910f.findViewById(C0966R.C0970id.jkg);
        this.f246915n = (MMAnimateView) this.f246910f.findViewById(C0966R.C0970id.jkh);
        this.f246916o = (TextView) this.f246910f.findViewById(C0966R.C0970id.jki);
    }

    /* renamed from: c */
    public View mo117312c() {
        return this.f246910f;
    }

    /* renamed from: e */
    public void mo117280e() {
        mo117321l(true);
    }

    /* renamed from: f */
    public void mo117313f() {
        this.f246915n.mo129237x();
    }

    /* renamed from: g */
    public void mo117314g() {
        this.f246915n.pause();
    }

    /* renamed from: h */
    public void mo117281h() {
        mo117339n(this.f246918q);
        this.f246915n.resume();
    }

    /* renamed from: i */
    public void mo117315i(int i) {
        ImageView imageView = this.f246911g;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
        TextView textView = (TextView) this.f246910f.findViewById(C0966R.C0970id.knx);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.leftMargin = this.f246910f.getResources().getDimensionPixelOffset(C0966R.dimen.f4103rm);
        textView.setLayoutParams(layoutParams);
    }

    /* renamed from: k */
    public void mo117316k(int i) {
        this.f246910f.setBackgroundResource(i);
    }

    /* renamed from: m */
    public abstract String mo117283m();

    /* renamed from: n */
    public void mo117339n(C49962j90 j902) {
        C81526t1.C81529c cVar;
        if (j902 != null) {
            this.f246918q = j902;
            int i = j902.f135938f;
            C81526t1.C81529c[] values = C81526t1.C81529c.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    cVar = null;
                    break;
                }
                cVar = values[i2];
                if (i == cVar.ordinal()) {
                    break;
                }
                i2++;
            }
            if (cVar != null) {
                Log.m105924i("AppBrandLauncherListHeaderFolderEntrance", "[showShowCaseView]  wording=" + j902.f135939g + " icon_url=" + j902.f135940h + " icon_url2=" + j902.f135941i);
                C84631b bVar = new C84631b(j902.f135940h, j902.f135941i, new C84629a(j902, cVar));
                if (!TextUtils.isEmpty(bVar.f246925a)) {
                    String str = bVar.f246925a;
                    String str2 = C88394b.f255384g;
                    C88394b.C88418q.f255427a.mo122796o(new C84633g(bVar), str, (C88394b.C88408j) null);
                }
                if (!TextUtils.isEmpty(bVar.f246926b)) {
                    String str3 = bVar.f246926b;
                    String str4 = C88394b.f255384g;
                    C88394b.C88418q.f255427a.mo122798q(str3, new C84634h(bVar));
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo117340o() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f246913i, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(30);
        ofFloat.start();
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
