package w82;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.model.C105783b0;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView;
import com.tencent.p014mm.plugin.multitalk.p078ui.C105882d;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import d62.C75339i;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import o40.C61926c;
import p196ln.C76705f;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: w82.l */
public final class C111773l extends FrameLayout {

    /* renamed from: d */
    public final C13601g f334715d = C36568h.m40985a(new C111775b(this));

    /* renamed from: e */
    public final C13601g f334716e = C36568h.m40985a(new C111781h(this));

    /* renamed from: f */
    public final C13601g f334717f = C36568h.m40985a(new C111778e(this));

    /* renamed from: g */
    public final C13601g f334718g = C36568h.m40985a(new C111777d(this));

    /* renamed from: h */
    public final C13601g f334719h = C36568h.m40985a(new C111774a(this));

    /* renamed from: i */
    public final C13601g f334720i = C36568h.m40985a(C111776c.f334725d);

    /* renamed from: j */
    public String f334721j;

    /* renamed from: n */
    public Boolean f334722n;

    /* renamed from: w82.l$a */
    public static final class C111774a extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C111773l f334723d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111774a(C111773l lVar) {
            super(0);
            this.f334723d = lVar;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f334723d.findViewById(C0966R.C0970id.aof);
            textView.setVisibility((BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) ? 0 : 8);
            return textView;
        }
    }

    /* renamed from: w82.l$b */
    public static final class C111775b extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C111773l f334724d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111775b(C111773l lVar) {
            super(0);
            this.f334724d = lVar;
        }

        public Object invoke() {
            return (ImageView) this.f334724d.findViewById(C0966R.C0970id.aqc);
        }
    }

    /* renamed from: w82.l$c */
    public static final class C111776c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C111776c f334725d = new C111776c();

        public C111776c() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C105851w0.zx0().mo150680v());
        }
    }

    /* renamed from: w82.l$d */
    public static final class C111777d extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C111773l f334726d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111777d(C111773l lVar) {
            super(0);
            this.f334726d = lVar;
        }

        public Object invoke() {
            return (ImageView) this.f334726d.findViewById(C0966R.C0970id.ayp);
        }
    }

    /* renamed from: w82.l$e */
    public static final class C111778e extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C111773l f334727d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111778e(C111773l lVar) {
            super(0);
            this.f334727d = lVar;
        }

        public Object invoke() {
            return (ImageView) this.f334727d.findViewById(C0966R.C0970id.bat);
        }
    }

    /* renamed from: w82.l$f */
    public static final class C111779f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111773l f334728d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111779f(C111773l lVar) {
            super(0);
            this.f334728d = lVar;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.MT.MultiTalkAvatarView", "refreshVideoState: on video view first frame");
            C61926c.m72668M(new C111782m(this.f334728d));
            this.f334728d.getVideoView().setOnFrame(C15052n.f41191d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: w82.l$g */
    public static final class C111780g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C111780g f334729d = new C111780g();

        public C111780g() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: w82.l$h */
    public static final class C111781h extends C87413o implements C32224a<VideoView> {

        /* renamed from: d */
        public final /* synthetic */ C111773l f334730d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111781h(C111773l lVar) {
            super(0);
            this.f334730d = lVar;
        }

        public Object invoke() {
            return (VideoView) this.f334730d.findViewById(C0966R.C0970id.bdv);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111773l(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        LayoutInflater.from(context).inflate(C0966R.C0971layout.cjc, this, true);
        this.f334721j = "";
    }

    private final TextView getAvatarLayoutInfo() {
        return (TextView) ((C36570n) this.f334719h).getValue();
    }

    /* access modifiers changed from: private */
    public final ImageView getAvatarView() {
        return (ImageView) ((C36570n) this.f334715d).getValue();
    }

    private final ImageView getLoadingView() {
        return (ImageView) ((C36570n) this.f334718g).getValue();
    }

    private final ImageView getMaskView() {
        return (ImageView) ((C36570n) this.f334717f).getValue();
    }

    /* access modifiers changed from: private */
    public final VideoView getVideoView() {
        return (VideoView) ((C36570n) this.f334716e).getValue();
    }

    /* renamed from: c */
    public final void mo163505c() {
        Log.m105924i("MicroMsg.MT.MultiTalkAvatarView", "close " + this.f334721j);
        C105783b0 n = C105851w0.zx0().mo150671n();
        if (n != null) {
            VideoView videoView = getVideoView();
            C87412m.m108593f(videoView, "videoView");
            n.mo150730l(videoView, this.f334721j);
        }
    }

    /* renamed from: d */
    public final void mo163506d(C105882d dVar) {
        String str;
        C87412m.m108594g(dVar, "memberInfo");
        if (!C87412m.m108589b(this.f334722n, Boolean.valueOf(dVar.f314929d))) {
            this.f334722n = Boolean.valueOf(dVar.f314929d);
            String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(dVar.f314927b);
            if (dVar.f314929d) {
                String string = getContext().getString(C0966R.string.gyl);
                C87412m.m108593f(string, "context.getString(R.string.multitalk_camera_on)");
                str = String.format(string, Arrays.copyOf(new Object[]{displayName}, 1));
                C87412m.m108593f(str, "format(format, *args)");
            } else {
                String string2 = getContext().getString(C0966R.string.gyk);
                C87412m.m108593f(string2, "context.getString(R.string.multitalk_camera_off)");
                str = String.format(string2, Arrays.copyOf(new Object[]{displayName}, 1));
                C87412m.m108593f(str, "format(format, *args)");
            }
            getVideoView().setContentDescription(str);
            getAvatarView().setContentDescription(str);
        }
        if (dVar.f314929d || dVar.mo150900a()) {
            this.f334721j = dVar.f314927b;
            C105783b0 n = C105851w0.zx0().mo150671n();
            if (n != null) {
                VideoView videoView = getVideoView();
                C87412m.m108593f(videoView, "videoView");
                n.mo150719a(videoView, dVar.f314927b);
            }
            if (indexOfChild(getVideoView()) == -1) {
                addView(getVideoView(), 0);
            }
            if (getAvatarView().getVisibility() == 0) {
                Log.m105924i("MicroMsg.MT.MultiTalkAvatarView", "refreshVideoState: show video view");
                getVideoView().setOnFrame(new C111779f(this));
            }
        } else {
            C105783b0 n2 = C105851w0.zx0().mo150671n();
            if (n2 != null) {
                VideoView videoView2 = getVideoView();
                C87412m.m108593f(videoView2, "videoView");
                n2.mo150730l(videoView2, dVar.f314927b);
            }
            ((C76705f) C86312j.m106911c(C76705f.class)).zv0(getAvatarView(), dVar.f314927b);
            getAvatarView().setBackgroundColor(-16776961);
            getVideoView().setOnFrame(C111780g.f334729d);
            getAvatarView().setVisibility(0);
            removeView(getVideoView());
        }
        if (getAvatarLayoutInfo().getVisibility() == 0) {
            TextView avatarLayoutInfo = getAvatarLayoutInfo();
            avatarLayoutInfo.setText("isILink: " + ((Boolean) ((C36570n) this.f334720i).getValue()).booleanValue() + "\nmid:" + dVar.f314926a);
        }
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r3v9, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo163507e(com.tencent.p014mm.plugin.multitalk.p078ui.C105882d r3) {
        /*
            r2 = this;
            java.lang.String r0 = "memberInfo"
            gy3.C87412m.m108594g(r3, r0)
            boolean r0 = r3.f314928c
            r1 = 0
            if (r0 != 0) goto L_0x0036
            int r3 = r3.f314933h
            r0 = 102(0x66, float:1.43E-43)
            if (r3 != r0) goto L_0x0011
            goto L_0x0036
        L_0x0011:
            android.widget.ImageView r3 = r2.getMaskView()
            r0 = 8
            r3.setVisibility(r0)
            android.widget.ImageView r3 = r2.getLoadingView()
            r3.setVisibility(r0)
            android.widget.ImageView r3 = r2.getLoadingView()
            android.graphics.drawable.Drawable r3 = r3.getBackground()
            boolean r0 = r3 instanceof android.graphics.drawable.AnimationDrawable
            if (r0 == 0) goto L_0x0030
            r1 = r3
            android.graphics.drawable.AnimationDrawable r1 = (android.graphics.drawable.AnimationDrawable) r1
        L_0x0030:
            if (r1 == 0) goto L_0x0059
            r1.stop()
            goto L_0x0059
        L_0x0036:
            android.widget.ImageView r3 = r2.getMaskView()
            r0 = 0
            r3.setVisibility(r0)
            android.widget.ImageView r3 = r2.getLoadingView()
            r3.setVisibility(r0)
            android.widget.ImageView r3 = r2.getLoadingView()
            android.graphics.drawable.Drawable r3 = r3.getBackground()
            boolean r0 = r3 instanceof android.graphics.drawable.AnimationDrawable
            if (r0 == 0) goto L_0x0054
            r1 = r3
            android.graphics.drawable.AnimationDrawable r1 = (android.graphics.drawable.AnimationDrawable) r1
        L_0x0054:
            if (r1 == 0) goto L_0x0059
            r1.start()
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w82.C111773l.mo163507e(com.tencent.mm.plugin.multitalk.ui.d):void");
    }
}
