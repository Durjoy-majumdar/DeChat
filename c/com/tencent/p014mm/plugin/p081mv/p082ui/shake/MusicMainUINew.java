package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ShakeActionReport2Struct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.p081mv.p082ui.WeCheckBox;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jb2.C46465q;
import jb2.C60787b;
import kg3.C76577a;
import la2.C99364n;
import lu3.C34379c;
import m03.C61426c;
import ma2.C61453s;
import ma2.C99821w;
import nb2.C61646d;
import nj3.C88989a;
import o40.C61926c;
import p529fv.C32180m;
import p529fv.C32182n;
import p529fv.C59326j;
import p529fv.C59330q;
import p749xh.C102658n6;
import qc0.C101093a;
import qc0.C101106m;
import sa2.C101555a;
import sa2.C101567h;
import te3.C64488kb1;
import te3.C64793w23;
import z04.C119027c;
import zt3.C119157j;

@C88989a(32)
/* renamed from: com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew */
public class MusicMainUINew extends MMActivity {

    /* renamed from: C */
    public static int f163137C;

    /* renamed from: A */
    public WeCheckBox f163138A = null;

    /* renamed from: B */
    public IListener<MusicPlayerEvent> f163139B = new IListener<MusicPlayerEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1155728636;
        }

        public boolean callback(IEvent iEvent) {
            WeCheckBox weCheckBox;
            C61426c cVar;
            int i = ((MusicPlayerEvent) iEvent).f9336d.f9337a;
            if (i != 0) {
                if (i == 1) {
                    C61426c cVar2 = MusicMainUINew.this.f163140d;
                    if (cVar2 != null) {
                        cVar2.resume();
                    }
                } else if (i == 2) {
                    MusicMainUINew musicMainUINew = MusicMainUINew.this;
                    if (musicMainUINew.f163150q && (weCheckBox = musicMainUINew.f163138A) != null) {
                        weCheckBox.setChecked(false);
                        MusicMainUINew.this.f163138A = null;
                    }
                } else if (i == 3 && (cVar = MusicMainUINew.this.f163140d) != null) {
                    cVar.pause();
                }
            } else if (!MusicMainUINew.this.f163150q) {
                if (C99364n.m129616h().mo138822a() instanceof C101567h) {
                    ((C101567h) C99364n.m129616h().mo138822a()).mo141050G(0.0f);
                }
                MusicMainUINew musicMainUINew2 = MusicMainUINew.this;
                if (musicMainUINew2.f163143g.floatValue() != -1.0f) {
                    C101093a.m132487i(musicMainUINew2.f163143g.intValue());
                }
            }
            return false;
        }
    };

    /* renamed from: d */
    public C61426c f163140d;

    /* renamed from: e */
    public CdnImageView f163141e;

    /* renamed from: f */
    public C56987s f163142f;

    /* renamed from: g */
    public Float f163143g;

    /* renamed from: h */
    public String f163144h;

    /* renamed from: i */
    public C101106m f163145i;

    /* renamed from: j */
    public FrameLayout f163146j;

    /* renamed from: n */
    public List<C61646d> f163147n = new ArrayList();

    /* renamed from: o */
    public List<C101106m> f163148o;

    /* renamed from: p */
    public boolean f163149p = false;

    /* renamed from: q */
    public boolean f163150q = false;

    /* renamed from: r */
    public boolean f163151r = false;

    /* renamed from: s */
    public boolean f163152s;

    /* renamed from: t */
    public boolean f163153t;

    /* renamed from: u */
    public boolean f163154u = false;

    /* renamed from: v */
    public int f163155v;

    /* renamed from: w */
    public C32180m f163156w = ((C32182n) C86312j.m106911c(C32182n.class)).mo58314ZN();

    /* renamed from: x */
    public C34379c<?> f163157x;

    /* renamed from: y */
    public boolean f163158y = false;

    /* renamed from: z */
    public C56982q f163159z = new C56982q();

    /* renamed from: com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew$a */
    public class C56963a implements View.OnClickListener {
        public C56963a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MusicMainUINew musicMainUINew = MusicMainUINew.this;
            if (!musicMainUINew.f163158y && !musicMainUINew.f163150q) {
                musicMainUINew.setResult(1);
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(musicMainUINew.getContext(), C0966R.C0968anim.f2530fj);
            loadAnimation.setAnimationListener(new C56972h(musicMainUINew));
            musicMainUINew.f163146j.startAnimation(loadAnimation);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public final void mo80413H7(String str, ViewGroup viewGroup, int i) {
        C56987s sVar = new C56987s(getContext(), viewGroup, (int) (((double) C76577a.m92159j(getContext())) * 0.7d * 0.4d), i);
        this.f163142f = sVar;
        Log.m105924i("MicroMsg.Mv.MusicMvLyric", "onCreate");
        if (sVar.f163201d == 0) {
            sVar.mo80433b().setLayoutManager(new MusicShakeLyricLayoutManager(sVar.f163198a, 0, false, 6, (C8480h) null));
        } else {
            sVar.mo80433b().setLayoutManager(new MusicBlackLyricLayoutManager(sVar.f163198a, 0, false, 6, (C8480h) null));
            sVar.mo80433b().getRecycledViewPool().mo17336e(0, 0);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.mo80433b().getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = sVar.f163200c;
        }
        ((C101555a) C99364n.m129616h().mo138822a()).mo141033x(sVar.f163208k);
        C56987s sVar2 = this.f163142f;
        sVar2.getClass();
        if (str != null) {
            C61453s sVar3 = null;
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                sVar2.f163203f.clear();
                C61453s f = C61453s.m72164f(str, "", "", true, "", false, false);
                if (f.mo86427b() > 1) {
                    sVar3 = f;
                }
                sVar2.f163204g = sVar3;
                if (sVar3 != null) {
                    int b = sVar3.mo86427b();
                    for (int i2 = 0; i2 < b; i2++) {
                        ArrayList<String> arrayList = sVar2.f163203f;
                        String str2 = sVar3.mo86426a(i2).f174761c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        arrayList.add(str2);
                    }
                }
                if (((C56983r) sVar2.mo80433b().getAdapter()) == null) {
                    RecyclerView b2 = sVar2.mo80433b();
                    C56983r rVar = new C56983r(sVar2.f163207j, sVar2.f163201d);
                    ArrayList<String> arrayList2 = sVar2.f163203f;
                    C87412m.m108594g(arrayList2, "list");
                    rVar.f163193f.clear();
                    rVar.f163193f.addAll(arrayList2);
                    rVar.notifyDataSetChanged();
                    b2.setAdapter(rVar);
                }
                Log.m105924i("MicroMsg.Mv.MusicMvLyric", "setSongInfo, lyric.length:" + str.length() + ", lyricLine.size:" + sVar2.f163203f.size() + ", lyricRv-Visisble:" + sVar2.mo80433b().getVisibility() + ", lyricRv.alpha:" + sVar2.mo80433b().getAlpha());
            }
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2326n, C0966R.C0968anim.f2327o);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bio;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        if (!this.f163158y && !this.f163150q) {
            setResult(1);
        }
        this.f163139B.dead();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        C56987s sVar;
        Class cls = C59330q.class;
        requestWindowFeature(1);
        super.onCreate(bundle);
        Log.m105924i("MusicMainUINew", "onCreate");
        int i = 0;
        if (!(C99364n.f291354g != null)) {
            finish();
            Log.m105920e("MusicMainUINew", "MusicPlayerManager is not init!");
            return;
        }
        overridePendingTransition(C0966R.C0968anim.f2326n, C0966R.C0968anim.f2327o);
        getWindow().setFlags(67109888, 67109888);
        hideTitleView();
        this.f163143g = Float.valueOf(getIntent().getFloatExtra("key_offset", -1.0f));
        this.f163145i = (C101106m) getIntent().getSerializableExtra("key_music_wrapper");
        this.f163152s = getIntent().getIntExtra("key_pure", 0) == 1;
        this.f163149p = getIntent().getBooleanExtra("key_copyright", false);
        this.f163153t = getIntent().getIntExtra("key_byuser", 0) == 1;
        this.f163151r = getIntent().getBooleanExtra("key_history", false);
        this.f163148o = (List) getIntent().getSerializableExtra("key_recommend_list");
        this.f163155v = getIntent().getIntExtra("key_duration", 0);
        this.f163154u = getIntent().getBooleanExtra("key_hasPre", false);
        if (this.f163145i == null) {
            this.f163145i = C101093a.m132480b();
        }
        C101106m mVar = this.f163145i;
        String str = "";
        this.f163144h = mVar != null ? mVar.f295969q : str;
        String stringExtra = getIntent().getStringExtra("report_sessionid");
        String stringExtra2 = getIntent().getStringExtra("shake_sessionid");
        int intExtra = getIntent().getIntExtra("key_copyright_report", 0);
        C56994w wVar = C56994w.f163218a;
        C101106m mVar2 = this.f163145i;
        Integer valueOf = Integer.valueOf(intExtra);
        Boolean valueOf2 = Boolean.valueOf(this.f163151r);
        ShakeActionReport2Struct shakeActionReport2Struct = C56994w.f163219b;
        shakeActionReport2Struct.f156841j = shakeActionReport2Struct.mo86045b("SessionID", stringExtra, true);
        ShakeActionReport2Struct shakeActionReport2Struct2 = C56994w.f163219b;
        shakeActionReport2Struct2.f156842k = shakeActionReport2Struct2.mo86045b("SharkSessionID", stringExtra2, true);
        ShakeActionReport2Struct shakeActionReport2Struct3 = C56994w.f163219b;
        shakeActionReport2Struct3.f156843l = shakeActionReport2Struct3.mo86045b("ToSongName", mVar2 != null ? mVar2.f295962g : null, true);
        ShakeActionReport2Struct shakeActionReport2Struct4 = C56994w.f163219b;
        shakeActionReport2Struct4.f156844m = shakeActionReport2Struct4.mo86045b("ToSongSinger", mVar2 != null ? mVar2.f295963h : null, true);
        ShakeActionReport2Struct shakeActionReport2Struct5 = C56994w.f163219b;
        shakeActionReport2Struct5.f156846o = shakeActionReport2Struct5.mo86045b("ToSongDataurl", mVar2 != null ? mVar2.f295955Q : null, true);
        ShakeActionReport2Struct shakeActionReport2Struct6 = C56994w.f163219b;
        shakeActionReport2Struct6.f156845n = shakeActionReport2Struct6.mo86045b("ToSongWeburl", mVar2 != null ? mVar2.f295955Q : null, true);
        C56994w.f163219b.f156849r = valueOf != null ? (long) valueOf.intValue() : 0;
        C56994w.f163219b.f156850s = C87412m.m108589b(valueOf2, Boolean.TRUE) ? 1 : 2;
        ShakeActionReport2Struct shakeActionReport2Struct7 = C56994w.f163219b;
        shakeActionReport2Struct7.f156838g = shakeActionReport2Struct7.mo86045b("ToSongOrTv", mVar2 != null ? mVar2.f295960e : null, true);
        C56994w.f163219b.f156840i = 2;
        wVar.mo80436a(250);
        FrameLayout frameLayout = (FrameLayout) findViewById(C0966R.C0970id.gkq);
        this.f163146j = frameLayout;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.height = (int) (((double) C76577a.m92159j(getContext())) * 0.7d);
        layoutParams.width = (int) (((double) C76577a.m92159j(getContext())) * 0.42d);
        this.f163146j.setLayoutParams(layoutParams);
        this.f163146j.setClipToOutline(true);
        this.f163146j.setOutlineProvider(new C69869v(C76577a.m92151b(getContext(), 25)));
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.hqr);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams2.width = (int) (((double) C76577a.m92159j(getContext())) * 0.42d);
        linearLayout.setLayoutParams(layoutParams2);
        findViewById(C0966R.C0970id.be4).setOnClickListener(new C56963a());
        CdnImageView cdnImageView = (CdnImageView) findViewById(C0966R.C0970id.a3f);
        cdnImageView.setVisibility(0);
        cdnImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ((C99821w) this.f163156w).mo139176a(this.f163145i, cdnImageView, getContext(), true, true);
        if (this.f163149p) {
            View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.bji, (ViewGroup) null);
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C0966R.C0970id.l4i);
            C61426c cVar = (C61426c) inflate.findViewById(C0966R.C0970id.l65);
            this.f163140d = cVar;
            cVar.setMute(true);
            CdnImageView cdnImageView2 = (CdnImageView) inflate.findViewById(C0966R.C0970id.eus);
            cdnImageView2.setVisibility(0);
            cdnImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ((C99821w) this.f163156w).mo139176a(this.f163145i, cdnImageView2, getContext(), true, false);
            cdnImageView2.setClipToOutline(true);
            cdnImageView2.setOutlineProvider(new C69869v(C76577a.m92151b(getContext(), 5)));
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.ev_);
            C101106m mVar3 = this.f163145i;
            textView.setText(mVar3 != null ? mVar3.f295962g : str);
            TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.eva);
            C101106m mVar4 = this.f163145i;
            if (mVar4 != null) {
                str = mVar4.f295963h;
            }
            textView2.setText(str);
            CdnImageView cdnImageView3 = (CdnImageView) inflate.findViewById(C0966R.C0970id.bup);
            this.f163141e = cdnImageView3;
            cdnImageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
            int j = (int) (((double) C76577a.m92159j(getContext())) * 0.7d);
            C99821w wVar2 = (C99821w) ((C32182n) C86312j.m106911c(C32182n.class)).mo58314ZN();
            wVar2.f292517c = new C56976l(this, (int) (((double) C76577a.m92159j(getContext())) * 0.42d), j);
            wVar2.mo139176a(this.f163145i, this.f163141e, getContext(), true, false);
            this.f163141e.setVisibility(0);
            mo80413H7(this.f163144h, relativeLayout, 0);
            C56987s sVar2 = this.f163142f;
            if (sVar2 != null) {
                int intValue = this.f163143g.intValue();
                sVar2.f163206i = intValue;
                C61926c.m72668M(new C56992t(sVar2, intValue));
            }
            inflate.findViewById(C0966R.C0970id.f2n).setOnClickListener(new C56977m(this));
            inflate.findViewById(C0966R.C0970id.f1s).setOnClickListener(new C56978n(this));
            inflate.findViewById(C0966R.C0970id.epv).setOnClickListener(new C56979o(this));
            this.f163146j.addView(inflate);
            LinearLayout linearLayout2 = (LinearLayout) findViewById(C0966R.C0970id.f358371eq2);
            linearLayout2.setVisibility(0);
            linearLayout2.setOnClickListener(new C56980p(this));
            this.f163146j.post(new C56965a(this));
        } else {
            View inflate2 = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.big, (ViewGroup) null);
            LinearLayout linearLayout3 = (LinearLayout) inflate2.findViewById(C0966R.C0970id.l4i);
            CdnImageView cdnImageView4 = (CdnImageView) inflate2.findViewById(C0966R.C0970id.bup);
            cdnImageView4.setVisibility(0);
            cdnImageView4.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ((C99821w) this.f163156w).mo139176a(this.f163145i, cdnImageView4, getContext(), true, false);
            String str2 = this.f163144h;
            if (str2 == null) {
                TextView textView3 = (TextView) inflate2.findViewById(C0966R.C0970id.jz4);
                textView3.setVisibility(0);
                if (this.f163152s) {
                    textView3.setText("纯音乐无歌词");
                } else {
                    textView3.setText("暂无歌词");
                }
            } else {
                mo80413H7(str2, linearLayout3, 1);
            }
            if (!this.f163151r && (sVar = this.f163142f) != null) {
                int intValue2 = this.f163143g.intValue();
                sVar.f163206i = intValue2;
                C61926c.m72668M(new C56992t(sVar, intValue2));
            }
            if (!this.f163153t && !this.f163151r) {
                this.f163157x = ((C119157j) C119157j.f356862d).mo183872c(new C56966b(this), 0, 100);
            }
            this.f163146j.addView(inflate2);
            int i2 = C0966R.C0970id.f359277jy2;
            TextView textView4 = (TextView) inflate2.findViewById(C0966R.C0970id.f359277jy2);
            C85875k4.m106191k0(textView4.getPaint());
            C85875k4.m106191k0(((TextView) inflate2.findViewById(C0966R.C0970id.bjr)).getPaint());
            TextView textView5 = (TextView) inflate2.findViewById(C0966R.C0970id.jlm);
            C101106m mVar5 = this.f163145i;
            if (mVar5 != null) {
                textView4.setText(mVar5.f295962g);
                textView5.setText(this.f163145i.f295963h);
            }
            List<C101106m> list = this.f163148o;
            if (list != null && list.size() > 0) {
                LinearLayout linearLayout4 = (LinearLayout) findViewById(C0966R.C0970id.igz);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) linearLayout4.getLayoutParams();
                layoutParams3.width = (int) (((double) C76577a.m92159j(getContext())) * 0.42d);
                linearLayout4.setLayoutParams(layoutParams3);
                linearLayout4.setVisibility(0);
                for (C101106m next : this.f163148o) {
                    i++;
                    View inflate3 = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.bjg, (ViewGroup) null);
                    CdnImageView cdnImageView5 = (CdnImageView) inflate3.findViewById(C0966R.C0970id.bv5);
                    WeCheckBox weCheckBox = (WeCheckBox) inflate3.findViewById(C0966R.C0970id.hwy);
                    ((C99821w) this.f163156w).mo139176a(next, cdnImageView5, getContext(), true, false);
                    cdnImageView5.setClipToOutline(true);
                    cdnImageView5.setOutlineProvider(new C69869v(C76577a.m92151b(getContext(), 5)));
                    ((TextView) inflate3.findViewById(i2)).setText(next.f295962g);
                    ((TextView) inflate3.findViewById(C0966R.C0970id.jlm)).setText(next.f295963h);
                    inflate3.setOnClickListener(new C56967c(this, next, weCheckBox, i));
                    weCheckBox.setOnCheckedChangeListener(new C56968d(this, next, weCheckBox, i));
                    linearLayout4.addView(inflate3);
                    i2 = C0966R.C0970id.f359277jy2;
                }
            }
        }
        ((C59326j) C86312j.m106911c(C59326j.class)).N30().mo84423M(true);
        if (!this.f163151r && !this.f163153t && this.f163149p) {
            if (!C101093a.m132481c()) {
                C99364n.m129616h().mo138834o((C101106m) null);
            }
            if (!this.f163153t && !this.f163151r) {
                C56982q qVar = this.f163159z;
                AppCompatActivity context = getContext();
                C56971g gVar = new C56971g(this);
                qVar.getClass();
                C102658n6 bp = ((C59330q) C86312j.m106911c(cls)).mo84438bp(context);
                C64488kb1 kb12 = new C64488kb1();
                qVar.f163189a = kb12;
                if (bp != null) {
                    qVar.mo80429a(bp, kb12);
                    C64488kb1 kb13 = qVar.f163189a;
                    int hashCode = context.hashCode();
                    C60787b bVar = new C60787b(kb13, hashCode);
                    qVar.f163190b = bVar;
                    bVar.f173138b = gVar;
                    bVar.f173137a = new ArrayList();
                    qVar.f163190b.mo85721a();
                    C60787b bVar2 = qVar.f163190b;
                    C64488kb1 kb14 = bVar2.f173139c;
                    C87412m.m108594g(kb14, "songInfo");
                    byte[] encode = Base64.encode(kb14.toByteArray(), 2);
                    C87412m.m108593f(encode, "encode(songInfo.toByteArray(), Base64.NO_WRAP)");
                    C86709a0.m107524d().mo123460f(new C46465q((C64793w23) null, bVar2.f173139c, new String(encode, C119027c.f356488a), hashCode, true));
                    qVar.f163190b.mo85722b("wx5aa333606550dfd5", kb13.f183922y);
                }
            }
        }
        if (this.f163151r) {
            C56982q qVar2 = this.f163159z;
            AppCompatActivity context2 = getContext();
            qVar2.getClass();
            C102658n6 bp4 = ((C59330q) C86312j.m106911c(cls)).mo84438bp(context2);
            C64488kb1 kb15 = new C64488kb1();
            qVar2.f163189a = kb15;
            if (bp4 != null) {
                qVar2.mo80429a(bp4, kb15);
                C60787b bVar3 = new C60787b(qVar2.f163189a, context2.hashCode());
                qVar2.f163190b = bVar3;
                bVar3.mo85721a();
                qVar2.f163190b.mo85722b("wx5aa333606550dfd5", qVar2.f163189a.f183922y);
            }
        }
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        setBounceEnabled(false);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MusicMainUINew", "onDestroy");
        C60787b bVar = this.f163159z.f163190b;
        if (bVar != null) {
            C86709a0.m107524d().mo123470p(6860, bVar.f173141e);
            C86709a0.m107524d().mo123470p(3763, bVar.f173141e);
            C86709a0.m107524d().mo123470p(6473, bVar.f173141e);
        }
        C61426c cVar = this.f163140d;
        if (cVar != null) {
            cVar.release();
        }
        if (!this.f163158y && !this.f163150q && !this.f163154u) {
            C101093a.m132490l();
        }
        C56987s sVar = this.f163142f;
        if (sVar != null) {
            sVar.getClass();
            Log.m105924i("MicroMsg.Mv.MusicMvLyric", "onDestroy");
            sVar.f163203f.clear();
            sVar.f163204g = null;
            C99364n.m129616h().mo138828g(sVar.f163208k);
        }
        this.f163139B.dead();
    }

    public void onPause() {
        super.onPause();
        ((C59326j) C86312j.m106911c(C59326j.class)).N30().mo84423M(false);
        if (this.f163150q) {
            Log.printDebugStack("MicroMsg.GlobalMusicMvFloatBallUtil", "alvinluo Mv onPause hideAllFloatBall: %s, resumeFloatBall: %b", Boolean.FALSE, true);
        }
        this.f163139B.dead();
        C56987s sVar = this.f163142f;
        if (sVar != null) {
            sVar.mo80434c();
        }
        Log.m105924i("MusicMainUINew", "onPause");
    }

    public void onResume() {
        C56987s sVar;
        super.onResume();
        this.f163139B.alive();
        if (!this.f163149p && (sVar = this.f163142f) != null) {
            sVar.mo80434c();
        }
        ((C59326j) C86312j.m106911c(C59326j.class)).N30().mo84423M(true);
        Log.m105924i("MusicMainUINew", "onResume");
    }
}
