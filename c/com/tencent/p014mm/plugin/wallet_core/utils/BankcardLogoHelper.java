package com.tencent.p014mm.plugin.wallet_core.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import b63.C67183e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.BankcardLogoReadyEvent;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e63.C75556b;
import eb0.C75592q0;
import f40.C86709a0;
import g63.C75886j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import ob0.C11385n;
import ob0.C117747y;
import p755xs.C102720b;
import v53.C52767f;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.BankcardLogoHelper */
public class BankcardLogoHelper {

    /* renamed from: a */
    public ArrayList<C72484c> f210839a = new ArrayList<>();

    /* renamed from: b */
    public ReentrantLock f210840b = new ReentrantLock();

    /* renamed from: c */
    public IListener f210841c;

    /* renamed from: d */
    public LinkedList<String> f210842d;

    /* renamed from: e */
    public LinkedList<Bankcard> f210843e;

    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.BankcardLogoHelper$a */
    public class C72482a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ Context f210845d;

        public C72482a(Context context) {
            this.f210845d = context;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(1650, this);
            BankcardLogoHelper bankcardLogoHelper = BankcardLogoHelper.this;
            bankcardLogoHelper.f210842d = null;
            LinkedList<Bankcard> linkedList = bankcardLogoHelper.f210843e;
            if (linkedList != null) {
                bankcardLogoHelper.mo99892c(this.f210845d, linkedList);
                BankcardLogoHelper.this.f210843e = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.BankcardLogoHelper$b */
    public interface C72483b {
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.BankcardLogoHelper$c */
    public static class C72484c implements C102720b.C78973a {

        /* renamed from: d */
        public Bankcard f210847d;

        /* renamed from: e */
        public WeakReference<ImageView> f210848e;

        /* renamed from: f */
        public WeakReference<View> f210849f = null;

        /* renamed from: g */
        public WeakReference<ImageView> f210850g = null;

        /* renamed from: h */
        public WeakReference<TextView> f210851h = null;

        /* renamed from: i */
        public String f210852i;

        /* renamed from: j */
        public boolean f210853j = false;

        /* renamed from: com.tencent.mm.plugin.wallet_core.utils.BankcardLogoHelper$c$a */
        public class C72485a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ImageView f210854d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f210855e;

            public C72485a(C72484c cVar, ImageView imageView, Bitmap bitmap) {
                this.f210854d = imageView;
                this.f210855e = bitmap;
            }

            public void run() {
                this.f210854d.setImageBitmap(this.f210855e);
            }
        }

        /* renamed from: com.tencent.mm.plugin.wallet_core.utils.BankcardLogoHelper$c$b */
        public class C72486b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ImageView f210856d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f210857e;

            public C72486b(C72484c cVar, ImageView imageView, Bitmap bitmap) {
                this.f210856d = imageView;
                this.f210857e = bitmap;
            }

            public void run() {
                this.f210856d.setImageBitmap(this.f210857e);
            }
        }

        /* renamed from: j3 */
        public void mo24656j3(String str, Bitmap bitmap) {
            Bankcard bankcard;
            StringBuilder sb = new StringBuilder();
            sb.append("onGetPictureFinish ");
            sb.append(str);
            sb.append(", bitmap = ");
            boolean z = true;
            sb.append(bitmap == null);
            Log.m105918d("MicroMsg.BankcardLogoHelper", sb.toString());
            if (TextUtils.isEmpty(this.f210852i)) {
                Log.m105920e("MicroMsg.BankcardLogoHelper", "mBankcardLogoUrl is empty");
                return;
            }
            WeakReference<ImageView> weakReference = this.f210848e;
            if (weakReference != null) {
                ImageView imageView = weakReference.get();
                Object[] objArr = new Object[6];
                objArr[0] = str;
                objArr[1] = Boolean.valueOf(bitmap == null);
                if (imageView != null) {
                    z = false;
                }
                objArr[2] = Boolean.valueOf(z);
                objArr[3] = imageView == null ? "" : imageView.getTag();
                objArr[4] = this.f210852i;
                objArr[5] = Boolean.valueOf(this.f210853j);
                Log.m105919d("MicroMsg.BankcardLogoHelper", "onGetPictureFinish done notifyKey %s  bitmap is null? %s iv is null? %s iv tag: %s mBankcardLogoUrl %s, checkTagType: %s", objArr);
                if (imageView != null && str != null && str.equals(this.f210852i)) {
                    if (!this.f210853j) {
                        imageView.post(new C72486b(this, imageView, bitmap));
                        imageView.setTag(C0966R.C0970id.lga, (Object) null);
                    } else if (imageView.getTag(C0966R.C0970id.lga) != null && (bankcard = this.f210847d) != null && bankcard.field_bankcardType != null) {
                        String str2 = (String) imageView.getTag(C0966R.C0970id.lga);
                        if (!Util.isNullOrNil(str2) && str2.equals(this.f210847d.field_bankcardType)) {
                            imageView.post(new C72485a(this, imageView, bitmap));
                            imageView.setTag(C0966R.C0970id.lga, (Object) null);
                        }
                    }
                }
            }
        }
    }

    public BankcardLogoHelper() {
        C724811 r0 = new IListener<BankcardLogoReadyEvent>(C40008f.f107254d) {
            {
                this.__eventId = 585646942;
            }

            public boolean callback(IEvent iEvent) {
                WeakReference<View> weakReference;
                ImageView imageView;
                WeakReference<View> weakReference2;
                WeakReference<ImageView> weakReference3;
                BankcardLogoReadyEvent bankcardLogoReadyEvent = (BankcardLogoReadyEvent) iEvent;
                BankcardLogoHelper.this.f210840b.lock();
                while (true) {
                    ArrayList<C72484c> arrayList = BankcardLogoHelper.this.f210839a;
                    if (arrayList == null || arrayList.size() <= 0) {
                        BankcardLogoHelper.this.f210840b.unlock();
                    } else {
                        C72484c remove = BankcardLogoHelper.this.f210839a.remove(0);
                        if (remove == null) {
                            BankcardLogoHelper.this.f210840b.unlock();
                            return true;
                        }
                        Bankcard bankcard = remove.f210847d;
                        ImageView imageView2 = remove.f210848e.get();
                        if (imageView2 != null) {
                            String str = (String) imageView2.getTag(C0966R.C0970id.lga);
                            if (!Util.isNullOrNil(str) && ((!C75592q0.m90763K() && str.equals(bankcard.field_bankcardType)) || (C75592q0.m90763K() && str.equals(bankcard.field_bankName)))) {
                                C67183e eVar = bankcard.f209427v2;
                                if (eVar == null) {
                                    eVar = C75592q0.m90763K() ? C75556b.m90593c(imageView2.getContext(), bankcard.field_bankName, false) : C75556b.m90593c(imageView2.getContext(), bankcard.field_bankcardType, bankcard.mo99394u2());
                                }
                                BankcardLogoHelper bankcardLogoHelper = BankcardLogoHelper.this;
                                bankcardLogoHelper.getClass();
                                Class cls = C102720b.class;
                                if (eVar == null || (weakReference3 = remove.f210848e) == null || weakReference3.get() == null) {
                                    Log.m105920e("MicroMsg.BankcardLogoHelper", "bankUrls == null");
                                } else {
                                    Log.m105918d("MicroMsg.BankcardLogoHelper", "setLogo bankLogoUrl = " + eVar.f192875a);
                                    ImageView imageView3 = remove.f210848e.get();
                                    if (!Util.isNullOrNil(eVar.f192875a)) {
                                        imageView3.post(new C72494b(bankcardLogoHelper, remove, imageView3, ((C102720b) C86312j.m106911c(cls)).mo142104N6(new C75886j(eVar.f192875a))));
                                        remove.f210852i = eVar.f192875a;
                                        ((C102720b) C86312j.m106911c(cls)).Lu0(remove);
                                    } else {
                                        Log.m105920e("MicroMsg.BankcardLogoHelper", "bankcard logoUrl == null");
                                    }
                                }
                                BankcardLogoHelper bankcardLogoHelper2 = BankcardLogoHelper.this;
                                bankcardLogoHelper2.getClass();
                                if (!(eVar == null || (weakReference2 = remove.f210849f) == null || weakReference2.get() == null)) {
                                    View view = remove.f210849f.get();
                                    view.post(new C72495c(bankcardLogoHelper2, view, eVar, remove));
                                }
                                BankcardLogoHelper bankcardLogoHelper3 = BankcardLogoHelper.this;
                                bankcardLogoHelper3.getClass();
                                if (!(eVar == null || (weakReference = remove.f210849f) == null || weakReference.get() == null || (imageView = remove.f210850g.get()) == null)) {
                                    imageView.post(new C72496d(bankcardLogoHelper3, eVar, imageView, remove));
                                }
                            }
                        }
                    }
                }
                BankcardLogoHelper.this.f210840b.unlock();
                return true;
            }
        };
        this.f210841c = r0;
        r0.alive();
    }

    /* renamed from: a */
    public void mo99890a() {
        this.f210841c.dead();
        ArrayList<C72484c> arrayList = this.f210839a;
        if (arrayList != null) {
            arrayList.clear();
            this.f210839a = null;
        }
    }

    /* renamed from: b */
    public boolean mo99891b(Context context, Bankcard bankcard) {
        C67183e c = C75592q0.m90763K() ? C75556b.m90593c(context, bankcard.field_bankName, false) : C75556b.m90593c(context, bankcard.field_bankcardType, bankcard.mo99394u2());
        return c != null && !c.f192881g;
    }

    /* renamed from: c */
    public void mo99892c(Context context, List<Bankcard> list) {
        if (list != null && list.size() > 0) {
            int size = list.size();
            this.f210842d = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                Bankcard bankcard = list.get(i);
                if (bankcard.mo99388n2()) {
                    Log.m105924i("MicroMsg.BankcardLogoHelper", "ignore balance");
                } else if (!mo99891b(context, bankcard)) {
                    Log.m105924i("MicroMsg.BankcardLogoHelper", bankcard.field_bankcardType + "'s url is null or need update");
                    this.f210842d.add(bankcard.field_bankcardType);
                }
            }
            if (this.f210842d.size() > 0) {
                Log.m105924i("MicroMsg.BankcardLogoHelper", "doScene to get bankcard logo");
                C52767f fVar = new C52767f(this.f210842d);
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123455a(1650, new C72482a(context));
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(fVar);
                return;
            }
            Log.m105924i("MicroMsg.BankcardLogoHelper", "use cache bankcard logo data");
            new BankcardLogoReadyEvent().publish();
        }
    }

    /* renamed from: d */
    public void mo99893d(Context context, Bankcard bankcard, ImageView imageView, View view, ImageView imageView2, TextView textView) {
        C72484c cVar = new C72484c();
        cVar.f210853j = false;
        cVar.f210847d = bankcard;
        if (imageView != null) {
            imageView.setTag(C0966R.C0970id.lga, bankcard.field_bankcardType);
            cVar.f210848e = new WeakReference<>(imageView);
        }
        if (view != null) {
            cVar.f210849f = new WeakReference<>(view);
        }
        if (imageView2 != null) {
            cVar.f210850g = new WeakReference<>(imageView2);
        }
        if (textView != null) {
            cVar.f210851h = new WeakReference<>(textView);
        }
        this.f210839a.add(cVar);
        String str = C75592q0.m90763K() ? bankcard.field_bankName : bankcard.field_bankcardType;
        LinkedList<String> linkedList = this.f210842d;
        if (linkedList != null && linkedList.contains(str)) {
            Log.m105924i("MicroMsg.BankcardLogoHelper", "waiting resp:" + str);
        } else if (!mo99891b(context, bankcard)) {
            if (this.f210843e == null) {
                this.f210843e = new LinkedList<>();
            }
            this.f210843e.add(bankcard);
            if (this.f210842d == null) {
                mo99892c(context, this.f210843e);
            }
        } else {
            new BankcardLogoReadyEvent().publish();
        }
    }

    /* renamed from: e */
    public void mo99894e(Context context, Bankcard bankcard, ImageView imageView) {
        mo99893d(context, bankcard, imageView, (View) null, (ImageView) null, (TextView) null);
    }

    /* renamed from: f */
    public void mo99895f(Bankcard bankcard, ImageView imageView) {
        WeakReference<ImageView> weakReference;
        Class cls = C102720b.class;
        C72484c cVar = new C72484c();
        cVar.f210847d = bankcard;
        if (imageView != null) {
            imageView.setTag(C0966R.C0970id.lga, bankcard.field_bankcardType);
            cVar.f210848e = new WeakReference<>(imageView);
        }
        C67183e eVar = bankcard.f209427v2;
        if (eVar == null || (weakReference = cVar.f210848e) == null || weakReference.get() == null) {
            Log.m105920e("MicroMsg.BankcardLogoHelper", "bankUrls == null");
            return;
        }
        Log.m105918d("MicroMsg.BankcardLogoHelper", "bankLogoUrl = " + eVar.f192875a);
        ImageView imageView2 = cVar.f210848e.get();
        if (!Util.isNullOrNil(eVar.f192875a)) {
            cVar.f210852i = eVar.f192875a;
            cVar.f210853j = true;
            Bitmap N6 = ((C102720b) C86312j.m106911c(cls)).mo142104N6(new C75886j(eVar.f192875a));
            if (N6 != null) {
                imageView2.setImageBitmap(N6);
            }
            ((C102720b) C86312j.m106911c(cls)).Lu0(cVar);
            return;
        }
        Log.m105920e("MicroMsg.BankcardLogoHelper", "bankcard logoUrl == null");
    }
}
