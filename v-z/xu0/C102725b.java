package xu0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.sdk.pipeline.Pipeline;
import com.tencent.p014mm.sdk.pipeline.PipelineFailAction;
import com.tencent.p014mm.sdk.pipeline.PipelineInitAction;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import com.tencent.p014mm.sdk.pipeline.PipelineSuccessAction;
import com.tencent.p014mm.sdk.pipeline.anno.PipelineFlow;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import n20.C100032b;
import n20.C100035h;
import n20.C100036i;
import n20.C100037j;
import n20.C100039p;
import n20.C61605g;
import n20.C61606l;
import n20.C61607m;
import p196ln.C76707h;
import p996kj.C88155a;
import rx3.C13598b0;
import vu0.C102291a;
import vu0.C102292b;
import wb0.C102382b;
import wb0.C102383c;

/* renamed from: xu0.b */
public class C102725b extends C100035h {

    /* renamed from: xu0.b$a */
    public static final class C102726a extends C87413o implements C32226l<PipelineState, C13598b0> {

        /* renamed from: d */
        public static final C102726a f303340d = new C102726a();

        public C102726a() {
            super(1);
        }

        public Object invoke(Object obj) {
            PipelineState pipelineState = (PipelineState) obj;
            C87412m.m108594g(pipelineState, "state");
            IStateAction action = pipelineState.getAction();
            if (action != null && (action instanceof PipelineInitAction)) {
                PipelineInitAction pipelineInitAction = (PipelineInitAction) action;
                pipelineState.put("Common_TempFolder", ((C76707h) C86312j.m106911c(C76707h.class)).u00(pipelineState.getStringOrInterrupt("Avatar_Username")));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102725b(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
    }

    public String getUniqueKey() {
        return state().getStringOrInterrupt("Common_ImageKey");
    }

    @PipelineFlow
    public BaseStateAction handleAvatarCheckExpired(PipelineState pipelineState, C102292b bVar) {
        BaseStateAction iVar;
        C87412m.m108594g(pipelineState, "state");
        C87412m.m108594g(bVar, "action");
        C86009m1 m1Var = (C86009m1) pipelineState.getOrInterrupt("Common_TempFolder");
        String stringOrInterrupt = pipelineState.getStringOrInterrupt("Common_ImageKey");
        int ordinal = bVar.f301271a.ordinal();
        if (ordinal == 0) {
            String i = new C86009m1(m1Var, bVar.f301272b).mo119971i();
            C87412m.m108593f(i, "VFSFile(tempFolder, action.checkKey).absolutePath");
            iVar = new C100036i(stringOrInterrupt, i);
        } else if (ordinal == 1) {
            String i2 = new C86009m1(m1Var, bVar.f301272b).mo119971i();
            C87412m.m108593f(i2, "VFSFile(tempFolder, action.checkKey).absolutePath");
            iVar = new C102382b(stringOrInterrupt, i2);
        } else if (ordinal != 2) {
            return new PipelineFailAction((PipelineState) null, 1, (C8480h) null);
        } else {
            ((C76707h) C86312j.m106911c(C76707h.class)).mo106985F1(stringOrInterrupt);
            return new PipelineSuccessAction((PipelineState) null, 1, (C8480h) null);
        }
        return iVar;
    }

    @PipelineFlow
    public BaseStateAction handleAvatarImgFlag(PipelineState pipelineState, C102727d dVar) {
        C87412m.m108594g(pipelineState, "state");
        C87412m.m108594g(dVar, "action");
        C86009m1 m1Var = (C86009m1) pipelineState.getOrInterrupt("Common_TempFolder");
        C68097n nVar = dVar.f303341a;
        if (nVar == null) {
            return new PipelineFailAction((PipelineState) null, 1, (C8480h) null);
        }
        String g = nVar.mo93598g();
        C87412m.m108593f(g, "it.username");
        return new C102291a(g, m1Var);
    }

    @PipelineFlow
    public BaseStateAction handleConvertDataToBitmap(PipelineState pipelineState, C100032b bVar) {
        C87412m.m108594g(pipelineState, "state");
        C87412m.m108594g(bVar, "action");
        WeakReference weakReference = (WeakReference) pipelineState.getOrInterrupt("Common_ImageViewRef");
        Bitmap bitmap = bVar.f293061b;
        if (bitmap == null) {
            return new PipelineFailAction((PipelineState) null, 1, (C8480h) null);
        }
        ((C76707h) C86312j.m106911c(C76707h.class)).mo106984CO(bVar.f293060a, bitmap);
        return new C61606l(bVar.f293060a, bitmap, weakReference);
    }

    @PipelineFlow
    public BaseStateAction handleDataFromFile(PipelineState pipelineState, C100037j jVar) {
        C87412m.m108594g(pipelineState, "state");
        C87412m.m108594g(jVar, "action");
        return super.handleDataFromFile(pipelineState, jVar);
    }

    @PipelineFlow
    public BaseStateAction handleDataFromRemote(PipelineState pipelineState, C102383c cVar) {
        C87412m.m108594g(pipelineState, "state");
        C87412m.m108594g(cVar, "action");
        return super.handleDataFromRemote(pipelineState, cVar);
    }

    @PipelineFlow
    public BaseStateAction handleShowImageDone(PipelineState pipelineState, C61607m mVar) {
        C87412m.m108594g(pipelineState, "state");
        C87412m.m108594g(mVar, "action");
        return super.handleShowImageDone(pipelineState, mVar);
    }

    public void onCreate() {
        super.onCreate();
        process(C102726a.f303340d);
    }

    public void onPipelineDuplicated() {
        Map map = (Map) state().get("Common_ImageViewRefMap");
        if (map != null) {
            String stringOrInterrupt = state().getStringOrInterrupt("Common_ImageKey");
            WeakReference weakReference = (WeakReference) state().getOrInterrupt("Common_ImageViewRef");
            Object obj = map.get(stringOrInterrupt);
            if (obj == null) {
                obj = new ArrayList();
                map.put(stringOrInterrupt, obj);
            }
            ((List) obj).add(weakReference);
        }
    }

    public BaseStateAction start(PipelineState pipelineState) {
        Class cls = C76707h.class;
        C87412m.m108594g(pipelineState, "state");
        String stringOrInterrupt = pipelineState.getStringOrInterrupt("Avatar_Username");
        String stringOrInterrupt2 = pipelineState.getStringOrInterrupt("Common_ImageKey");
        C61605g gVar = (C61605g) pipelineState.getOrInterrupt("Common_BitmapOptions");
        WeakReference weakReference = (WeakReference) pipelineState.getOrInterrupt("Common_ImageViewRef");
        Bitmap W2 = ((C76707h) C86312j.m106911c(cls)).mo106988W2(stringOrInterrupt2);
        if (W2 != null) {
            ImageView imageView = (ImageView) weakReference.get();
            if (imageView != null) {
                imageView.setImageBitmap(W2);
            }
            Log.m105924i("MicroMsg.Avatar.AvatarImageLoaderFlowPPC", "onCreateAfter setImageBitmap From Cache " + stringOrInterrupt2 + ' ' + C100039p.m130707a(W2));
            return new PipelineSuccessAction((PipelineState) null, 1, (C8480h) null);
        }
        Integer num = (Integer) ((ConcurrentHashMap) AvatarStorage.f195665d).get(stringOrInterrupt);
        if (num != null) {
            Bitmap decodeResource = C88155a.decodeResource(MMApplicationContext.getResources(), num.intValue(), (BitmapFactory.Options) null);
            if (decodeResource != null) {
                gVar.getClass();
                float f = gVar.f175194c;
                if (f > 0.0f) {
                    decodeResource = BitmapUtil.getRoundedCornerBitmap(decodeResource, false, f * ((float) decodeResource.getWidth()));
                }
            }
            C87412m.m108593f(decodeResource, "spBitmap");
            ((C76707h) C86312j.m106911c(cls)).mo106984CO(stringOrInterrupt2, decodeResource);
            ImageView imageView2 = (ImageView) weakReference.get();
            if (imageView2 != null) {
                imageView2.setImageBitmap(decodeResource);
            }
            Log.m105924i("MicroMsg.Avatar.AvatarImageLoaderFlowPPC", "onCreateAfter spuser avatar " + stringOrInterrupt2 + ' ' + C100039p.m130707a(W2));
            return new PipelineSuccessAction((PipelineState) null, 1, (C8480h) null);
        }
        if (gVar.f175195d != 0) {
            ImageView imageView3 = (ImageView) weakReference.get();
            if (imageView3 != null) {
                imageView3.setImageResource(gVar.f175195d);
            }
            Log.m105918d("MicroMsg.Avatar.AvatarImageLoaderFlowPPC", "onCreateAfter normal user default bg res " + stringOrInterrupt2);
        } else if (gVar.f175196e != null) {
            ImageView imageView4 = (ImageView) weakReference.get();
            if (imageView4 != null) {
                imageView4.setImageBitmap(gVar.f175196e);
            }
            Log.m105918d("MicroMsg.Avatar.AvatarImageLoaderFlowPPC", "onCreateAfter normal user default bg bitmap " + stringOrInterrupt2);
        }
        return new C78989c(stringOrInterrupt);
    }
}
