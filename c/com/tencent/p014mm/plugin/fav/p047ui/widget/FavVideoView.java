package com.tencent.p014mm.plugin.fav.p047ui.widget;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcdntran.C55385t;
import com.tencent.p014mm.modelcdntran.C92795s;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerSeekBar;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoTextureView;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Objects;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import og2.C100336e;
import og2.C100339h;
import og2.C100344n;
import p206nj.C11171e;
import p500dy.C97560f;
import p663qo.C63287k;
import p682rz.C36594q;
import pb1.C100718j1;
import pb1.C100723m0;
import pb1.C100746u;
import pc1.C100779g;
import pc1.C100780h;
import pc1.C100781i;
import pc1.C100782j;
import qg2.C101136b0;
import xb1.C102612a;
import xn2.C102693c;

/* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavVideoView */
public class FavVideoView extends RelativeLayout implements C96875r0.C96876a, View.OnClickListener {

    /* renamed from: A */
    public MMPinProgressBtn f270518A;

    /* renamed from: B */
    public String f270519B;

    /* renamed from: C */
    public int f270520C;

    /* renamed from: D */
    public C93722g f270521D;

    /* renamed from: E */
    public RelativeLayout f270522E;

    /* renamed from: F */
    public MTimerHandler f270523F;

    /* renamed from: G */
    public MTimerHandler f270524G;

    /* renamed from: H */
    public C102693c f270525H;

    /* renamed from: I */
    public boolean f270526I;

    /* renamed from: J */
    public C93720f f270527J;

    /* renamed from: d */
    public String f270528d;

    /* renamed from: e */
    public MMHandler f270529e;

    /* renamed from: f */
    public ImageView f270530f;

    /* renamed from: g */
    public C96875r0 f270531g;

    /* renamed from: h */
    public TextView f270532h;

    /* renamed from: i */
    public LinearLayout f270533i;

    /* renamed from: j */
    public View f270534j;

    /* renamed from: n */
    public ImageView f270535n;

    /* renamed from: o */
    public VideoPlayerSeekBar f270536o;

    /* renamed from: p */
    public RelativeLayout f270537p;

    /* renamed from: q */
    public String f270538q;

    /* renamed from: r */
    public boolean f270539r;

    /* renamed from: s */
    public boolean f270540s;

    /* renamed from: t */
    public int f270541t;

    /* renamed from: u */
    public boolean f270542u;

    /* renamed from: v */
    public int f270543v;

    /* renamed from: w */
    public boolean f270544w;

    /* renamed from: x */
    public boolean f270545x;

    /* renamed from: y */
    public boolean f270546y;

    /* renamed from: z */
    public ProgressBar f270547z;

    /* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavVideoView$e */
    public class C2298e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f12445d;

        public C2298e(String str) {
            this.f12445d = str;
        }

        public void run() {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            FileProviderHelper.setIntentDataAndType(FavVideoView.this.getContext(), intent, new C86009m1(this.f12445d), "video/*", false);
            try {
                Context context = FavVideoView.this.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$7", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$7", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception unused) {
                Log.m105920e(FavVideoView.this.f270528d, "startActivity fail, activity not found");
                C76879j.m92738i(FavVideoView.this.getContext(), C0966R.string.cpc, C0966R.string.cpd);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavVideoView$a */
    public class C93716a implements MTimerHandler.CallBack {
        public C93716a() {
        }

        public boolean onTimerExpired() {
            FavVideoView favVideoView = FavVideoView.this;
            favVideoView.f270543v = favVideoView.getPalyPosition();
            FavVideoView.this.f270536o.seek(Math.max(0, FavVideoView.this.f270543v / 1000));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavVideoView$b */
    public class C93717b implements MTimerHandler.CallBack {
        public C93717b() {
        }

        public boolean onTimerExpired() {
            FavVideoView favVideoView = FavVideoView.this;
            if (!favVideoView.f270545x) {
                return false;
            }
            favVideoView.mo128627b();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavVideoView$c */
    public class C93718c implements C102693c {
        public C93718c() {
        }

        /* renamed from: a */
        public void mo4335a(int i) {
            if (!FavVideoView.this.mo128628c()) {
                FavVideoView.this.f270523F.startTimer(500);
                FavVideoView.this.setVideoStateIv(false);
            }
            FavVideoView.this.mo128632g(i);
            FavVideoView favVideoView = FavVideoView.this;
            if (favVideoView.f270545x) {
                favVideoView.f270524G.startTimer(4000);
            }
        }

        /* renamed from: c */
        public void mo4336c(int i) {
        }

        public void onSeekPre() {
            FavVideoView favVideoView = FavVideoView.this;
            if (favVideoView.f270531g.isPlaying()) {
                Log.m105924i(favVideoView.f270528d, "VideoPlay: pausePlay()");
                favVideoView.f270531g.pause();
            }
            FavVideoView.this.f270524G.stopTimer();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavVideoView$d */
    public class C93719d implements Runnable {
        public C93719d() {
        }

        public void run() {
            FavVideoView favVideoView = FavVideoView.this;
            if (favVideoView.f270531g != null) {
                favVideoView.mo128631f(favVideoView.f270538q);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavVideoView$f */
    public class C93720f implements C100339h, C100723m0, C92795s {

        /* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavVideoView$f$a */
        public class C93721a implements Runnable {
            public C93721a() {
            }

            public void run() {
                FavVideoView favVideoView = FavVideoView.this;
                if (favVideoView.f270531g != null) {
                    favVideoView.mo128631f(favVideoView.f270538q);
                }
            }
        }

        public C93720f(C93716a aVar) {
        }

        /* renamed from: R4 */
        public void mo128275R4(C100746u uVar) {
            if (uVar != null && !Util.isNullOrNil(uVar.field_dataId) && uVar.field_dataId.equals(FavVideoView.this.f270519B)) {
                mo128648a(uVar.field_status, uVar.field_path, uVar.field_offset, uVar.field_totalLen);
            }
        }

        /* renamed from: a */
        public void mo128648a(int i, String str, int i2, int i3) {
            Log.m105919d(FavVideoView.this.f270528d, "onCdnStatusChanged status:%s, offset:%s, totalLength:%s, path:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
            if ((i == 3 || i == 2) && C86013q1.m106450k(str)) {
                FavVideoView.this.f270531g.stop();
                FavVideoView favVideoView = FavVideoView.this;
                favVideoView.f270529e.post(new C100779g(favVideoView));
                FavVideoView.this.f270538q = str;
                MMHandlerThread.postToMainThread(new C93721a());
                return;
            }
            FavVideoView favVideoView2 = FavVideoView.this;
            favVideoView2.f270529e.post(new C100781i(favVideoView2, i2, i3));
        }

        /* renamed from: i1 */
        public void mo128649i1(int i, C100344n nVar) {
            if (nVar != null && nVar.field_dataId.equals(FavVideoView.this.f270519B)) {
                mo128648a(nVar.field_status, nVar.field_path, nVar.field_offset, nVar.field_totalLen);
            }
        }

        /* renamed from: o2 */
        public void mo76200o2(int i, C55385t tVar) {
            if (!Objects.equals(FavVideoView.this.f270519B, tVar.f157721c)) {
                return;
            }
            if (i == 1) {
                mo128648a(2, tVar.f157726h, (int) tVar.f157723e, (int) tVar.f157724f);
            } else if (i == 4) {
                mo128648a(1, tVar.f157726h, (int) tVar.f157723e, (int) tVar.f157724f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavVideoView$g */
    public interface C93722g {
        void finish();
    }

    public FavVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: M0 */
    public int mo76207M0(int i, int i2) {
        return 0;
    }

    /* renamed from: a */
    public void mo128626a() {
        if (!this.f270544w) {
            Log.m105924i(this.f270528d, "handleSingleClck isPrepared:false");
        } else if (this.f270545x) {
            mo128627b();
        } else {
            mo128636i();
        }
    }

    /* renamed from: b */
    public void mo128627b() {
        Log.m105924i(this.f270528d, "hide video tool bar");
        View view = this.f270534j;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "hideVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "hideVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f270535n.setVisibility(8);
        this.f270545x = false;
    }

    /* renamed from: c */
    public boolean mo128628c() {
        C96875r0 r0Var = this.f270531g;
        if (r0Var == null) {
            return false;
        }
        return r0Var.isPlaying();
    }

    /* renamed from: d */
    public void mo128629d() {
        Log.m105924i(this.f270528d, "VideoPlay:   onDestroy()");
        this.f270526I = false;
        this.f270523F.stopTimer();
        this.f270524G.stopTimer();
        this.f270536o.seek(0);
        setVideoStateIv(true);
        this.f270524G.stopTimer();
        try {
            ((C63287k) C86312j.m106911c(C63287k.class)).mo88181kj(this.f270527J);
            ((C101136b0) ((C100336e) C86312j.m106911c(C100336e.class)).mo139410hi()).mo140582bD(this.f270527J);
            ((C102612a) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128198DE()).mo142250SE(this.f270527J);
            this.f270531g.stop();
        } catch (Throwable th) {
            Log.m105921e(this.f270528d, "onDestroy() %s %s", th.getClass().getSimpleName(), th.getMessage());
        }
    }

    /* renamed from: e */
    public void mo128630e() {
        Log.m105925i(this.f270528d, "VideoPlay:   onResume() isStartAfterPrepared:%s", Boolean.valueOf(this.f270546y));
        ((C101136b0) ((C100336e) C86312j.m106911c(C100336e.class)).mo139410hi()).mo140583jo(this.f270527J);
        ((C102612a) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128198DE()).mo142255jo(this.f270527J);
        ((C63287k) C86312j.m106911c(C63287k.class)).mo88185wy(this.f270527J);
        if (this.f270539r) {
            return;
        }
        if (Util.isNullOrNil(this.f270538q) || !C86013q1.m106450k(this.f270538q)) {
            Log.m105924i(this.f270528d, "VideoPlay: fullPath is  null, show error, toggleVideo()");
            this.f270529e.post(new C100780h(this, false));
            return;
        }
        Log.m105924i(this.f270528d, "VideoPlay: fullPath is not null,exist,  toggleVideo()");
        this.f270529e.post(new C100779g(this));
        mo128631f(this.f270538q);
    }

    /* renamed from: f */
    public void mo128631f(String str) {
        Log.m105924i(this.f270528d, "VideoPlay: prepareVideo");
        if (Util.isNullOrNil(str)) {
            Log.m105921e(this.f270528d, "VideoPlay: %d prepare video but filepath is null.", Integer.valueOf(hashCode()));
            return;
        }
        C96875r0 r0Var = this.f270531g;
        if (r0Var != null) {
            if (r0Var instanceof VideoPlayerTextureView) {
                ((VideoPlayerTextureView) r0Var).setNeedResetExtractor(C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, false));
            }
            View view = (View) this.f270531g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "prepareVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "prepareVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = (View) this.f270531g;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "prepareVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "prepareVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f270530f.setVisibility(0);
            this.f270531g.setVideoPath(str);
        }
        if (((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0)).intValue() == 1) {
            this.f270532h.setText(((C97560f) C86312j.m106911c(C97560f.class)).mo136825un(str));
            this.f270532h.setVisibility(0);
        }
    }

    /* renamed from: g */
    public void mo128632g(int i) {
        Log.m105925i(this.f270528d, "VideoPlay: seek second is %d", Integer.valueOf(i));
        this.f270531g.mo24788d((double) (i * 1000));
    }

    public int getPalyPosition() {
        return this.f270531g.getCurrentPosition();
    }

    public View getRoot() {
        return this.f270522E;
    }

    /* renamed from: h */
    public void mo128635h(String str, boolean z, String str2) {
        this.f270538q = str;
        if (z) {
            this.f270529e.post(new C100782j(this));
            this.f270519B = str2;
        }
    }

    /* renamed from: i */
    public void mo128636i() {
        Log.m105924i(this.f270528d, "show video tool bar");
        View view = this.f270534j;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "showVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "showVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f270535n.setVisibility(0);
        this.f270545x = true;
        this.f270524G.startTimer(4000);
    }

    /* renamed from: j */
    public final void mo128637j() {
        this.f270526I = true;
        this.f270529e.post(new C100780h(this, true));
        this.f270542u = this.f270531g.start();
        this.f270523F.startTimer(500);
        setVideoStateIv(false);
        Log.m105925i(this.f270528d, "VideoPlay: startPlay(),duration is %d", Integer.valueOf(this.f270531g.getDuration() / 1000));
    }

    public void onAttachedToWindow() {
        Log.m105918d(this.f270528d, "onAttachedToWindow() called");
        super.onAttachedToWindow();
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == C0966R.C0970id.hwy) {
            Log.m105925i(this.f270528d, "toggle video hasCalledStartPlay:%s isPlaying:%s", Boolean.valueOf(this.f270526I), Boolean.valueOf(mo128628c()));
            if (!this.f270526I) {
                mo128637j();
            } else if (mo128628c()) {
                if (this.f270531g.isPlaying()) {
                    Log.m105924i(this.f270528d, "VideoPlay: pausePlay()");
                    this.f270531g.pause();
                }
                this.f270523F.stopTimer();
                setVideoStateIv(true);
                this.f270524G.stopTimer();
            } else {
                mo128632g(this.f270536o.getmPosition());
                this.f270523F.startTimer(500);
                setVideoStateIv(false);
                if (this.f270545x) {
                    this.f270524G.startTimer(4000);
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCompletion() {
        Log.m105925i(this.f270528d, "%d on completion", Integer.valueOf(hashCode()));
        if (C11171e.m11045b(18) || !this.f270540s) {
            mo128632g(0);
            return;
        }
        C96875r0 r0Var = this.f270531g;
        if (r0Var != null) {
            r0Var.stop();
        }
    }

    public void onDetachedFromWindow() {
        Log.m105918d(this.f270528d, "onDetachedFromWindow() called:");
        super.onDetachedFromWindow();
    }

    public void onError(int i, int i2) {
        Log.m105921e(this.f270528d, "VideoPlay: %d on play video error what %d extra %d. isMMVideoPlayer[%b]", Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(this.f270540s));
        if (this.f270542u) {
            onCompletion();
            return;
        }
        this.f270541t = i2;
        String videoPath = this.f270531g.getVideoPath();
        this.f270531g.stop();
        this.f270539r = true;
        this.f270529e.post(new C100780h(this, false));
        if (this.f270541t == -1) {
            int i3 = this.f270520C + 1;
            this.f270520C = i3;
            if (i3 <= 3) {
                MMHandlerThread.postToMainThread(new C93719d());
                return;
            }
        }
        if (!Util.isNullOrNil(videoPath) && C86013q1.m106450k(videoPath)) {
            Log.m105920e(this.f270528d, "VideoPlay: start third player to play");
            this.f270529e.post(new C2298e(videoPath));
        }
    }

    public void onPrepared() {
        Log.m105919d(this.f270528d, "onPrepared() called isStartAfterPrepared：%s", Boolean.valueOf(this.f270546y));
        this.f270541t = 0;
        this.f270544w = true;
        if (this.f270546y) {
            mo128637j();
        } else {
            mo128636i();
        }
    }

    /* renamed from: p3 */
    public void mo76226p3(int i, int i2) {
    }

    public void setCallback(C93722g gVar) {
        this.f270521D = gVar;
    }

    public void setStartAfterPrepared(boolean z) {
        this.f270546y = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setThumbView(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r0 == 0) goto L_0x0049
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.String r4 = "local_cdn_img_cache"
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = r7.f270528d
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r8
            java.lang.String r6 = "getByCache err :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r6, r5)
            goto L_0x0025
        L_0x001e:
            java.lang.Object r0 = p520fi.C75766h.C75767a.m91020a(r4, r8, r1)
            r1 = r0
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
        L_0x0025:
            if (r1 != 0) goto L_0x0043
            r0 = 1065353216(0x3f800000, float:1.0)
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.decodeFile(r8, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = r7.f270528d
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r8
            java.lang.String r8 = "push err :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r8, r3)
            goto L_0x0043
        L_0x0040:
            p520fi.C75766h.C75767a.m91022c(r4, r8, r1)
        L_0x0043:
            android.widget.ImageView r8 = r7.f270530f
            r8.setImageBitmap(r1)
            goto L_0x0051
        L_0x0049:
            android.widget.ImageView r8 = r7.f270530f
            r0 = 2131231608(0x7f080378, float:1.8079302E38)
            r8.setImageResource(r0)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.widget.FavVideoView.setThumbView(java.lang.String):void");
    }

    public void setVideoData(String str) {
        String str2 = this.f270528d;
        Log.m105918d(str2, "setVideoData() called with: fullPath = [" + str + "]");
        this.f270538q = str;
    }

    public void setVideoScaleType(C96814a.C96817e eVar) {
        C96875r0 r0Var = this.f270531g;
        if (r0Var == null) {
            return;
        }
        if (r0Var instanceof VideoPlayerTextureView) {
            ((VideoPlayerTextureView) r0Var).setScaleType(eVar);
        } else if (r0Var instanceof VideoTextureView) {
            ((VideoTextureView) r0Var).setScaleType(eVar);
        }
    }

    public void setVideoStateIv(boolean z) {
        try {
            this.f270536o.setIsPlay(!z);
        } catch (Exception e) {
            String str = this.f270528d;
            Log.m105920e(str, "set video state iv error : " + e.toString());
        }
    }

    public FavVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f270528d = "MicroMsg.FavVideoView@" + hashCode();
        this.f270529e = new MMHandler(Looper.getMainLooper());
        this.f270539r = false;
        this.f270540s = false;
        this.f270541t = 0;
        this.f270542u = false;
        this.f270543v = 0;
        this.f270544w = false;
        this.f270545x = false;
        this.f270546y = true;
        this.f270519B = "";
        this.f270520C = 0;
        this.f270523F = new MTimerHandler(new C93716a(), true);
        this.f270524G = new MTimerHandler(new C93717b(), false);
        this.f270525H = new C93718c();
        this.f270526I = false;
        this.f270527J = new C93720f((C93716a) null);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.a7g, this);
        this.f270530f = (ImageView) findViewById(C0966R.C0970id.l7k);
        this.f270522E = (RelativeLayout) findViewById(C0966R.C0970id.f39);
        ((TextView) findViewById(C0966R.C0970id.l5j)).setVisibility(8);
        this.f270518A = (MMPinProgressBtn) findViewById(C0966R.C0970id.f359492l70);
        this.f270547z = (ProgressBar) findViewById(C0966R.C0970id.l6a);
        this.f270533i = (LinearLayout) findViewById(C0966R.C0970id.f357986cv3);
        this.f270535n = (ImageView) findViewById(C0966R.C0970id.l4y);
        this.f270537p = (RelativeLayout) findViewById(C0966R.C0970id.bx4);
        this.f270534j = findViewById(C0966R.C0970id.l5w);
        this.f270536o = (VideoPlayerSeekBar) findViewById(C0966R.C0970id.l6x);
        this.f270532h = (TextView) findViewById(C0966R.C0970id.l7q);
        if (((C36594q) C86312j.m106911c(C36594q.class)).mo60728Am()) {
            this.f270540s = true;
            this.f270531g = new VideoPlayerTextureView(context, (AttributeSet) null);
        } else {
            this.f270540s = false;
            this.f270531g = new VideoTextureView(context, (AttributeSet) null);
        }
        String str = this.f270528d;
        C96875r0 r0Var = this.f270531g;
        Log.m105925i(str, "ui init view. videoView:%s %s", r0Var, Integer.valueOf(r0Var.hashCode()));
        this.f270531g.setVideoCallback(this);
        mo128627b();
        setVideoStateIv(true);
        this.f270536o.setIplaySeekCallback(this.f270525H);
        this.f270536o.setPlayBtnOnClickListener(this);
        this.f270535n.setOnClickListener(new C93723a(this));
        this.f270536o.setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.f270522E.addView((View) this.f270531g, layoutParams);
        boolean k = C85875k4.m106190k(getContext());
        int j = C85875k4.m106188j(getContext());
        Log.m105925i(this.f270528d, "%d handleVerticalUI image gallery ui isNavBarVisibility %b navBarHeight %d", Integer.valueOf(hashCode()), Boolean.valueOf(k), Integer.valueOf(j));
        if (k) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f270534j.getLayoutParams());
            layoutParams2.addRule(12);
            layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, j);
            this.f270537p.setLayoutParams(layoutParams2);
        }
    }
}
