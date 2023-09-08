package com.tencent.p014mm.album.p836ui.gallery.view;

import android.content.Context;
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
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.RedesignVideoPlayerSeekBar;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Objects;
import k20.C60958c;
import k20.C9556a;
import p206nj.C11171e;
import p500dy.C97560f;
import p663qo.C63287k;
import p682rz.C36594q;
import p859og.C62002a;
import p859og.C62004c;
import p859og.C62005d;
import p859og.C62006e;
import xn2.C102693c;

/* renamed from: com.tencent.mm.album.ui.gallery.view.AlbumVideoView */
public class AlbumVideoView extends RelativeLayout implements C96875r0.C96876a, View.OnClickListener {

    /* renamed from: J */
    public static final /* synthetic */ int f154670J = 0;

    /* renamed from: A */
    public ProgressBar f154671A;

    /* renamed from: B */
    public MMPinProgressBtn f154672B;

    /* renamed from: C */
    public String f154673C;

    /* renamed from: D */
    public int f154674D;

    /* renamed from: E */
    public MTimerHandler f154675E;

    /* renamed from: F */
    public MTimerHandler f154676F;

    /* renamed from: G */
    public C102693c f154677G;

    /* renamed from: H */
    public boolean f154678H;

    /* renamed from: I */
    public C55095e f154679I;

    /* renamed from: d */
    public String f154680d;

    /* renamed from: e */
    public MMHandler f154681e;

    /* renamed from: f */
    public ImageView f154682f;

    /* renamed from: g */
    public ImageView f154683g;

    /* renamed from: h */
    public C96875r0 f154684h;

    /* renamed from: i */
    public TextView f154685i;

    /* renamed from: j */
    public LinearLayout f154686j;

    /* renamed from: n */
    public View f154687n;

    /* renamed from: o */
    public RedesignVideoPlayerSeekBar f154688o;

    /* renamed from: p */
    public RelativeLayout f154689p;

    /* renamed from: q */
    public String f154690q;

    /* renamed from: r */
    public boolean f154691r;

    /* renamed from: s */
    public boolean f154692s;

    /* renamed from: t */
    public int f154693t;

    /* renamed from: u */
    public boolean f154694u;

    /* renamed from: v */
    public int f154695v;

    /* renamed from: w */
    public boolean f154696w;

    /* renamed from: x */
    public boolean f154697x;

    /* renamed from: y */
    public int f154698y;

    /* renamed from: z */
    public boolean f154699z;

    /* renamed from: com.tencent.mm.album.ui.gallery.view.AlbumVideoView$a */
    public class C55091a implements MTimerHandler.CallBack {
        public C55091a() {
        }

        public boolean onTimerExpired() {
            AlbumVideoView albumVideoView = AlbumVideoView.this;
            albumVideoView.f154695v = albumVideoView.getPalyPosition();
            AlbumVideoView.this.f154688o.seek(Math.max(0, AlbumVideoView.this.f154695v / 1000));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.view.AlbumVideoView$b */
    public class C55092b implements MTimerHandler.CallBack {
        public C55092b() {
        }

        public boolean onTimerExpired() {
            AlbumVideoView albumVideoView = AlbumVideoView.this;
            if (!albumVideoView.f154697x) {
                return false;
            }
            albumVideoView.mo76209b();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.view.AlbumVideoView$c */
    public class C55093c implements C102693c {
        public C55093c() {
        }

        /* renamed from: a */
        public void mo4335a(int i) {
            if (!AlbumVideoView.this.mo76210c()) {
                AlbumVideoView.this.f154675E.startTimer(500);
                AlbumVideoView.this.setVideoStateIv(false);
            }
            AlbumVideoView.this.mo76213f(i);
            AlbumVideoView albumVideoView = AlbumVideoView.this;
            if (albumVideoView.f154697x) {
                albumVideoView.f154676F.startTimer(4000);
            }
            AlbumVideoView.this.mo76214g(false);
        }

        /* renamed from: c */
        public void mo4336c(int i) {
        }

        public void onSeekPre() {
            AlbumVideoView albumVideoView = AlbumVideoView.this;
            if (albumVideoView.f154684h.isPlaying()) {
                Log.m105924i(albumVideoView.f154680d, "VideoPlay: pausePlay()");
                albumVideoView.f154684h.pause();
            }
            AlbumVideoView.this.f154676F.stopTimer();
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.view.AlbumVideoView$d */
    public class C55094d implements Runnable {
        public C55094d() {
        }

        public void run() {
            AlbumVideoView albumVideoView = AlbumVideoView.this;
            if (albumVideoView.f154684h != null) {
                albumVideoView.mo76212e(albumVideoView.f154690q);
            }
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.view.AlbumVideoView$e */
    public class C55095e implements C92795s {

        /* renamed from: com.tencent.mm.album.ui.gallery.view.AlbumVideoView$e$a */
        public class C55096a implements Runnable {
            public C55096a() {
            }

            public void run() {
                AlbumVideoView albumVideoView = AlbumVideoView.this;
                if (albumVideoView.f154684h != null) {
                    albumVideoView.mo76212e(albumVideoView.f154690q);
                }
            }
        }

        public C55095e(C55091a aVar) {
        }

        /* renamed from: a */
        public void mo76235a(int i, String str, int i2, int i3) {
            Log.m105919d(AlbumVideoView.this.f154680d, "onCdnStatusChanged status:%s, offset:%s, totalLength:%s, path:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
            if (i != 2 || !C86013q1.m106450k(str)) {
                AlbumVideoView albumVideoView = AlbumVideoView.this;
                albumVideoView.f154681e.post(new C62006e(albumVideoView, i2, i3));
                return;
            }
            AlbumVideoView.this.f154684h.stop();
            AlbumVideoView albumVideoView2 = AlbumVideoView.this;
            albumVideoView2.f154681e.post(new C62002a(albumVideoView2));
            AlbumVideoView.this.f154690q = str;
            MMHandlerThread.postToMainThread(new C55096a());
        }

        /* renamed from: o2 */
        public void mo76200o2(int i, C55385t tVar) {
            if (!Objects.equals(AlbumVideoView.this.f154673C, tVar.f157721c)) {
                return;
            }
            if (i == 1) {
                mo76235a(2, tVar.f157726h, (int) tVar.f157723e, (int) tVar.f157724f);
            } else if (i == 4) {
                mo76235a(1, tVar.f157726h, (int) tVar.f157723e, (int) tVar.f157724f);
            }
        }
    }

    /* renamed from: com.tencent.mm.album.ui.gallery.view.AlbumVideoView$f */
    public interface C55097f {
    }

    public AlbumVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: M0 */
    public int mo76207M0(int i, int i2) {
        return 0;
    }

    /* renamed from: a */
    public final void mo76208a() {
        boolean d = C75044y4.m89992d(getContext());
        int j = C85875k4.m106188j(getContext());
        Log.m105925i(this.f154680d, "%d handleVerticalUI image gallery ui isNavBarVisibility %b navBarHeight %d", Integer.valueOf(hashCode()), Boolean.valueOf(d), Integer.valueOf(j));
        if (d) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f154689p.getLayoutParams();
            layoutParams.bottomMargin = j + getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3705bx);
            this.f154689p.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    public void mo76209b() {
        Log.m105924i(this.f154680d, "hide video tool bar");
        View view = this.f154687n;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/album/ui/gallery/view/AlbumVideoView", "hideVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/album/ui/gallery/view/AlbumVideoView", "hideVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f154697x = false;
    }

    /* renamed from: c */
    public boolean mo76210c() {
        C96875r0 r0Var = this.f154684h;
        if (r0Var == null) {
            return false;
        }
        return r0Var.isPlaying();
    }

    /* renamed from: d */
    public void mo76211d() {
        Log.m105924i(this.f154680d, "VideoPlay:   onDestroy()");
        this.f154678H = false;
        this.f154675E.stopTimer();
        this.f154676F.stopTimer();
        this.f154688o.seek(0);
        setVideoStateIv(true);
        this.f154676F.stopTimer();
        try {
            ((C63287k) C86312j.m106911c(C63287k.class)).mo88181kj(this.f154679I);
            this.f154684h.stop();
        } catch (Throwable th) {
            Log.m105921e(this.f154680d, "onDestroy() %s %s", th.getClass().getSimpleName(), th.getMessage());
        }
    }

    /* renamed from: e */
    public void mo76212e(String str) {
        Log.m105924i(this.f154680d, "VideoPlay: prepareVideo");
        if (Util.isNullOrNil(str)) {
            Log.m105921e(this.f154680d, "VideoPlay: %d prepare video but filepath is null.", Integer.valueOf(hashCode()));
            return;
        }
        C96875r0 r0Var = this.f154684h;
        if (r0Var != null) {
            if (r0Var instanceof VideoPlayerTextureView) {
                ((VideoPlayerTextureView) r0Var).setNeedResetExtractor(C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, false));
            }
            View view = (View) this.f154684h;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/album/ui/gallery/view/AlbumVideoView", "prepareVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/album/ui/gallery/view/AlbumVideoView", "prepareVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = (View) this.f154684h;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/album/ui/gallery/view/AlbumVideoView", "prepareVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/album/ui/gallery/view/AlbumVideoView", "prepareVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f154682f.setVisibility(0);
            this.f154684h.setVideoPath(str);
        }
        if (((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0)).intValue() == 1) {
            this.f154685i.setText(((C97560f) C86312j.m106911c(C97560f.class)).mo136825un(str));
            this.f154685i.setVisibility(0);
        }
    }

    /* renamed from: f */
    public void mo76213f(int i) {
        Log.m105925i(this.f154680d, "VideoPlay: seek second is %d", Integer.valueOf(i));
        this.f154684h.mo24788d((double) (i * 1000));
    }

    /* renamed from: g */
    public void mo76214g(boolean z) {
        if (this.f154683g != null) {
            LinearLayout linearLayout = this.f154686j;
            int i = 8;
            if (linearLayout == null || linearLayout.getVisibility() != 0) {
                ImageView imageView = this.f154683g;
                if (z) {
                    i = 0;
                }
                imageView.setVisibility(i);
                return;
            }
            this.f154683g.setVisibility(8);
        }
    }

    public View getFooterRootVideo() {
        return this.f154687n;
    }

    public int getPalyPosition() {
        return this.f154684h.getCurrentPosition();
    }

    public View getThumbView() {
        return this.f154682f;
    }

    /* renamed from: h */
    public void mo76218h() {
        Log.m105924i(this.f154680d, "show video tool bar");
        View view = this.f154687n;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/album/ui/gallery/view/AlbumVideoView", "showVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/album/ui/gallery/view/AlbumVideoView", "showVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f154697x = true;
        this.f154676F.startTimer(4000);
    }

    /* renamed from: i */
    public final void mo76219i() {
        setStartAfterPrepared(true);
        this.f154678H = true;
        this.f154681e.post(new C62005d(this, true));
        this.f154694u = this.f154684h.start();
        this.f154675E.startTimer(500);
        setVideoStateIv(false);
        Log.m105925i(this.f154680d, "VideoPlay: startPlay(),duration is %d", Integer.valueOf(this.f154684h.getDuration() / 1000));
    }

    public void onAttachedToWindow() {
        Log.m105918d(this.f154680d, "onAttachedToWindow() called");
        super.onAttachedToWindow();
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/album/ui/gallery/view/AlbumVideoView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == C0966R.C0970id.hwy || view.getId() == C0966R.C0970id.f359493l80) {
            Log.m105925i(this.f154680d, "toggle video hasCalledStartPlay:%s isPlaying:%s", Boolean.valueOf(this.f154678H), Boolean.valueOf(mo76210c()));
            if (!this.f154678H) {
                mo76219i();
            } else if (mo76210c()) {
                if (this.f154684h.isPlaying()) {
                    Log.m105924i(this.f154680d, "VideoPlay: pausePlay()");
                    this.f154684h.pause();
                }
                this.f154675E.stopTimer();
                setVideoStateIv(true);
                this.f154676F.stopTimer();
                mo76214g(true);
            } else {
                mo76213f(this.f154688o.getmPosition());
                this.f154675E.startTimer(500);
                setVideoStateIv(false);
                if (this.f154697x) {
                    this.f154676F.startTimer(4000);
                }
                mo76214g(false);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/album/ui/gallery/view/AlbumVideoView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCompletion() {
        Log.m105925i(this.f154680d, "%d on completion", Integer.valueOf(hashCode()));
        if (C11171e.m11045b(18) || !this.f154692s) {
            mo76213f(0);
            return;
        }
        C96875r0 r0Var = this.f154684h;
        if (r0Var != null) {
            r0Var.stop();
        }
    }

    public void onDetachedFromWindow() {
        Log.m105918d(this.f154680d, "onDetachedFromWindow() called:");
        super.onDetachedFromWindow();
    }

    public void onError(int i, int i2) {
        Log.m105921e(this.f154680d, "VideoPlay: %d on play video error what %d extra %d. isMMVideoPlayer[%b]", Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(this.f154692s));
        if (this.f154694u) {
            onCompletion();
            return;
        }
        this.f154693t = i2;
        this.f154684h.getVideoPath();
        this.f154684h.stop();
        this.f154691r = true;
        this.f154681e.post(new C62005d(this, false));
        if (this.f154693t == -1) {
            int i3 = this.f154674D + 1;
            this.f154674D = i3;
            if (i3 <= 3) {
                MMHandlerThread.postToMainThread(new C55094d());
            }
        }
    }

    public void onPrepared() {
        Log.m105919d(this.f154680d, "onPrepared() called isStartAfterPrepared：%s", Boolean.valueOf(this.f154699z));
        this.f154693t = 0;
        this.f154696w = true;
        if (this.f154699z) {
            mo76219i();
        } else {
            mo76218h();
        }
        int duration = this.f154684h.getDuration();
        this.f154698y = duration;
        this.f154688o.setVideoTotalTime(duration / 1000);
    }

    /* renamed from: p3 */
    public void mo76226p3(int i, int i2) {
    }

    public void setCallback(C55097f fVar) {
    }

    public void setDataId(String str) {
        this.f154673C = str;
    }

    public void setStartAfterPrepared(boolean z) {
        this.f154699z = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setThumbView(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r0 == 0) goto L_0x0047
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.String r4 = "local_cdn_img_cache"
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r7.f154680d
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r8
            java.lang.String r6 = "getByCache err :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r6, r5)
            goto L_0x0024
        L_0x001d:
            java.lang.Object r0 = p520fi.C75766h.C75767a.m91020a(r4, r8, r1)
            r1 = r0
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
        L_0x0024:
            if (r1 != 0) goto L_0x0041
            r0 = 1065353216(0x3f800000, float:1.0)
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.decodeFile(r8, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = r7.f154680d
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r8
            java.lang.String r8 = "push err :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r8, r3)
            goto L_0x0041
        L_0x003e:
            p520fi.C75766h.C75767a.m91022c(r4, r8, r1)
        L_0x0041:
            android.widget.ImageView r8 = r7.f154682f
            r8.setImageBitmap(r1)
            goto L_0x004f
        L_0x0047:
            android.widget.ImageView r8 = r7.f154682f
            r0 = 2131231608(0x7f080378, float:1.8079302E38)
            r8.setImageResource(r0)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.album.p836ui.gallery.view.AlbumVideoView.setThumbView(java.lang.String):void");
    }

    public void setVideoData(String str) {
        String str2 = this.f154680d;
        Log.m105918d(str2, "setVideoData() called with: fullPath = [" + str + "]");
        this.f154690q = str;
    }

    public void setVideoScaleType(C96814a.C96817e eVar) {
        C96875r0 r0Var = this.f154684h;
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
            this.f154688o.setIsPlay(!z);
        } catch (Exception e) {
            String str = this.f154680d;
            Log.m105920e(str, "set video state iv error : " + e.toString());
        }
    }

    public AlbumVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f154680d = "MicroMsg.AlbumVideoView@" + hashCode();
        this.f154681e = new MMHandler(Looper.getMainLooper());
        this.f154691r = false;
        this.f154692s = false;
        this.f154693t = 0;
        this.f154694u = false;
        this.f154695v = 0;
        this.f154696w = false;
        this.f154697x = false;
        this.f154698y = 0;
        this.f154699z = true;
        this.f154673C = "";
        this.f154674D = 0;
        this.f154675E = new MTimerHandler(new C55091a(), true);
        this.f154676F = new MTimerHandler(new C55092b(), false);
        this.f154677G = new C55093c();
        this.f154678H = false;
        this.f154679I = new C55095e((C55091a) null);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.d7a, this);
        this.f154682f = (ImageView) findViewById(C0966R.C0970id.l7k);
        this.f154683g = (ImageView) findViewById(C0966R.C0970id.f359493l80);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.f39);
        ((TextView) findViewById(C0966R.C0970id.l5j)).setVisibility(8);
        this.f154672B = (MMPinProgressBtn) findViewById(C0966R.C0970id.f359492l70);
        this.f154671A = (ProgressBar) findViewById(C0966R.C0970id.l6a);
        this.f154686j = (LinearLayout) findViewById(C0966R.C0970id.czr);
        this.f154689p = (RelativeLayout) findViewById(C0966R.C0970id.bx4);
        this.f154687n = findViewById(C0966R.C0970id.l5w);
        this.f154688o = (RedesignVideoPlayerSeekBar) findViewById(C0966R.C0970id.l6x);
        this.f154685i = (TextView) findViewById(C0966R.C0970id.l7q);
        if (((C36594q) C86312j.m106911c(C36594q.class)).mo60728Am()) {
            this.f154692s = true;
            this.f154684h = new VideoPlayerTextureView(context, (AttributeSet) null);
        } else {
            this.f154692s = false;
            this.f154684h = new VideoTextureView(context, (AttributeSet) null);
        }
        String str = this.f154680d;
        C96875r0 r0Var = this.f154684h;
        Log.m105925i(str, "ui init view. videoView:%s %s", r0Var, Integer.valueOf(r0Var.hashCode()));
        this.f154684h.setVideoCallback(this);
        this.f154684h.setOnSeekCompleteCallback(new C62004c(this));
        mo76209b();
        setVideoStateIv(true);
        this.f154688o.setIplaySeekCallback(this.f154677G);
        this.f154688o.setPlayBtnOnClickListener(this);
        this.f154688o.setOnClickListener(this);
        this.f154683g.setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        relativeLayout.addView((View) this.f154684h, layoutParams);
        mo76208a();
    }
}
