package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import cb0.C54711a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.Metadata;
import p501dz.C58466h;
import rx3.C13598b0;
import u62.C22583d;
import u62.C22597f;
import z62.C66735c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/wallet/balance/ui/lqt/WalletKnowLqtFullScreenVideoUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "Lcom/tencent/mm/plugin/wallet/balance/ui/lqt/a;", "<init>", "()V", "a", "plugin-wxpay_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI */
public final class WalletKnowLqtFullScreenVideoUI extends BaseMvvmActivity implements C57484a {

    /* renamed from: d */
    public C57479a f164680d;

    /* renamed from: e */
    public ViewGroup f164681e;

    /* renamed from: f */
    public SeekBar f164682f;

    /* renamed from: g */
    public ImageView f164683g;

    /* renamed from: h */
    public TextView f164684h;

    /* renamed from: i */
    public TextView f164685i;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI$a */
    public static final class C57479a extends MMVideoFrameLayout<C22597f> {

        /* renamed from: A */
        public C57484a f164686A;

        /* renamed from: t */
        public C32227p<? super Integer, ? super Integer, C13598b0> f164687t;

        /* renamed from: u */
        public C32224a<C13598b0> f164688u;

        /* renamed from: v */
        public C32227p<? super Long, ? super Long, C13598b0> f164689v = new C57480a(this);

        /* renamed from: w */
        public C32227p<? super Integer, ? super Integer, C13598b0> f164690w;

        /* renamed from: x */
        public C32224a<C13598b0> f164691x;

        /* renamed from: y */
        public C32224a<C13598b0> f164692y;

        /* renamed from: z */
        public C32224a<C13598b0> f164693z;

        /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI$a$a */
        public static final class C57480a extends C87413o implements C32227p<Long, Long, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C57479a f164694d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57480a(C57479a aVar) {
                super(2);
                this.f164694d = aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                long longValue = ((Number) obj).longValue();
                long longValue2 = ((Number) obj2).longValue();
                C57484a delegate = this.f164694d.getDelegate();
                if (delegate != null) {
                    delegate.mo81217O5(longValue, longValue2);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57479a(Context context) {
            super(context);
            C87412m.m108594g(context, "context");
        }

        /* renamed from: d */
        public void mo23982d(String str) {
            C32224a<C13598b0> aVar = this.f164693z;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        /* renamed from: e */
        public void mo23983e() {
            C32224a<C13598b0> aVar = this.f164691x;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        /* renamed from: f */
        public void mo23984f(C22583d dVar, int i, int i2) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            super.mo23984f(dVar, i, i2);
            C32224a<C13598b0> aVar = this.f164692y;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        /* renamed from: g */
        public void mo23985g(String str, int i) {
            C87412m.m108594g(str, "invokeSource");
            super.mo23985g(str, i);
            C32224a<C13598b0> aVar = this.f164688u;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final long getCurrentPos() {
            return getPlayer().getCurrentPositionMs();
        }

        public final C57484a getDelegate() {
            return this.f164686A;
        }

        public final C32224a<C13598b0> getOnFirstFrameRendered() {
            return this.f164688u;
        }

        public final C32227p<Long, Long, C13598b0> getOnProgressChange() {
            return this.f164689v;
        }

        public final C32227p<Integer, Integer, C13598b0> getOnStateChange() {
            return this.f164690w;
        }

        public final C32224a<C13598b0> getOnVideoBufferingStart() {
            return this.f164693z;
        }

        public final C32224a<C13598b0> getOnVideoComplete() {
            return this.f164691x;
        }

        public final C32224a<C13598b0> getOnVideoError() {
            return this.f164692y;
        }

        public final C32227p<Integer, Integer, C13598b0> getOnVideoSizeChange() {
            return this.f164687t;
        }

        public final int getPlayerState() {
            return getPlayer().getState();
        }

        public final long getTotalLength() {
            return getPlayer().getDurationMs();
        }

        /* renamed from: h */
        public void mo23995h(C22583d dVar, long j, long j2) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            C32227p<? super Long, ? super Long, C13598b0> pVar = this.f164689v;
            if (pVar != null) {
                pVar.invoke(Long.valueOf(j), Long.valueOf(j2));
            }
        }

        /* renamed from: j */
        public void mo23997j(int i, int i2) {
            C32227p<? super Integer, ? super Integer, C13598b0> pVar = this.f164687t;
            if (pVar != null) {
                pVar.invoke(Integer.valueOf(i), Integer.valueOf(i2));
            }
        }

        public final void setDelegate(C57484a aVar) {
            this.f164686A = aVar;
        }

        public final void setOnFirstFrameRendered(C32224a<C13598b0> aVar) {
            this.f164688u = aVar;
        }

        public final void setOnProgressChange(C32227p<? super Long, ? super Long, C13598b0> pVar) {
            this.f164689v = pVar;
        }

        public final void setOnStateChange(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
            this.f164690w = pVar;
        }

        public final void setOnVideoBufferingStart(C32224a<C13598b0> aVar) {
            this.f164693z = aVar;
        }

        public final void setOnVideoComplete(C32224a<C13598b0> aVar) {
            this.f164691x = aVar;
        }

        public final void setOnVideoError(C32224a<C13598b0> aVar) {
            this.f164692y = aVar;
        }

        public final void setOnVideoSizeChange(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
            this.f164687t = pVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI$b */
    public static final class C57481b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletKnowLqtFullScreenVideoUI f164695d;

        public C57481b(WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI) {
            this.f164695d = walletKnowLqtFullScreenVideoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f164695d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI$c */
    public static final class C57482c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletKnowLqtFullScreenVideoUI f164696d;

        public C57482c(WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI) {
            this.f164696d = walletKnowLqtFullScreenVideoUI;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletKnowLqtFullScreenVideoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C57479a aVar = this.f164696d.f164680d;
            Integer valueOf = aVar != null ? Integer.valueOf(aVar.getPlayerState()) : null;
            Log.m105924i("MicroMsg.WalletKnowLqtFullScreenVideoUIUI", "click play controller, state: " + valueOf);
            if ((valueOf != null && valueOf.intValue() == 7) || (valueOf != null && valueOf.intValue() == 1)) {
                C57479a aVar2 = this.f164696d.f164680d;
                if (aVar2 != null) {
                    MMVideoFrameLayout.m19909n(aVar2, (String) null, 0, 1, (Object) null);
                }
                WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI = this.f164696d;
                ImageView imageView = walletKnowLqtFullScreenVideoUI.f164683g;
                if (imageView != null) {
                    imageView.setImageDrawable(walletKnowLqtFullScreenVideoUI.getResources().getDrawable(C0966R.C0969drawable.cnm));
                }
            } else if (valueOf != null && valueOf.intValue() == 6) {
                C57479a aVar3 = this.f164696d.f164680d;
                if (aVar3 != null) {
                    MMVideoFrameLayout.m19909n(aVar3, (String) null, 0, 3, (Object) null);
                }
                WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI2 = this.f164696d;
                ImageView imageView2 = walletKnowLqtFullScreenVideoUI2.f164683g;
                if (imageView2 != null) {
                    imageView2.setImageDrawable(walletKnowLqtFullScreenVideoUI2.getResources().getDrawable(C0966R.C0969drawable.cnm));
                }
            } else {
                try {
                    C57479a aVar4 = this.f164696d.f164680d;
                    if (aVar4 != null) {
                        aVar4.mo23998m();
                    }
                } catch (Exception e) {
                    Log.m105924i("MicroMsg.WalletKnowLqtFullScreenVideoUIUI", "pause has exception" + e);
                }
                WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI3 = this.f164696d;
                ImageView imageView3 = walletKnowLqtFullScreenVideoUI3.f164683g;
                if (imageView3 != null) {
                    imageView3.setImageDrawable(walletKnowLqtFullScreenVideoUI3.getResources().getDrawable(C0966R.C0969drawable.cnn));
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletKnowLqtFullScreenVideoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI$d */
    public static final class C57483d implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: d */
        public final /* synthetic */ WalletKnowLqtFullScreenVideoUI f164697d;

        public C57483d(WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI) {
            this.f164697d = walletKnowLqtFullScreenVideoUI;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C57479a aVar;
            int progress;
            if (seekBar != null && (aVar = this.f164697d.f164680d) != null && (progress = seekBar.getProgress()) < 100 && progress >= 0) {
                aVar.getPlayer().seekTo((long) (((double) aVar.getTotalLength()) * (((double) progress) / 100.0d)));
            }
        }
    }

    /* renamed from: O5 */
    public void mo81217O5(long j, long j2) {
        Log.m105924i("MicroMsg.WalletKnowLqtFullScreenVideoUIUI", "onProgressChange, currentMs: " + j + ", totalMs: " + j2);
        int i = (int) ((((double) j) / ((double) j2)) * ((double) 100));
        TextView textView = this.f164684h;
        if (textView != null) {
            String string = getContext().getString(C0966R.string.n3i);
            Pattern pattern = C75228t.f221346a;
            textView.setText(DateFormat.format(string, j).toString());
        }
        SeekBar seekBar = this.f164682f;
        if (seekBar != null) {
            seekBar.setProgress(i);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d5z;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(-16777216);
        setNavigationbarColor(-16777216);
        setBackBtn(new C57481b(this));
        this.f164681e = (ViewGroup) findViewById(C0966R.C0970id.nvr);
        this.f164683g = (ImageView) findViewById(C0966R.C0970id.nwl);
        this.f164682f = (SeekBar) findViewById(C0966R.C0970id.nyv);
        this.f164684h = (TextView) findViewById(C0966R.C0970id.nze);
        this.f164685i = (TextView) findViewById(C0966R.C0970id.nzf);
        ImageView imageView = this.f164683g;
        if (imageView != null) {
            imageView.setOnClickListener(new C57482c(this));
        }
        SeekBar seekBar = this.f164682f;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(new C57483d(this));
        }
        String stringExtra = getIntent().getStringExtra("videoUrl");
        if (!Util.isNullOrNil(stringExtra)) {
            C57479a aVar = this.f164680d;
            boolean z = true;
            if (aVar == null || !aVar.getPlayer().isPlaying()) {
                z = false;
            }
            if (z) {
                Log.m105928w("MicroMsg.WalletKnowLqtFullScreenVideoUIUI", "loadLivingVideoInMiniMode return for playing.");
                return;
            }
            if (this.f164680d == null) {
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                C57479a aVar2 = new C57479a(context);
                this.f164680d = aVar2;
                aVar2.setDelegate(this);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                C57479a aVar3 = this.f164680d;
                if (aVar3 != null) {
                    aVar3.setLayoutParams(layoutParams);
                }
                ViewGroup viewGroup = this.f164681e;
                if (viewGroup != null) {
                    viewGroup.addView(this.f164680d);
                }
            }
            C57479a aVar4 = this.f164680d;
            if (aVar4 != null) {
                C57488h hVar = new C57488h(this);
                if (stringExtra != null) {
                    C22597f fVar = new C22597f();
                    String mD5String = MD5Util.getMD5String(stringExtra);
                    String a = C54711a.f153346a.mo75606a("", mD5String, stringExtra);
                    C66735c.C66736a aVar5 = C66735c.f191767d;
                    C87412m.m108593f(mD5String, "mediaId");
                    C66735c cVar = new C66735c(mD5String, stringExtra, aVar5.mo90768a(mD5String, stringExtra, a));
                    fVar.mo35706g(cVar, ((C58466h) C86312j.m106911c(C58466h.class)).mo31869LK(fVar, cVar, mD5String, mD5String));
                    hVar.invoke();
                    aVar4.mo23980b(fVar, cVar);
                    MMVideoFrameLayout.m19908l(aVar4, true, 0, 0, 0, 0, (Rect) null, 62, (Object) null);
                    Log.m105924i("MicroMsg.WalletKnowLqtFullScreenVideoUIUI", "playVideo at 0");
                    MMVideoFrameLayout.m19909n(aVar4, (String) null, 0, 1, (Object) null);
                }
            }
        }
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.WalletKnowLqtFullScreenVideoUIUI", "ondestroy");
        super.onDestroy();
        C57479a aVar = this.f164680d;
        if (aVar != null) {
            aVar.mo24000p();
            aVar.getPlayer().release();
        }
    }
}
