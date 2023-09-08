package lb2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53965x0;
import android.content.Intent;
import com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvMakerPreviewUI;
import com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvRouterUI;
import com.tencent.p014mm.plugin.p081mv.p082ui.free.MusicMvFreeMakerPreviewUI;
import fy3.C32227p;
import j20.C117292a;
import k20.C9556a;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.MusicMvRouterUI$createPreviewMv$1", mo125469f = "MusicMvRouterUI.kt", mo125470l = {133, 144}, mo125471m = "invokeSuspend")
/* renamed from: lb2.e */
public final class C61273e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f174377d;

    /* renamed from: e */
    public final /* synthetic */ MusicMvRouterUI f174378e;

    /* renamed from: f */
    public final /* synthetic */ MusicMvRouterUI f174379f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61273e(MusicMvRouterUI musicMvRouterUI, MusicMvRouterUI musicMvRouterUI2, C15601d<? super C61273e> dVar) {
        super(2, dVar);
        this.f174378e = musicMvRouterUI;
        this.f174379f = musicMvRouterUI2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61273e(this.f174378e, this.f174379f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61273e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f174377d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MusicMvRouterUI musicMvRouterUI = this.f174378e;
            this.f174377d = 1;
            int i2 = MusicMvRouterUI.f272340g;
            musicMvRouterUI.getClass();
            obj2 = C53895h.m60469g(C53872d1.f151119c, new C61274f(musicMvRouterUI, (C15601d<? super C61274f>) null), this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            this.f174378e.finish();
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Intent intent = ((Boolean) obj2).booleanValue() ? new Intent(this.f174379f, MusicMvFreeMakerPreviewUI.class) : new Intent(this.f174379f, MusicMvMakerPreviewUI.class);
        byte[] byteArrayExtra = this.f174378e.getIntent().getByteArrayExtra("key_track_data");
        if (byteArrayExtra != null) {
            intent.putExtra("key_track_data", byteArrayExtra);
        }
        Intent intent2 = intent;
        C61926c.m72680e(intent2, this.f174378e.getIntent(), "key_mv_music_duration", 0, 4, (Object) null);
        C61926c.m72680e(intent2, this.f174378e.getIntent(), "key_mv_from_scene", 0, 4, (Object) null);
        C61926c.m72680e(intent2, this.f174378e.getIntent(), "key_mv_enter_maker_ui_from_scene", 0, 4, (Object) null);
        MusicMvRouterUI musicMvRouterUI2 = this.f174378e;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent);
        MusicMvRouterUI musicMvRouterUI3 = musicMvRouterUI2;
        C117292a.m165358d(musicMvRouterUI3, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI$createPreviewMv$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        musicMvRouterUI2.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(musicMvRouterUI3, "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI$createPreviewMv$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f174377d = 2;
        if (C53965x0.m60607b(500, this) == aVar) {
            return aVar;
        }
        this.f174378e.finish();
        return C13598b0.f38549a;
    }
}
