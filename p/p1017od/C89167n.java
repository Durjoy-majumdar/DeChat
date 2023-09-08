package p1017od;

import android.content.Context;
import android.content.res.AssetManager;
import com.github.henryye.nativeiv.BaseImageDecodeService;
import com.github.henryye.nativeiv.api.IImageDecodeService;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.handler.glfont.IMBFontHandler;
import com.tencent.magicbrush.handler.p940fs.IMBFileSystem;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C24570s;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import ny3.C89102i;
import ny3.C89104m;
import p1030s6.C90132b;
import p1033sd.C90171a;
import p1059wd.C90954a;
import p673r6.C89881d;
import p748xd.C91168a;

/* renamed from: od.n */
public class C89167n {

    /* renamed from: L */
    public static final /* synthetic */ C89104m<Object>[] f256956L;

    /* renamed from: A */
    public final C89168a f256957A;

    /* renamed from: B */
    public final C89168a f256958B;

    /* renamed from: C */
    public final C89168a f256959C;

    /* renamed from: D */
    public final C89168a f256960D;

    /* renamed from: E */
    public final C89168a f256961E;

    /* renamed from: F */
    public final C89168a f256962F;

    /* renamed from: G */
    public final C89168a f256963G;

    /* renamed from: H */
    public final C89168a f256964H;

    /* renamed from: I */
    public final C89168a f256965I;

    /* renamed from: J */
    public final C89168a f256966J;

    /* renamed from: K */
    public final MBRuntime.MBParams f256967K;

    /* renamed from: a */
    public Context f256968a;

    /* renamed from: b */
    public C90171a f256969b;

    /* renamed from: c */
    public C32224a<C89201o> f256970c;

    /* renamed from: d */
    public final C89168a f256971d = new C89168a(this, C89183i.f257012d);

    /* renamed from: e */
    public final C89168a f256972e = new C89168a(this, C89181g.f257010d);

    /* renamed from: f */
    public final C89168a f256973f = new C89168a(this, C89179f.f257008d);

    /* renamed from: g */
    public final C89168a f256974g = new C89168a(this, C89194t.f257023d);

    /* renamed from: h */
    public final C89168a f256975h = new C89168a(this, C89177e.f257006d);

    /* renamed from: i */
    public final C89171b f256976i = new C89171b();

    /* renamed from: j */
    public IMBFontHandler f256977j;

    /* renamed from: k */
    public C80301a.C80305d f256978k;

    /* renamed from: l */
    public final C89168a f256979l = new C89168a(this, C89173c.f257002d);

    /* renamed from: m */
    public final C89168a f256980m = new C89168a(this, C89184j.f257013d);

    /* renamed from: n */
    public final C89168a f256981n = new C89168a(this, C89185k.f257014d);

    /* renamed from: o */
    public final C89168a f256982o = new C89168a(this, C89187m.f257016d);

    /* renamed from: p */
    public final C89168a f256983p = new C89168a(this, C89188n.f257017d);

    /* renamed from: q */
    public final C89168a f256984q = new C89168a(this, C89196v.f257025d);

    /* renamed from: r */
    public final C89168a f256985r;

    /* renamed from: s */
    public final C89168a f256986s;

    /* renamed from: t */
    public boolean f256987t;

    /* renamed from: u */
    public boolean f256988u;

    /* renamed from: v */
    public final C89168a f256989v;

    /* renamed from: w */
    public final C89168a f256990w;

    /* renamed from: x */
    public final C89168a f256991x;

    /* renamed from: y */
    public final C89168a f256992y;

    /* renamed from: z */
    public final C89168a f256993z;

    /* renamed from: od.n$a */
    public final class C89168a<T> extends C91168a<MBRuntime.MBParams, T> {

        /* renamed from: od.n$a$a */
        public static final class C89169a extends C87413o implements C32224a<MBRuntime.MBParams> {

            /* renamed from: d */
            public final /* synthetic */ C89167n f256994d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C89169a(C89167n nVar) {
                super(0);
                this.f256994d = nVar;
            }

            public Object invoke() {
                return this.f256994d.f256967K;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89168a(C89167n nVar, C89102i<MBRuntime.MBParams, T> iVar) {
            super(new C89169a(nVar), iVar);
            C87412m.m108594g(iVar, "k");
        }
    }

    /* renamed from: od.n$a0 */
    public /* synthetic */ class C89170a0 extends C24570s {

        /* renamed from: d */
        public static final C89170a0 f256995d = new C89170a0();

        public C89170a0() {
            super(MBRuntime.MBParams.class, "support_client_vertex_buffer", "getSupport_client_vertex_buffer()Z", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).support_client_vertex_buffer = ((Boolean) obj2).booleanValue();
        }

        public Object get(Object obj) {
            return Boolean.valueOf(((MBRuntime.MBParams) obj).support_client_vertex_buffer);
        }
    }

    /* renamed from: od.n$b */
    public static final class C89171b {

        /* renamed from: a */
        public boolean f256996a = true;

        /* renamed from: b */
        public List<C90132b> f256997b = new ArrayList();

        /* renamed from: c */
        public C89881d f256998c;

        /* renamed from: d */
        public IImageDecodeService.C80187a f256999d;

        /* renamed from: e */
        public BaseImageDecodeService f257000e;
    }

    /* renamed from: od.n$b0 */
    public /* synthetic */ class C89172b0 extends C24570s {

        /* renamed from: d */
        public static final C89172b0 f257001d = new C89172b0();

        public C89172b0() {
            super(MBRuntime.MBParams.class, "support_etc2_astc", "getSupport_etc2_astc()Z", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).support_etc2_astc = ((Boolean) obj2).booleanValue();
        }

        public Object get(Object obj) {
            return Boolean.valueOf(((MBRuntime.MBParams) obj).support_etc2_astc);
        }
    }

    /* renamed from: od.n$c */
    public /* synthetic */ class C89173c extends C24570s {

        /* renamed from: d */
        public static final C89173c f257002d = new C89173c();

        public C89173c() {
            super(MBRuntime.MBParams.class, "animationFrameHandlerStrategy", "getAnimationFrameHandlerStrategy()Lcom/tencent/magicbrush/ui/AnimationFrameHandler$Strategy;", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).animationFrameHandlerStrategy = (C90954a.C90956b) obj2;
        }

        public Object get(Object obj) {
            return ((MBRuntime.MBParams) obj).animationFrameHandlerStrategy;
        }
    }

    /* renamed from: od.n$c0 */
    public /* synthetic */ class C89174c0 extends C24570s {

        /* renamed from: d */
        public static final C89174c0 f257003d = new C89174c0();

        public C89174c0() {
            super(MBRuntime.MBParams.class, "support_gfximage_share_texture", "getSupport_gfximage_share_texture()I", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).support_gfximage_share_texture = ((Number) obj2).intValue();
        }

        public Object get(Object obj) {
            return Integer.valueOf(((MBRuntime.MBParams) obj).support_gfximage_share_texture);
        }
    }

    /* renamed from: od.n$d */
    public /* synthetic */ class C89175d extends C24570s {

        /* renamed from: d */
        public static final C89175d f257004d = new C89175d();

        public C89175d() {
            super(MBRuntime.MBParams.class, "app_brand_runtime", "getApp_brand_runtime()J", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).app_brand_runtime = ((Number) obj2).longValue();
        }

        public Object get(Object obj) {
            return Long.valueOf(((MBRuntime.MBParams) obj).app_brand_runtime);
        }
    }

    /* renamed from: od.n$d0 */
    public /* synthetic */ class C89176d0 extends C24570s {

        /* renamed from: d */
        public static final C89176d0 f257005d = new C89176d0();

        public C89176d0() {
            super(MBRuntime.MBParams.class, "support_hardware_decode", "getSupport_hardware_decode()Z", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).support_hardware_decode = ((Boolean) obj2).booleanValue();
        }

        public Object get(Object obj) {
            return Boolean.valueOf(((MBRuntime.MBParams) obj).support_hardware_decode);
        }
    }

    /* renamed from: od.n$e */
    public /* synthetic */ class C89177e extends C24570s {

        /* renamed from: d */
        public static final C89177e f257006d = new C89177e();

        public C89177e() {
            super(MBRuntime.MBParams.class, "asset_manager", "getAsset_manager()Landroid/content/res/AssetManager;", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).asset_manager = (AssetManager) obj2;
        }

        public Object get(Object obj) {
            return ((MBRuntime.MBParams) obj).asset_manager;
        }
    }

    /* renamed from: od.n$e0 */
    public /* synthetic */ class C89178e0 extends C24570s {

        /* renamed from: d */
        public static final C89178e0 f257007d = new C89178e0();

        public C89178e0() {
            super(MBRuntime.MBParams.class, "support_hardware_encode", "getSupport_hardware_encode()Z", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).support_hardware_encode = ((Boolean) obj2).booleanValue();
        }

        public Object get(Object obj) {
            return Boolean.valueOf(((MBRuntime.MBParams) obj).support_hardware_encode);
        }
    }

    /* renamed from: od.n$f */
    public /* synthetic */ class C89179f extends C24570s {

        /* renamed from: d */
        public static final C89179f f257008d = new C89179f();

        public C89179f() {
            super(MBRuntime.MBParams.class, "screen_height_", "getScreen_height_()I", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).screen_height_ = ((Number) obj2).intValue();
        }

        public Object get(Object obj) {
            return Integer.valueOf(((MBRuntime.MBParams) obj).screen_height_);
        }
    }

    /* renamed from: od.n$f0 */
    public /* synthetic */ class C89180f0 extends C24570s {

        /* renamed from: d */
        public static final C89180f0 f257009d = new C89180f0();

        public C89180f0() {
            super(MBRuntime.MBParams.class, "sync_surface_destroy", "getSync_surface_destroy()Z", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).sync_surface_destroy = ((Boolean) obj2).booleanValue();
        }

        public Object get(Object obj) {
            return Boolean.valueOf(((MBRuntime.MBParams) obj).sync_surface_destroy);
        }
    }

    /* renamed from: od.n$g */
    public /* synthetic */ class C89181g extends C24570s {

        /* renamed from: d */
        public static final C89181g f257010d = new C89181g();

        public C89181g() {
            super(MBRuntime.MBParams.class, "screen_width_", "getScreen_width_()I", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).screen_width_ = ((Number) obj2).intValue();
        }

        public Object get(Object obj) {
            return Integer.valueOf(((MBRuntime.MBParams) obj).screen_width_);
        }
    }

    /* renamed from: od.n$h */
    public /* synthetic */ class C89182h extends C24570s {

        /* renamed from: d */
        public static final C89182h f257011d = new C89182h();

        public C89182h() {
            super(MBRuntime.MBParams.class, "cmd_pool_type", "getCmd_pool_type()I", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).cmd_pool_type = ((Number) obj2).intValue();
        }

        public Object get(Object obj) {
            return Integer.valueOf(((MBRuntime.MBParams) obj).cmd_pool_type);
        }
    }

    /* renamed from: od.n$i */
    public /* synthetic */ class C89183i extends C24570s {

        /* renamed from: d */
        public static final C89183i f257012d = new C89183i();

        public C89183i() {
            super(MBRuntime.MBParams.class, "device_pixel_ratio_", "getDevice_pixel_ratio_()F", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).device_pixel_ratio_ = ((Number) obj2).floatValue();
        }

        public Object get(Object obj) {
            return Float.valueOf(((MBRuntime.MBParams) obj).device_pixel_ratio_);
        }
    }

    /* renamed from: od.n$j */
    public /* synthetic */ class C89184j extends C24570s {

        /* renamed from: d */
        public static final C89184j f257013d = new C89184j();

        public C89184j() {
            super(MBRuntime.MBParams.class, "allow_antialias_", "getAllow_antialias_()Z", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).allow_antialias_ = ((Boolean) obj2).booleanValue();
        }

        public Object get(Object obj) {
            return Boolean.valueOf(((MBRuntime.MBParams) obj).allow_antialias_);
        }
    }

    /* renamed from: od.n$k */
    public /* synthetic */ class C89185k extends C24570s {

        /* renamed from: d */
        public static final C89185k f257014d = new C89185k();

        public C89185k() {
            super(MBRuntime.MBParams.class, "use_command_buffer", "getUse_command_buffer()Z", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).use_command_buffer = ((Boolean) obj2).booleanValue();
        }

        public Object get(Object obj) {
            return Boolean.valueOf(((MBRuntime.MBParams) obj).use_command_buffer);
        }
    }

    /* renamed from: od.n$l */
    public /* synthetic */ class C89186l extends C24570s {

        /* renamed from: d */
        public static final C89186l f257015d = new C89186l();

        public C89186l() {
            super(MBRuntime.MBParams.class, "enable_font_batch", "getEnable_font_batch()Z", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).enable_font_batch = ((Boolean) obj2).booleanValue();
        }

        public Object get(Object obj) {
            return Boolean.valueOf(((MBRuntime.MBParams) obj).enable_font_batch);
        }
    }

    /* renamed from: od.n$m */
    public /* synthetic */ class C89187m extends C24570s {

        /* renamed from: d */
        public static final C89187m f257016d = new C89187m();

        public C89187m() {
            super(MBRuntime.MBParams.class, "enable_gl_fake_id", "getEnable_gl_fake_id()Z", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).enable_gl_fake_id = ((Boolean) obj2).booleanValue();
        }

        public Object get(Object obj) {
            return Boolean.valueOf(((MBRuntime.MBParams) obj).enable_gl_fake_id);
        }
    }

    /* renamed from: od.n$n */
    public /* synthetic */ class C89188n extends C24570s {

        /* renamed from: d */
        public static final C89188n f257017d = new C89188n();

        public C89188n() {
            super(MBRuntime.MBParams.class, "enable_gfx", "getEnable_gfx()Z", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).enable_gfx = ((Boolean) obj2).booleanValue();
        }

        public Object get(Object obj) {
            return Boolean.valueOf(((MBRuntime.MBParams) obj).enable_gfx);
        }
    }

    /* renamed from: od.n$o */
    public /* synthetic */ class C89189o extends C24570s {

        /* renamed from: d */
        public static final C89189o f257018d = new C89189o();

        public C89189o() {
            super(MBRuntime.MBParams.class, "enable_gpu_unwrap", "getEnable_gpu_unwrap()Z", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).enable_gpu_unwrap = ((Boolean) obj2).booleanValue();
        }

        public Object get(Object obj) {
            return Boolean.valueOf(((MBRuntime.MBParams) obj).enable_gpu_unwrap);
        }
    }

    /* renamed from: od.n$p */
    public /* synthetic */ class C89190p extends C24570s {

        /* renamed from: d */
        public static final C89190p f257019d = new C89190p();

        public C89190p() {
            super(MBRuntime.MBParams.class, "enable_request_animation_frame", "getEnable_request_animation_frame()Z", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).enable_request_animation_frame = ((Boolean) obj2).booleanValue();
        }

        public Object get(Object obj) {
            return Boolean.valueOf(((MBRuntime.MBParams) obj).enable_request_animation_frame);
        }
    }

    /* renamed from: od.n$q */
    public /* synthetic */ class C89191q extends C24570s {

        /* renamed from: d */
        public static final C89191q f257020d = new C89191q();

        public C89191q() {
            super(MBRuntime.MBParams.class, "enable_skia_2d", "getEnable_skia_2d()Z", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).enable_skia_2d = ((Boolean) obj2).booleanValue();
        }

        public Object get(Object obj) {
            return Boolean.valueOf(((MBRuntime.MBParams) obj).enable_skia_2d);
        }
    }

    /* renamed from: od.n$r */
    public /* synthetic */ class C89192r extends C24570s {

        /* renamed from: d */
        public static final C89192r f257021d = new C89192r();

        public C89192r() {
            super(MBRuntime.MBParams.class, "enable_window_attributes_alpha", "getEnable_window_attributes_alpha()Z", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).enable_window_attributes_alpha = ((Boolean) obj2).booleanValue();
        }

        public Object get(Object obj) {
            return Boolean.valueOf(((MBRuntime.MBParams) obj).enable_window_attributes_alpha);
        }
    }

    /* renamed from: od.n$s */
    public /* synthetic */ class C89193s extends C24570s {

        /* renamed from: d */
        public static final C89193s f257022d = new C89193s();

        public C89193s() {
            super(MBRuntime.MBParams.class, "enable_wxbindcanvastexture", "getEnable_wxbindcanvastexture()Z", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).enable_wxbindcanvastexture = ((Boolean) obj2).booleanValue();
        }

        public Object get(Object obj) {
            return Boolean.valueOf(((MBRuntime.MBParams) obj).enable_wxbindcanvastexture);
        }
    }

    /* renamed from: od.n$t */
    public /* synthetic */ class C89194t extends C24570s {

        /* renamed from: d */
        public static final C89194t f257023d = new C89194t();

        public C89194t() {
            super(MBRuntime.MBParams.class, "file_system_", "getFile_system_()Lcom/tencent/magicbrush/handler/fs/IMBFileSystem;", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).file_system_ = (IMBFileSystem) obj2;
        }

        public Object get(Object obj) {
            return ((MBRuntime.MBParams) obj).file_system_;
        }
    }

    /* renamed from: od.n$u */
    public /* synthetic */ class C89195u extends C24570s {

        /* renamed from: d */
        public static final C89195u f257024d = new C89195u();

        public C89195u() {
            super(MBRuntime.MBParams.class, "force_run_v8_microtasks", "getForce_run_v8_microtasks()Z", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).force_run_v8_microtasks = ((Boolean) obj2).booleanValue();
        }

        public Object get(Object obj) {
            return Boolean.valueOf(((MBRuntime.MBParams) obj).force_run_v8_microtasks);
        }
    }

    /* renamed from: od.n$v */
    public /* synthetic */ class C89196v extends C24570s {

        /* renamed from: d */
        public static final C89196v f257025d = new C89196v();

        public C89196v() {
            super(MBRuntime.MBParams.class, "gc_factor", "getGc_factor()F", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).gc_factor = ((Number) obj2).floatValue();
        }

        public Object get(Object obj) {
            return Float.valueOf(((MBRuntime.MBParams) obj).gc_factor);
        }
    }

    /* renamed from: od.n$w */
    public /* synthetic */ class C89197w extends C24570s {

        /* renamed from: d */
        public static final C89197w f257026d = new C89197w();

        public C89197w() {
            super(MBRuntime.MBParams.class, "is_game", "is_game()Z", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).is_game = ((Boolean) obj2).booleanValue();
        }

        public Object get(Object obj) {
            return Boolean.valueOf(((MBRuntime.MBParams) obj).is_game);
        }
    }

    /* renamed from: od.n$x */
    public /* synthetic */ class C89198x extends C24570s {

        /* renamed from: d */
        public static final C89198x f257027d = new C89198x();

        public C89198x() {
            super(MBRuntime.MBParams.class, "render_thread_name", "getRender_thread_name()Ljava/lang/String;", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).render_thread_name = (String) obj2;
        }

        public Object get(Object obj) {
            return ((MBRuntime.MBParams) obj).render_thread_name;
        }
    }

    /* renamed from: od.n$y */
    public /* synthetic */ class C89199y extends C24570s {

        /* renamed from: d */
        public static final C89199y f257028d = new C89199y();

        public C89199y() {
            super(MBRuntime.MBParams.class, "revert_cpu_optimizer_test", "getRevert_cpu_optimizer_test()Z", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).revert_cpu_optimizer_test = ((Boolean) obj2).booleanValue();
        }

        public Object get(Object obj) {
            return Boolean.valueOf(((MBRuntime.MBParams) obj).revert_cpu_optimizer_test);
        }
    }

    /* renamed from: od.n$z */
    public /* synthetic */ class C89200z extends C24570s {

        /* renamed from: d */
        public static final C89200z f257029d = new C89200z();

        public C89200z() {
            super(MBRuntime.MBParams.class, "sdcard_path", "getSdcard_path()Ljava/lang/String;", 0);
        }

        /* renamed from: J */
        public void mo51289J(Object obj, Object obj2) {
            ((MBRuntime.MBParams) obj).sdcard_path = (String) obj2;
        }

        public Object get(Object obj) {
            return ((MBRuntime.MBParams) obj).sdcard_path;
        }
    }

    static {
        Class<C89167n> cls = C89167n.class;
        f256956L = new C89104m[]{C24560g0.m30726b(new C24570s(cls, "devicePixelRatio", "getDevicePixelRatio()F", 0)), C24560g0.m30726b(new C24570s(cls, "canvasWidth", "getCanvasWidth()I", 0)), C24560g0.m30726b(new C24570s(cls, "canvasHeight", "getCanvasHeight()I", 0)), C24560g0.m30726b(new C24570s(cls, "fileSystem", "getFileSystem()Lcom/tencent/magicbrush/handler/fs/IMBFileSystem;", 0)), C24560g0.m30726b(new C24570s(cls, "assetManager", "getAssetManager()Landroid/content/res/AssetManager;", 0)), C24560g0.m30726b(new C24570s(cls, "animationFrameHandlerStrategy", "getAnimationFrameHandlerStrategy()Lcom/tencent/magicbrush/ui/AnimationFrameHandler$Strategy;", 0)), C24560g0.m30726b(new C24570s(cls, "enableAntialias", "getEnableAntialias()Z", 0)), C24560g0.m30726b(new C24570s(cls, "enableCommandBuffer", "getEnableCommandBuffer()Z", 0)), C24560g0.m30726b(new C24570s(cls, "enableGLFakeID", "getEnableGLFakeID()Z", 0)), C24560g0.m30726b(new C24570s(cls, "enableGfx", "getEnableGfx()Z", 0)), C24560g0.m30726b(new C24570s(cls, "gcFactor", "getGcFactor()F", 0)), C24560g0.m30726b(new C24570s(cls, "enableRequestAnimationFrame", "getEnableRequestAnimationFrame()Z", 0)), C24560g0.m30726b(new C24570s(cls, "enableWxBindCanvasTexture", "getEnableWxBindCanvasTexture()Z", 0)), C24560g0.m30726b(new C24570s(cls, "enableWindowAttributesAlpha", "getEnableWindowAttributesAlpha()Z", 0)), C24560g0.m30726b(new C24570s(cls, "cmdPoolType", "getCmdPoolType()I", 0)), C24560g0.m30726b(new C24570s(cls, "revertCpuOptimizerTest", "getRevertCpuOptimizerTest()Z", 0)), C24560g0.m30726b(new C24570s(cls, "isGame", "isGame()Z", 0)), C24560g0.m30726b(new C24570s(cls, "enableFontBatch", "getEnableFontBatch()Z", 0)), C24560g0.m30726b(new C24570s(cls, "sdcardPath", "getSdcardPath()Ljava/lang/String;", 0)), C24560g0.m30726b(new C24570s(cls, "syncSurfaceDestroy", "getSyncSurfaceDestroy()Z", 0)), C24560g0.m30726b(new C24570s(cls, "supportGfxImageShareTexture", "getSupportGfxImageShareTexture()I", 0)), C24560g0.m30726b(new C24570s(cls, "supportClientVertexBuffer", "getSupportClientVertexBuffer()Z", 0)), C24560g0.m30726b(new C24570s(cls, "enableSkia2D", "getEnableSkia2D()Z", 0)), C24560g0.m30726b(new C24570s(cls, "enableGpuUnwrap", "getEnableGpuUnwrap()Z", 0)), C24560g0.m30726b(new C24570s(cls, "supportHardEncode", "getSupportHardEncode()Z", 0)), C24560g0.m30726b(new C24570s(cls, "supportHardDecode", "getSupportHardDecode()Z", 0)), C24560g0.m30726b(new C24570s(cls, "supportETC2nASTC", "getSupportETC2nASTC()Z", 0)), C24560g0.m30726b(new C24570s(cls, "forceRunV8MicroTasks", "getForceRunV8MicroTasks()Z", 0)), C24560g0.m30726b(new C24570s(cls, "renderThreadName", "getRenderThreadName()Ljava/lang/String;", 0)), C24560g0.m30726b(new C24570s(cls, "appBrandRuntime", "getAppBrandRuntime()J", 0))};
    }

    public C89167n() {
        C87412m.m108594g(C89190p.f257019d, "k");
        new C89168a.C89169a(this);
        this.f256985r = new C89168a(this, C89193s.f257022d);
        this.f256986s = new C89168a(this, C89192r.f257021d);
        this.f256987t = true;
        this.f256988u = true;
        this.f256989v = new C89168a(this, C89182h.f257011d);
        this.f256990w = new C89168a(this, C89199y.f257028d);
        this.f256991x = new C89168a(this, C89197w.f257026d);
        this.f256992y = new C89168a(this, C89186l.f257015d);
        this.f256993z = new C89168a(this, C89200z.f257029d);
        this.f256957A = new C89168a(this, C89180f0.f257009d);
        C87412m.m108594g(C89174c0.f257003d, "k");
        new C89168a.C89169a(this);
        this.f256958B = new C89168a(this, C89170a0.f256995d);
        this.f256959C = new C89168a(this, C89191q.f257020d);
        this.f256960D = new C89168a(this, C89189o.f257018d);
        this.f256961E = new C89168a(this, C89178e0.f257007d);
        this.f256962F = new C89168a(this, C89176d0.f257005d);
        this.f256963G = new C89168a(this, C89172b0.f257001d);
        this.f256964H = new C89168a(this, C89195u.f257024d);
        this.f256965I = new C89168a(this, C89198x.f257027d);
        this.f256966J = new C89168a(this, C89175d.f257004d);
        this.f256967K = new MBRuntime.MBParams();
    }

    /* renamed from: a */
    public final C90954a.C90956b mo123513a() {
        Object a = this.f256979l.mo125227a(this, f256956L[5]);
        C87412m.m108593f(a, "<get-animationFrameHandlerStrategy>(...)");
        return (C90954a.C90956b) a;
    }

    /* renamed from: b */
    public final int mo123514b() {
        return ((Number) this.f256973f.mo125227a(this, f256956L[2])).intValue();
    }

    /* renamed from: c */
    public final int mo123515c() {
        return ((Number) this.f256972e.mo125227a(this, f256956L[1])).intValue();
    }

    /* renamed from: d */
    public final float mo123516d() {
        return ((Number) this.f256971d.mo125227a(this, f256956L[0])).floatValue();
    }

    /* renamed from: e */
    public final void mo123517e(C90954a.C90956b bVar) {
        C87412m.m108594g(bVar, "<set-?>");
        this.f256979l.mo125228b(this, f256956L[5], bVar);
    }

    /* renamed from: f */
    public final void mo123518f(long j) {
        this.f256966J.mo125228b(this, f256956L[29], Long.valueOf(j));
    }

    /* renamed from: g */
    public final void mo123519g(float f) {
        this.f256971d.mo125228b(this, f256956L[0], Float.valueOf(f));
    }

    /* renamed from: h */
    public final void mo123520h(boolean z) {
        this.f256981n.mo125228b(this, f256956L[7], Boolean.valueOf(z));
    }

    /* renamed from: i */
    public final void mo123521i(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f256993z.mo125228b(this, f256956L[18], str);
    }

    /* renamed from: j */
    public final void mo123522j(boolean z) {
        this.f256957A.mo125228b(this, f256956L[19], Boolean.valueOf(z));
    }
}
