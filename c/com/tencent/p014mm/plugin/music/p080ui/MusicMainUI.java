package com.tencent.p014mm.plugin.music.p080ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C0990q1;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.FetchAppBrandInfoForMusicEvent;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ShakeActionReport2Struct;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.widget.music.MusicSeekBar;
import com.tencent.p014mm.plugin.music.player.base.C94223g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.Future;
import junit.framework.Assert;
import ke3.C88144b;
import la2.C99358f;
import la2.C99364n;
import ma2.C99812l0;
import ma2.C99821w;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import p763ym.C79138l;
import q90.C101062d;
import qa2.C101083d;
import qc0.C101093a;
import qc0.C101106m;
import ra2.C101365a;
import ua2.C101991b;
import ud3.C101998d;
import wc3.C15141z;
import wd3.C78575u;

@C88989a(32)
/* renamed from: com.tencent.mm.plugin.music.ui.MusicMainUI */
public class MusicMainUI extends MMActivity implements ViewPager.OnPageChangeListener, C11385n {

    /* renamed from: I */
    public static final /* synthetic */ int f272228I = 0;

    /* renamed from: A */
    public long f272229A;

    /* renamed from: B */
    public int f272230B = 0;

    /* renamed from: C */
    public IListener f272231C = new IListener<MusicPlayerEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1155728636;
        }

        public boolean callback(IEvent iEvent) {
            MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
            Class cls = C99358f.class;
            int i = musicPlayerEvent.f9336d.f9337a;
            if (i != 13) {
                if (i != 14) {
                    switch (i) {
                        case 0:
                        case 1:
                            MusicMainUI.this.f272237d.setChecked(false);
                            MMHandlerThread.postToMainThread(new C94251p(this, musicPlayerEvent));
                            break;
                        case 2:
                        case 3:
                        case 4:
                            MusicMainUI.this.f272237d.setChecked(true);
                            break;
                        case 5:
                            PlaySound.play(MusicMainUI.this.getContext(), C0966R.string.j4p);
                            MMHandlerThread.postToMainThread(new C94253r(this));
                            break;
                        case 6:
                            MMHandlerThread.postToMainThread(new C94254s(this, musicPlayerEvent));
                            break;
                        case 7:
                            if (((C99358f) C101991b.m134284b(cls)).getMode() != 2) {
                                MusicMainUI.this.f272237d.setChecked(true);
                                break;
                            } else {
                                MMHandlerThread.postToMainThread(new C94252q(this));
                                break;
                            }
                        case 8:
                            MusicMainUI.this.f272240g.mo127321a(false);
                            break;
                    }
                } else if (((C99358f) C101991b.m134284b(cls)).getMode() == 2) {
                    MMHandlerThread.postToMainThread(new C94256u(this));
                }
            } else if (((C99358f) C101991b.m134284b(cls)).getMode() == 2) {
                MMHandlerThread.postToMainThread(new C94255t(this));
            }
            return false;
        }
    };

    /* renamed from: D */
    public Future<?> f272232D = null;

    /* renamed from: E */
    public MMHandler f272233E = new MMHandler(Looper.getMainLooper());

    /* renamed from: F */
    public int f272234F = -1;

    /* renamed from: G */
    public C94223g.C94224a f272235G = new C94237e();

    /* renamed from: H */
    public MMHandler f272236H = new C94233a(Looper.getMainLooper());

    /* renamed from: d */
    public CheckBox f272237d;

    /* renamed from: e */
    public ImageButton f272238e;

    /* renamed from: f */
    public ImageButton f272239f;

    /* renamed from: g */
    public MusicSeekBar f272240g;

    /* renamed from: h */
    public MusicViewPager f272241h;

    /* renamed from: i */
    public C101998d f272242i;

    /* renamed from: j */
    public C94243l f272243j;

    /* renamed from: n */
    public LinearLayout f272244n;

    /* renamed from: o */
    public TextView f272245o;

    /* renamed from: p */
    public ImageView f272246p;

    /* renamed from: q */
    public int f272247q;

    /* renamed from: r */
    public int f272248r;

    /* renamed from: s */
    public boolean f272249s;

    /* renamed from: t */
    public boolean f272250t;

    /* renamed from: u */
    public long f272251u = 0;

    /* renamed from: v */
    public long f272252v = 0;

    /* renamed from: w */
    public boolean f272253w = false;

    /* renamed from: x */
    public String f272254x = "";

    /* renamed from: y */
    public String f272255y = "";

    /* renamed from: z */
    public boolean f272256z = false;

    /* renamed from: com.tencent.mm.plugin.music.ui.MusicMainUI$a */
    public class C94233a extends MMHandler {
        public C94233a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                MusicMainUI musicMainUI = MusicMainUI.this;
                int i = MusicMainUI.f272228I;
                musicMainUI.mo129557R7();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.ui.MusicMainUI$b */
    public class C94234b implements View.OnClickListener {
        public C94234b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/music/ui/MusicMainUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MusicMainUI musicMainUI = MusicMainUI.this;
            int i = MusicMainUI.f272228I;
            Future<?> future = musicMainUI.f272232D;
            if (future != null) {
                future.cancel(false);
            }
            musicMainUI.f272232D = null;
            if (MusicMainUI.this.f272237d.isChecked()) {
                C101093a.m132485g();
                MusicMainUI.this.f272237d.setChecked(true);
            } else {
                MusicMainUI.this.f272249s = true;
                if (C99364n.m129616h().mo138822a().mo32211k()) {
                    C99364n.m129616h().mo138822a().resume();
                } else {
                    C99364n.m129616h().mo138834o((C101106m) null);
                }
                MusicMainUI.this.f272237d.setChecked(false);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/music/ui/MusicMainUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.ui.MusicMainUI$c */
    public class C94235c implements MusicSeekBar.C92920b {
        public C94235c() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.ui.MusicMainUI$d */
    public class C94236d implements View.OnClickListener {
        public C94236d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/music/ui/MusicMainUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MusicMainUI musicMainUI = MusicMainUI.this;
            int i = MusicMainUI.f272228I;
            musicMainUI.getClass();
            Class cls = C79138l.class;
            C101106m k = C99364n.m129616h().mo138832k();
            if (k == null) {
                Log.m105920e("MicroMsg.Music.MusicMainUI", "doJumpToApp wrapper is null");
            } else {
                Log.m105925i("MicroMsg.Music.MusicMainUI", "doJumpToApp MusicType:%d, SongWebUrl:%s, AppId:%s, srcUsername:%s", Integer.valueOf(k.f295959d), k.f295968p, k.f295972t, k.f295948I);
                C44561j appInfo = ((C79138l) C86312j.m106911c(cls)).getAppInfo(k.f295972t);
                if (appInfo != null) {
                    Log.m105925i("MicroMsg.Music.MusicMainUI", "packageName:%s", appInfo.field_packageName);
                } else {
                    Log.m105920e("MicroMsg.Music.MusicMainUI", "appInfo is null");
                }
                musicMainUI.f272253w = true;
                if (k.f295959d == 11) {
                    FetchAppBrandInfoForMusicEvent fetchAppBrandInfoForMusicEvent = new FetchAppBrandInfoForMusicEvent();
                    fetchAppBrandInfoForMusicEvent.publish();
                    FetchAppBrandInfoForMusicEvent.C80720a aVar = fetchAppBrandInfoForMusicEvent.f236206d;
                    String str = aVar.f236207a;
                    String str2 = aVar.f236209c;
                    String str3 = aVar.f236208b;
                    int i2 = aVar.f236210d;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    Log.m105925i("MicroMsg.Music.MusicMainUI", "from app brand, appId:%s, brandName:%s, pkgType:%d, appUserName:%s", str, str2, Integer.valueOf(i2), str3);
                    Log.m105924i("MicroMsg.Music.MusicMainUI", "launch app brand Application");
                    C99812l0.m130302g(str, str3, i2);
                } else if (!TextUtils.isEmpty(k.f295972t) && k.f295972t.equals("wx485a97c844086dc9")) {
                    Log.m105924i("MicroMsg.Music.MusicMainUI", "launch qq music Application");
                    musicMainUI.mo129552M7(256, k, C99812l0.m130297b(k, musicMainUI));
                } else if (!TextUtils.isEmpty(k.f295972t) && appInfo != null && !TextUtils.isEmpty(appInfo.field_packageName) && ((C79138l) C86312j.m106911c(cls)).Tb0(musicMainUI, k.f295972t)) {
                    Log.m105925i("MicroMsg.Music.MusicMainUI", "launch third party app, package name:%s", appInfo.field_packageName);
                    Intent launchIntentForPackage = MMApplicationContext.getContext().getPackageManager().getLaunchIntentForPackage(appInfo.field_packageName);
                    if (launchIntentForPackage != null) {
                        launchIntentForPackage.addFlags(268435456);
                        ((C79138l) C86312j.m106911c(cls)).Dm0(musicMainUI, launchIntentForPackage, appInfo.field_appName, new C94250o(musicMainUI), (Bundle) null);
                    } else {
                        Log.m105920e("MicroMsg.Music.MusicMainUI", "launchApp fail intent is null");
                    }
                } else if (!TextUtils.isEmpty(k.f295948I)) {
                    String str4 = k.f295968p;
                    if (str4 == null) {
                        str4 = k.f295966n;
                    }
                    Log.m105925i("MicroMsg.Music.MusicMainUI", "launch biz H5 url:%s", str4);
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", str4);
                    C88144b.m109791i(musicMainUI, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                } else {
                    String str5 = k.f295968p;
                    if (str5 == null) {
                        str5 = k.f295966n;
                    }
                    Log.m105925i("MicroMsg.Music.MusicMainUI", "launch H5 url:%s", str5);
                    Intent intent2 = new Intent();
                    intent2.putExtra("rawUrl", str5);
                    C88144b.m109791i(musicMainUI, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/music/ui/MusicMainUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.ui.MusicMainUI$e */
    public class C94237e implements C94223g.C94224a {
        public C94237e() {
        }

        /* renamed from: a */
        public void mo80435a(int i, int i2) {
            if (MusicMainUI.this.f272243j == null) {
                if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                    Assert.assertTrue("pager is null, err", false);
                }
                Log.m105928w("MicroMsg.Music.MusicMainUI", "pager is null, return");
                return;
            }
            if (MusicMainUI.this.f272247q == 1 && !MusicMainUI.this.f272249s) {
                float floatExtra = MusicMainUI.this.getIntent().getFloatExtra("key_offset", 0.0f);
                long currentTimeMillis = (long) (((float) (System.currentTimeMillis() - MusicMainUI.this.getIntent().getLongExtra("music_player_beg_time", 0))) + (floatExtra * 1000.0f));
                if (currentTimeMillis >= 0) {
                    MusicMainUI.this.f272243j.mo129568e(MusicMainUI.this.f272241h.getCurrentItem(), currentTimeMillis + 200);
                }
            } else if (i >= 0 && i2 > 0) {
                MusicMainUI.this.f272243j.mo129568e(MusicMainUI.this.f272241h.getCurrentItem(), (long) i);
            }
            Message message = new Message();
            message.what = 1;
            MusicMainUI.this.f272236H.sendMessage(message);
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.ui.MusicMainUI$f */
    public class C94238f implements Runnable {

        /* renamed from: d */
        public int f272263d;

        public C94238f(int i) {
            this.f272263d = i;
        }

        public void run() {
            Class cls = C99358f.class;
            ((C99358f) C101991b.m134284b(cls)).mo138811f0(this.f272263d);
            C101365a U = ((C99358f) C101991b.m134284b(cls)).mo138809U();
            if (U != null) {
                if (U.mo140849l2()) {
                    MusicMainUI.this.mo129554O7(U);
                }
                if (((C99358f) C101991b.m134284b(cls)).mo138813h()) {
                    MusicMainUI.this.f272241h.setCanSlide(true);
                }
                MusicMainUI musicMainUI = MusicMainUI.this;
                int i = MusicMainUI.f272228I;
                musicMainUI.mo129556Q7(U);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.ui.MusicMainUI$g */
    public class C94239g extends C101998d.C101999a {
        public C94239g(C94234b bVar) {
        }

        public void onRelease() {
        }

        public void onShake(boolean z) {
            Log.m105925i("MicroMsg.Music.MusicMainUI", "shake %b", Boolean.valueOf(z));
            long ticksToNow = Util.ticksToNow(MusicMainUI.this.f272229A);
            if (ticksToNow < 1200) {
                Log.m105924i("MicroMsg.Music.MusicMainUI", "tryStartShake delay too short:" + ticksToNow);
                return;
            }
            Log.m105928w("MicroMsg.Music.MusicMainUI", "tryStartShake delay too enough:" + ticksToNow);
            MusicMainUI.this.f272229A = Util.currentTicks();
            MusicMainUI musicMainUI = MusicMainUI.this;
            int i = musicMainUI.f272230B + 1;
            musicMainUI.f272230B = i;
            if (i % 2 == 0) {
                ((C99358f) C101991b.m134284b(C99358f.class)).mo138816m0(MusicMainUI.this.f272248r);
            }
        }
    }

    /* renamed from: M7 */
    public final void mo129552M7(int i, C101106m mVar, boolean z) {
        ShakeActionReport2Struct shakeActionReport2Struct = new ShakeActionReport2Struct();
        shakeActionReport2Struct.f156835d = i;
        shakeActionReport2Struct.f156836e = System.currentTimeMillis();
        shakeActionReport2Struct.f156841j = shakeActionReport2Struct.mo86045b("SessionID", getIntent().getStringExtra("session_id"), true);
        int i2 = C99812l0.f292500a;
        long j = 1;
        shakeActionReport2Struct.f156849r = !Util.isNullOrNil(mVar.f295967o) || !Util.isNullOrNil(mVar.f295968p) || !Util.isNullOrNil(mVar.f295966n) ? 1 : 3;
        shakeActionReport2Struct.f156846o = shakeActionReport2Struct.mo86045b("ToSongDataurl", mVar.f295966n, true);
        shakeActionReport2Struct.f156843l = shakeActionReport2Struct.mo86045b("ToSongName", mVar.f295962g, true);
        shakeActionReport2Struct.f156838g = shakeActionReport2Struct.mo86045b("ToSongOrTv", mVar.f295960e, true);
        shakeActionReport2Struct.f156844m = shakeActionReport2Struct.mo86045b("ToSongSinger", mVar.f295963h, true);
        shakeActionReport2Struct.f156845n = shakeActionReport2Struct.mo86045b("ToSongWeburl", mVar.f295968p, true);
        if (!z) {
            j = 2;
        }
        shakeActionReport2Struct.f156847p = j;
        shakeActionReport2Struct.mo86054n();
    }

    /* renamed from: N7 */
    public final void mo129553N7(View view) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin + C85875k4.m106198o(getContext()), layoutParams.rightMargin, layoutParams.bottomMargin);
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: O7 */
    public void mo129554O7(C101365a aVar) {
        ImageButton imageButton;
        C101365a U = ((C99358f) C101991b.m134284b(C99358f.class)).mo138809U();
        if (U != null) {
            if ((aVar == null ? false : U.field_musicId.equals(aVar.field_musicId)) && (imageButton = this.f272239f) != null && this.f272238e != null && this.f272237d != null && imageButton.getBackground() != null && this.f272238e.getBackground() != null && this.f272237d.getBackground() != null && this.f272240g != null) {
                if (aVar.mo140849l2()) {
                    int i = aVar.field_songLyricColor;
                    this.f272239f.getBackground().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
                    this.f272238e.getBackground().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
                    this.f272237d.getBackground().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
                    this.f272240g.setColor(i);
                    this.f272245o.setTextColor(i);
                    this.f272246p.getDrawable().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
                    return;
                }
                this.f272239f.getBackground().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                this.f272238e.getBackground().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                this.f272237d.getBackground().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                this.f272240g.setColor(-1);
                this.f272245o.setTextColor(-1);
                this.f272246p.getDrawable().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
            }
        }
    }

    /* renamed from: P7 */
    public final void mo129555P7() {
        C94243l lVar = this.f272243j;
        lVar.f272277i = 200000;
        lVar.notifyDataSetChanged();
        if (((C99358f) C101991b.m134284b(C99358f.class)).mo138813h()) {
            this.f272241h.setCanSlide(true);
        } else {
            this.f272241h.setCanSlide(false);
        }
    }

    /* renamed from: Q7 */
    public final void mo129556Q7(C101365a aVar) {
        if (!C99812l0.m130303h(aVar) || this.f272250t) {
            this.f272237d.setVisibility(4);
            this.f272239f.setVisibility(4);
            return;
        }
        this.f272237d.setVisibility(0);
        this.f272239f.setVisibility(0);
    }

    /* renamed from: R7 */
    public final void mo129557R7() {
        int playPosition = C99364n.m129616h().mo138822a().getPlayPosition();
        int duration = C99364n.m129616h().mo138822a().getDuration();
        if (playPosition > 0 && duration > 0) {
            this.f272240g.setProgress(playPosition);
            this.f272240g.setMaxProgress(duration);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bin;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Bitmap bitmap;
        if (-1 == i2 && 1 == i) {
            C101106m k = C99364n.m129616h().mo138832k();
            int i3 = C99812l0.f292500a;
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            WXMusicObject wXMusicObject = new WXMusicObject();
            wXMusicObject.musicUrl = k.f295968p;
            wXMusicObject.musicDataUrl = k.f295966n;
            String str = k.f295967o;
            wXMusicObject.musicLowBandUrl = str;
            wXMusicObject.musicLowBandDataUrl = str;
            wXMusicObject.songAlbumUrl = k.f295976x;
            wXMusicObject.songLyric = k.f295969q;
            WXMediaMessage wXMediaMessage = new WXMediaMessage();
            wXMediaMessage.mediaObject = wXMusicObject;
            wXMediaMessage.title = k.f295962g;
            wXMediaMessage.description = k.f295963h;
            String f = C99812l0.m130301f(k);
            if (f == null || !C86013q1.m106450k(f)) {
                bitmap = null;
            } else {
                int dimension = (int) getResources().getDimension(C0966R.dimen.f3919iy);
                bitmap = BitmapUtil.getBitmapNative(f, dimension, dimension);
            }
            if (bitmap != null) {
                wXMediaMessage.thumbData = Util.bmpToByteArray(bitmap, true);
            } else {
                wXMediaMessage.thumbData = Util.bmpToByteArray(BitmapUtil.getBitmapNative((int) C0966R.C0969drawable.bzf), true);
            }
            String d = ((C79138l) C86312j.m106911c(C79138l.class)).mo73994Lc(C99812l0.m130299d(k)) ? C99812l0.m130299d(k) : "";
            C15141z yM = ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM();
            if (yM != null) {
                String e = C99812l0.m130300e(k);
                String string = getResources().getString(C0966R.string.a0s);
                String str2 = wXMediaMessage.title;
                StringBuffer stringBuffer = new StringBuffer(string);
                stringBuffer.append(str2);
                String stringBuffer2 = stringBuffer.toString();
                C78575u.C78583h hVar = new C78575u.C78583h(this);
                hVar.mo108578p(stringExtra);
                hVar.mo108571i(stringBuffer2);
                hVar.mo108573k(C0966R.string.bjd);
                hVar.mo108569g(Boolean.TRUE);
                hVar.mo108563a(new C0990q1((C67654r1) yM, wXMediaMessage, d, e, stringExtra, this));
                hVar.mo108574l();
                Log.m105925i("MicroMsg.Music.MusicUtil", "succeed to share to friend:%s", stringExtra);
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onClickBack(View view) {
        Log.m105924i("MicroMsg.Music.MusicMainUI", "onClickBack finish");
        finish();
    }

    public void onClickSend(View view) {
        C101106m k = C99364n.m129616h().mo138832k();
        Log.m105925i("MicroMsg.Music.MusicMainUI", "MusicType:%d, SongWebUrl ", Integer.valueOf(k.f295959d), k.f295968p);
        if (k.f295959d == 11) {
            FetchAppBrandInfoForMusicEvent fetchAppBrandInfoForMusicEvent = new FetchAppBrandInfoForMusicEvent();
            fetchAppBrandInfoForMusicEvent.publish();
            FetchAppBrandInfoForMusicEvent.C80720a aVar = fetchAppBrandInfoForMusicEvent.f236206d;
            String str = aVar.f236207a;
            String str2 = aVar.f236209c;
            String str3 = aVar.f236208b;
            int i = aVar.f236210d;
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            Log.m105925i("MicroMsg.Music.MusicMainUI", "from app brand, appId:%s, brandName:%s, pkgType:%d, appUserName:%s", str, str2, Integer.valueOf(i), str3);
            String string = getString(C0966R.string.feu, new Object[]{str2});
            if (!TextUtils.isEmpty(k.f295968p)) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = {getString(C0966R.string.f361082h43), getString(C0966R.string.h44), getString(C0966R.string.b7o), string};
                arrayList.add(0);
                arrayList.add(2);
                arrayList.add(3);
                arrayList.add(4);
                C76879j.m92736g(this, "", strArr, "", new C94258w(this, k, str, str3, i));
                return;
            }
            new ArrayList().add(1);
            C76879j.m92736g(this, "", new String[]{string}, "", new C94259x(this, str, str3, i));
        } else if (!TextUtils.isEmpty(k.f295968p)) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr2 = {getString(C0966R.string.f361082h43), getString(C0966R.string.h44), getString(C0966R.string.b7o), getString(C0966R.string.cmv)};
            arrayList2.add(0);
            arrayList2.add(2);
            arrayList2.add(3);
            arrayList2.add(4);
            C76879j.m92736g(this, "", strArr2, "", new C94260y(this, k));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r0 = r22
            java.lang.Class<la2.f> r1 = la2.C99358f.class
            super.onCreate(r23)
            android.content.Intent r2 = r22.getIntent()
            java.lang.String r3 = "session_id"
            r2.getStringExtra(r3)
            r22.hideTitleView()
            la2.n r2 = la2.C99364n.f291354g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001c
            r2 = 1
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            java.lang.String r5 = "MicroMsg.Music.MusicMainUI"
            if (r2 != 0) goto L_0x002a
            r22.finish()
            java.lang.String r1 = "MusicPlayerManager is not init!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            return
        L_0x002a:
            android.content.Intent r2 = r22.getIntent()
            r6 = 2
            java.lang.String r7 = "key_mode"
            int r2 = r2.getIntExtra(r7, r6)
            r0.f272247q = r2
            android.content.Intent r2 = r22.getIntent()
            java.lang.String r7 = "key_scene"
            int r2 = r2.getIntExtra(r7, r3)
            r0.f272248r = r2
            android.content.Intent r2 = r22.getIntent()
            java.lang.String r7 = "KGlobalShakeMusic"
            boolean r2 = r2.getBooleanExtra(r7, r3)
            r0.f272250t = r2
            r2 = 2131316276(0x7f094e34, float:1.8251029E38)
            android.view.View r2 = r0.findViewById(r2)
            com.tencent.mm.plugin.music.ui.MusicViewPager r2 = (com.tencent.p014mm.plugin.music.p080ui.MusicViewPager) r2
            r0.f272241h = r2
            com.tencent.mm.plugin.music.ui.l r2 = new com.tencent.mm.plugin.music.ui.l
            int r7 = r0.f272248r
            boolean r8 = r0.f272250t
            r2.<init>(r0, r7, r8)
            r0.f272243j = r2
            com.tencent.mm.plugin.music.ui.MusicViewPager r7 = r0.f272241h
            r7.setAdapter(r2)
            com.tencent.mm.plugin.music.ui.MusicViewPager r2 = r0.f272241h
            r2.setOnPageChangeListener(r0)
            com.tencent.mm.plugin.music.ui.MusicViewPager r2 = r0.f272241h
            r7 = 4096(0x1000, float:5.74E-42)
            r2.setSystemUiVisibility(r7)
            r2 = 2131297513(0x7f0904e9, float:1.8212973E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageButton r2 = (android.widget.ImageButton) r2
            r0.f272238e = r2
            r2 = 2131313165(0x7f09420d, float:1.824472E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageButton r2 = (android.widget.ImageButton) r2
            r0.f272239f = r2
            boolean r2 = r0.f272256z
            if (r2 != 0) goto L_0x00a8
            androidx.appcompat.app.AppCompatActivity r2 = r22.getContext()
            boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106205t(r2, r3)
            if (r2 == 0) goto L_0x00a8
            android.widget.ImageButton r2 = r0.f272238e
            r0.mo129553N7(r2)
            android.widget.ImageButton r2 = r0.f272239f
            r0.mo129553N7(r2)
            r0.f272256z = r4
        L_0x00a8:
            r2 = 2131309822(0x7f0934fe, float:1.8237939E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            r0.f272237d = r2
            la2.n r7 = la2.C99364n.m129616h()
            com.tencent.mm.plugin.music.player.base.g r7 = r7.mo138822a()
            boolean r7 = r7.mo32206f()
            r7 = r7 ^ r4
            r2.setChecked(r7)
            ud3.d r2 = new ud3.d
            r2.<init>(r0)
            r0.f272242i = r2
            android.widget.CheckBox r2 = r0.f272237d
            com.tencent.mm.plugin.music.ui.MusicMainUI$b r7 = new com.tencent.mm.plugin.music.ui.MusicMainUI$b
            r7.<init>()
            r2.setOnClickListener(r7)
            com.tencent.mm.sdk.event.IListener r2 = r0.f272231C
            r2.alive()
            r2 = 2131309826(0x7f093502, float:1.8237947E38)
            android.view.View r2 = r0.findViewById(r2)
            com.tencent.mm.plugin.appbrand.widget.music.MusicSeekBar r2 = (com.tencent.p014mm.plugin.appbrand.widget.music.MusicSeekBar) r2
            r0.f272240g = r2
            com.tencent.mm.plugin.music.ui.MusicMainUI$c r7 = new com.tencent.mm.plugin.music.ui.MusicMainUI$c
            r7.<init>()
            r2.setOnSeekBarChange(r7)
            r2 = 2131309830(0x7f093506, float:1.8237955E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r0.f272244n = r2
            r2 = 2131309804(0x7f0934ec, float:1.8237902E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r2 = 2131305161(0x7f0922c9, float:1.8228485E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f272245o = r2
            r2 = 2131305160(0x7f0922c8, float:1.8228483E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f272246p = r2
            android.widget.LinearLayout r2 = r0.f272244n
            com.tencent.mm.plugin.music.ui.MusicMainUI$d r7 = new com.tencent.mm.plugin.music.ui.MusicMainUI$d
            r7.<init>()
            r2.setOnClickListener(r7)
            android.widget.LinearLayout r2 = r0.f272244n
            r7 = 8
            r2.setVisibility(r7)
            ud3.d r2 = r0.f272242i
            android.hardware.SensorManager r2 = r2.f300319a
            if (r2 != 0) goto L_0x0135
            java.lang.String r2 = "MicroMsg.ShakeSensorService"
            java.lang.String r8 = "cannot init sensor manager"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r8)
            goto L_0x0143
        L_0x0135:
            java.util.List r2 = r2.getSensorList(r4)
            if (r2 == 0) goto L_0x0143
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0143
            r2 = 1
            goto L_0x0144
        L_0x0143:
            r2 = 0
        L_0x0144:
            if (r2 != 0) goto L_0x014c
            java.lang.String r2 = "not support shake"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r2)
        L_0x014c:
            r22.mo129555P7()
            int r2 = r0.f272248r
            ua2.a r5 = ua2.C101991b.m134284b(r1)
            la2.f r5 = (la2.C99358f) r5
            ra2.a r5 = r5.mo138809U()
            r8 = 5
            r9 = 4
            r10 = 3
            if (r5 == 0) goto L_0x01bf
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r11 = 13041(0x32f1, float:1.8274E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r7[r3] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r7[r4] = r12
            java.lang.String r12 = r5.field_musicId
            r7[r6] = r12
            java.lang.String r12 = r5.field_songName
            r7[r10] = r12
            java.lang.String r12 = r5.field_songAlbum
            r7[r9] = r12
            int r12 = r5.field_songId
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r7[r8] = r12
            java.lang.String r12 = r5.field_songSinger
            r13 = 6
            r7[r13] = r12
            java.lang.String r12 = r5.field_appId
            r14 = 7
            r7[r14] = r12
            java.lang.String r12 = "MicroMsg.Music.MusicReportUtil"
            java.lang.String r15 = "kvReportEnterMusicUI: %d, %d, %s, %s, %s, %s, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r12, r15, r7)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r12 = new java.lang.Object[r14]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12[r3] = r2
            java.lang.String r2 = r5.field_musicId
            r12[r4] = r2
            java.lang.String r2 = r5.field_songName
            r12[r6] = r2
            java.lang.String r2 = r5.field_songAlbum
            r12[r10] = r2
            int r2 = r5.field_songId
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12[r9] = r2
            java.lang.String r2 = r5.field_songSinger
            r12[r8] = r2
            java.lang.String r2 = r5.field_appId
            r12[r13] = r2
            r7.mo160131h(r11, r12)
        L_0x01bf:
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 285(0x11d, double:1.41E-321)
            r17 = 1
            r19 = 1
            r21 = 0
            r14.idkeyStat(r15, r17, r19, r21)
            ua2.a r2 = ua2.C101991b.m134284b(r1)
            la2.f r2 = (la2.C99358f) r2
            ra2.a r2 = r2.mo138809U()
            if (r2 != 0) goto L_0x01f2
            android.content.Intent r5 = r22.getIntent()
            java.lang.String r7 = "db_music_id"
            java.lang.String r5 = r5.getStringExtra(r7)
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L_0x01f2
            ua2.a r2 = ua2.C101991b.m134284b(r1)
            la2.f r2 = (la2.C99358f) r2
            ra2.a r2 = r2.mo138815i0(r5)
        L_0x01f2:
            if (r2 != 0) goto L_0x01f8
            r22.finish()
            return
        L_0x01f8:
            com.tencent.mm.plugin.music.ui.MusicViewPager r5 = r0.f272241h
            r7 = 100000(0x186a0, float:1.4013E-40)
            ua2.a r11 = ua2.C101991b.m134284b(r1)
            la2.f r11 = (la2.C99358f) r11
            int r11 = r11.mo138817q()
            int r11 = r11 + r7
            r5.setCurrentItem(r11)
            int r5 = r0.f272248r
            if (r5 != r9) goto L_0x0245
            ua2.a r1 = ua2.C101991b.m134284b(r1)
            la2.f r1 = (la2.C99358f) r1
            int r1 = r1.getMode()
            if (r1 != r6) goto L_0x0245
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r5 = 83
            int r1 = r1.mo119688i(r5, r3)
            if (r1 >= r10) goto L_0x0245
            r6 = 2131830528(0x7f112700, float:1.9294056E38)
            android.widget.Toast r6 = p910lj.C76701a.makeText((android.content.Context) r0, (int) r6, (int) r3)
            r6.show()
            int r1 = r1 + r4
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.mo119676J(r5, r1)
        L_0x0245:
            int r1 = r0.f272248r
            if (r1 != r8) goto L_0x024c
            qa2.C101083d.m132454c(r3, r2)
        L_0x024c:
            r0.mo129556Q7(r2)
            int r1 = r0.f272247q
            if (r1 != r4) goto L_0x0267
            zt3.t r1 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.music.ui.v r3 = new com.tencent.mm.plugin.music.ui.v
            r3.<init>(r0)
            r2 = r1
            zt3.j r2 = (zt3.C119157j) r2
            r4 = 0
            r6 = 500(0x1f4, double:2.47E-321)
            lu3.c r1 = r2.mo183872c(r3, r4, r6)
            r0.f272232D = r1
        L_0x0267:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.music.p080ui.MusicMainUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C101998d dVar = this.f272242i;
        if (dVar != null) {
            dVar.mo141498b();
        }
        C94243l lVar = this.f272243j;
        if (lVar != null) {
            lVar.f272283r.removeCallbacksAndMessages((Object) null);
            C99821w wVar = lVar.f272279n;
            wVar.f292519e.removeCallbacksAndMessages((Object) null);
            ((C101062d) wVar.f292515a).clear();
        }
        MusicSeekBar musicSeekBar = this.f272240g;
        if (musicSeekBar != null) {
            musicSeekBar.mo127321a(false);
        }
        Future<?> future = this.f272232D;
        if (future != null) {
            future.cancel(false);
        }
        this.f272232D = null;
        this.f272231C.dead();
        C99364n.m129616h().mo138828g(this.f272235G);
        if (!C99364n.m129616h().mo138822a().mo32206f()) {
            C99364n.m129616h().mo138822a().mo32210j();
        }
        ((C99358f) C101991b.m134284b(C99358f.class)).mo138820y();
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        Log.m105925i("MicroMsg.Music.MusicMainUI", "onPageSelected %d", Integer.valueOf(i));
        if (((C99358f) C101991b.m134284b(C99358f.class)).mo138813h()) {
            this.f272241h.setCanSlide(false);
        }
        this.f272233E.removeCallbacksAndMessages((Object) null);
        this.f272233E.postDelayed(new C94238f(i), 500);
        if (this.f272234F == -1) {
            this.f272234F = i;
        }
        if (this.f272234F != i) {
            this.f272234F = i;
            C101083d.f295908a = true;
            C115669n.INSTANCE.idkeyStat(285, 3, 1, false);
            C101083d.m132453b(1, this.f272248r);
        }
    }

    public void onPause() {
        super.onPause();
        this.f272252v = System.currentTimeMillis();
        C101106m k = C99364n.m129616h().mo138832k();
        C101365a U = ((C99358f) C101991b.m134284b(C99358f.class)).mo138809U();
        if (!(k == null || U == null)) {
            int i = 1;
            boolean z = !TextUtils.isEmpty(U.field_songLyric);
            if (!TextUtils.isEmpty(k.f295949J)) {
                this.f272254x = k.f295949J;
            }
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[13];
            objArr[0] = "";
            objArr[1] = "";
            objArr[2] = Long.valueOf(this.f272251u);
            objArr[3] = Long.valueOf(this.f272252v);
            objArr[4] = U.field_songName;
            objArr[5] = 0;
            objArr[6] = null;
            objArr[7] = Integer.valueOf(z ? 1 : 0);
            objArr[8] = Integer.valueOf(this.f272253w ? 1 : 0);
            objArr[9] = Integer.valueOf(k.f295959d);
            objArr[10] = this.f272254x;
            objArr[11] = this.f272255y;
            if (this.f272248r != 9) {
                i = 0;
            }
            objArr[12] = Integer.valueOf(i);
            nVar.mo160131h(17629, objArr);
        }
        C101998d dVar = this.f272242i;
        if (dVar != null) {
            dVar.mo141498b();
        }
        C99364n.m129616h().mo138828g(this.f272235G);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r4 = this;
            java.lang.Class<la2.f> r0 = la2.C99358f.class
            super.onResume()
            long r1 = java.lang.System.currentTimeMillis()
            r4.f272251u = r1
            r1 = 0
            r4.f272253w = r1
            ua2.a r2 = ua2.C101991b.m134284b(r0)
            la2.f r2 = (la2.C99358f) r2
            boolean r2 = r2.mo138810V()
            r3 = 1
            if (r2 == 0) goto L_0x0059
            boolean r0 = r4.f272250t
            if (r0 != 0) goto L_0x006a
            ud3.d r0 = r4.f272242i
            if (r0 == 0) goto L_0x0052
            android.hardware.SensorManager r0 = r0.f300319a
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "MicroMsg.ShakeSensorService"
            java.lang.String r2 = "cannot init sensor manager"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            goto L_0x003d
        L_0x002f:
            java.util.List r0 = r0.getSensorList(r3)
            if (r0 == 0) goto L_0x003d
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            if (r0 == 0) goto L_0x0052
            ud3.d r0 = r4.f272242i
            ud3.d$a r2 = r0.f300320b
            if (r2 == 0) goto L_0x0047
            r1 = 1
        L_0x0047:
            if (r1 != 0) goto L_0x0052
            com.tencent.mm.plugin.music.ui.MusicMainUI$g r1 = new com.tencent.mm.plugin.music.ui.MusicMainUI$g
            r2 = 0
            r1.<init>(r2)
            r0.mo141497a(r1)
        L_0x0052:
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r4.f272229A = r0
            goto L_0x006a
        L_0x0059:
            java.lang.String r1 = "MicroMsg.Music.MusicMainUI"
            java.lang.String r2 = "no need to shake music"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            ua2.a r0 = ua2.C101991b.m134284b(r0)
            la2.f r0 = (la2.C99358f) r0
            r0.mo138819v(r3)
        L_0x006a:
            la2.n r0 = la2.C99364n.m129616h()
            com.tencent.mm.plugin.music.player.base.g r0 = r0.mo138822a()
            com.tencent.mm.plugin.music.player.base.g$a r1 = r4.f272235G
            sa2.a r0 = (sa2.C101555a) r0
            r0.mo141033x(r1)
            r4.mo129557R7()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.music.p080ui.MusicMainUI.onResume():void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            getWindow().getDecorView().setSystemUiVisibility(1280);
            setActionbarColor(getContext().getResources().getColor(C0966R.color.ahf));
            hideActionbarLine();
            if (!this.f272256z) {
                ImageButton imageButton = this.f272238e;
                if (imageButton != null) {
                    mo129553N7(imageButton);
                }
                ImageButton imageButton2 = this.f272239f;
                if (imageButton2 != null) {
                    mo129553N7(imageButton2);
                }
                this.f272256z = true;
            }
        }
    }
}
