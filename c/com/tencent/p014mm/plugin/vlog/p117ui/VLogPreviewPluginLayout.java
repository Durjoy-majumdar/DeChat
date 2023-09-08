package com.tencent.p014mm.plugin.vlog.p117ui;

import a23.C0011b;
import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioView;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.plugin.vlog.model.C106192a1;
import com.tencent.p014mm.plugin.vlog.model.C106207s0;
import com.tencent.p014mm.plugin.vlog.model.C96533c0;
import com.tencent.p014mm.plugin.vlog.model.C96554r0;
import com.tencent.p014mm.plugin.vlog.model.C96557v0;
import com.tencent.p014mm.plugin.vlog.p117ui.preview.VLogPreloadPlayView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fh2.C107541d;
import fh2.C107543l;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h23.C108028g;
import h23.C108038q;
import h90.C98324b;
import hi2.C98453h;
import hi2.C98464o;
import j20.C117292a;
import j23.C98902i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import k23.C108860f;
import k23.C99090a;
import k23.C99094c;
import k23.C99095d;
import kotlin.Metadata;
import l23.C109230s0;
import lh2.C109344g0;
import lh2.C109348i;
import lh2.C109352j;
import lh2.C76698a0;
import lh2.C99448l;
import o40.C61926c;
import pe3.C47465a;
import ph2.C110214a;
import qh2.C101198e;
import qh2.C110396a;
import rx3.C13598b0;
import te3.C110965ic;
import te3.C50601nw;
import te3.C64645q23;
import te3.C64839xt2;
import te3.cs4;
import th2.C110992d;
import wg2.C102440a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/VLogPreviewPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BaseEditVideoPluginLayout;", "Lqh2/e;", "Landroid/view/View;", "getPlayerView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.VLogPreviewPluginLayout */
public final class VLogPreviewPluginLayout extends BaseEditVideoPluginLayout {

    /* renamed from: E */
    public C32228q<? super Boolean, ? super Integer, ? super C99090a.C99091a, C13598b0> f282681E;

    /* renamed from: F */
    public C109230s0 f282682F;

    /* renamed from: G */
    public C99090a f282683G;

    /* renamed from: H */
    public final C96554r0 f282684H = C108860f.f325994a;

    /* renamed from: com.tencent.mm.plugin.vlog.ui.VLogPreviewPluginLayout$a */
    public static final class C96574a extends C87413o implements C32228q<Boolean, Integer, C99090a.C99091a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ VLogPreviewPluginLayout f282685d;

        /* renamed from: e */
        public final /* synthetic */ Context f282686e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96574a(VLogPreviewPluginLayout vLogPreviewPluginLayout, Context context) {
            super(3);
            this.f282685d = vLogPreviewPluginLayout;
            this.f282686e = context;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int intValue = ((Number) obj2).intValue();
            C99090a.C99091a aVar = (C99090a.C99091a) obj3;
            C87412m.m108594g(aVar, "model");
            Log.m105924i("MicroMsg.VLogPreviewPluginLayout", "videoGenerateCallback success:" + booleanValue + "  errorCode:" + intValue + " model:" + aVar);
            VLogPreviewPluginLayout.m123908n(this.f282685d);
            if (booleanValue) {
                SightVideoJNI.optimizeMP4VFS(aVar.f290554a);
                C98453h.m127895t(C98453h.f288774a, aVar.f290554a, aVar.f290554a + "_thumb", 0, 4, (Object) null);
                C98464o.C98465a a = C98464o.f288797a.mo137832a(aVar.f290554a);
                Log.m105924i("MicroMsg.VLogPreviewPluginLayout", "vlog video output info:" + a);
                CaptureDataManager.f272890c.mo129794a(this.f282686e, new CaptureDataManager.CaptureVideoNormalModel(Boolean.valueOf(booleanValue), aVar.f290554a, aVar.f290555b, Long.valueOf((long) (a != null ? a.f288800c : 0)), Boolean.FALSE, C110992d.f332425a.mo162676j()));
            } else {
                Context context = this.f282686e;
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).finish();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VLogPreviewPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        this.f282681E = new C96574a(this, context);
        C96554r0 r0Var = C108860f.f325994a;
        Log.m105924i("MicroMsg.VLogPreviewPluginLayout", "VLogPreviewPluginLayout invoke init");
    }

    /* renamed from: n */
    public static final void m123908n(VLogPreviewPluginLayout vLogPreviewPluginLayout) {
        if (vLogPreviewPluginLayout.f272955D != null) {
            Log.m105924i("MicroMsg.EditorVideoPluginLayout", "hideDialog");
            Context context = vLogPreviewPluginLayout.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).runOnUiThread(new C110396a(vLogPreviewPluginLayout));
        }
    }

    /* renamed from: e */
    public boolean mo78564e() {
        Log.m105924i("MicroMsg.VLogPreviewPluginLayout", "onBackPress");
        if (super.mo78564e()) {
            return true;
        }
        C106192a1 a1Var = C106192a1.f316410a;
        a1Var.mo152108a((C96557v0) null);
        Log.m105924i("MicroMsg.VlogReporter", "record cancel");
        a1Var.mo152109b();
        C102440a navigator = getNavigator();
        if (navigator == null) {
            return true;
        }
        navigator.mo142012b(0, (C98324b) null);
        return true;
    }

    public View getPlayerView() {
        VLogPreloadPlayView vLogPreloadPlayView = new VLogPreloadPlayView(getContext());
        this.f282682F = new C109230s0(vLogPreloadPlayView, this);
        ArrayList<C109344g0> pluginList = getPluginList();
        C109230s0 s0Var = this.f282682F;
        if (s0Var != null) {
            pluginList.add(s0Var);
            return vLogPreloadPlayView;
        }
        C87412m.m108603p("previewPlayerPlugin");
        throw null;
    }

    /* renamed from: k */
    public void mo128671k(C102440a aVar, RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(aVar, "navigator");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        super.mo128671k(aVar, recordConfigProvider);
        int i = 8;
        getCropVideoPlugin().f292721f.setVisibility(8);
        C99448l editFinishPlugin = getEditFinishPlugin();
        UICustomParam uICustomParam = recordConfigProvider.f272927o;
        Integer num = null;
        Integer valueOf = uICustomParam != null ? Integer.valueOf(uICustomParam.f266576i) : null;
        UICustomParam uICustomParam2 = recordConfigProvider.f272927o;
        Integer valueOf2 = uICustomParam2 != null ? Integer.valueOf(uICustomParam2.f266577j) : null;
        UICustomParam uICustomParam3 = recordConfigProvider.f272927o;
        editFinishPlugin.mo138884a(valueOf, valueOf2, uICustomParam3 != null ? uICustomParam3.f266579o : null, uICustomParam3 != null ? Integer.valueOf(uICustomParam3.f266578n) : null);
        C110214a addMusicPlugin = getAddMusicPlugin();
        UICustomParam uICustomParam4 = recordConfigProvider.f272927o;
        Integer valueOf3 = uICustomParam4 != null ? Integer.valueOf(uICustomParam4.f266576i) : null;
        UICustomParam uICustomParam5 = recordConfigProvider.f272927o;
        C110214a.m149813d(addMusicPlugin, valueOf3, uICustomParam5 != null ? Integer.valueOf(uICustomParam5.f266577j) : null, (String) null, 0, 8, (Object) null);
        C76698a0 addonTextPlugin = getAddonTextPlugin();
        UICustomParam uICustomParam6 = recordConfigProvider.f272927o;
        String str = uICustomParam6 != null ? uICustomParam6.f266580p : null;
        addonTextPlugin.getClass();
        if (Util.isNullOrNil(str)) {
            addonTextPlugin.f224399d.setVisibility(8);
        } else {
            addonTextPlugin.f224399d.setVisibility(0);
            addonTextPlugin.f224399d.setText(str);
        }
        C109348i addTextPlugin = getAddTextPlugin();
        UICustomParam uICustomParam7 = recordConfigProvider.f272927o;
        Integer valueOf4 = uICustomParam7 != null ? Integer.valueOf(uICustomParam7.f266576i) : null;
        UICustomParam uICustomParam8 = recordConfigProvider.f272927o;
        if (uICustomParam8 != null) {
            num = Integer.valueOf(uICustomParam8.f266577j);
        }
        addTextPlugin.mo160547y(valueOf4, num);
        getMoreMenuPlugin().mo106975b(recordConfigProvider.f272905F);
        C109352j addTipPlugin = getAddTipPlugin();
        Map<String, Boolean> map = recordConfigProvider.f272927o.f266575h;
        C87412m.m108593f(map, "configProvider.uiParam.pluginHiddenMap");
        if (!((HashMap) map).containsKey("plugin_tip")) {
            i = 0;
        }
        addTipPlugin.f327370h = i;
    }

    /* renamed from: l */
    public void mo129855l(C98324b bVar) {
        Log.m105924i("MicroMsg.VLogPreviewPluginLayout", "loadCurrentPage model:" + bVar);
        super.mo129855l(bVar);
        C101198e.C62622a.m73576a(this, C101198e.C101199b.EDIT_VLOG_PREPARE, (Bundle) null, 2, (Object) null);
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        AudioCacheInfo audioCacheInfo;
        String str;
        int i;
        C96557v0 v0Var;
        AudioCacheInfo audioCacheInfo2;
        C101198e.C101199b bVar2 = bVar;
        Bundle bundle2 = bundle;
        C87412m.m108594g(bVar2, "status");
        Log.m105924i("MicroMsg.VLogPreviewPluginLayout", "statusChange " + bVar2 + "  param:" + bundle2);
        int ordinal = bVar.ordinal();
        Integer num = null;
        if (ordinal != 50) {
            if (ordinal != 51) {
                boolean z = false;
                if (ordinal == 62) {
                    C106192a1 a1Var = C106192a1.f316410a;
                    C96557v0 v0Var2 = C106192a1.f316416g;
                    if (v0Var2 != null) {
                        a1Var.mo152108a((C96557v0) null);
                        C110965ic icVar = new C110965ic();
                        icVar.f332072d = v0Var2.f282611a;
                        icVar.f332073e = 2;
                        icVar.f332075g = System.currentTimeMillis();
                        C64645q23 q232 = v0Var2.f282614d.f131933e;
                        str = "context.getString(R.string.vlog_dialog_tip)";
                        icVar.f332077i = (int) q232.f184934d;
                        icVar.f332076h = (int) q232.f184935e;
                        icVar.f332078j = (int) q232.f184937g;
                        ((ArrayList) C106192a1.f316414e).add(icVar);
                        Log.m105924i("MicroMsg.VlogReporter", "record select: vlogScriptModel = " + v0Var2);
                        a1Var.mo152108a(v0Var2);
                    } else {
                        str = "context.getString(R.string.vlog_dialog_tip)";
                    }
                    Log.m105924i("MicroMsg.VlogReporter", "record send");
                    a1Var.mo152109b();
                    onPause();
                    C99090a aVar = this.f282683G;
                    if (aVar != null) {
                        Log.m105924i("MicroMsg.VLogGenerateManager", "release");
                        C108038q qVar = aVar.f290550e;
                        qVar.getClass();
                        Log.m105924i("MicroMsg.VLogRemuxer", "release");
                        qVar.mo158427c();
                        qVar.f323535r.mo161988b();
                    }
                    if (getMoreMenuPlugin().f224407j) {
                        Pattern pattern = C61926c.f176038a;
                        i = 1;
                    } else {
                        i = 0;
                    }
                    CaptureDataManager.f272890c.f272892b.putInt("key_extra_feature_flag", i);
                    if (getMoreMenuPlugin().f224408n == 2) {
                        CaptureDataManager.f272890c.f272892b.putString("key_group_list", getMoreMenuPlugin().mo106974a());
                    } else if (getMoreMenuPlugin().f224408n == 3) {
                        CaptureDataManager.f272890c.f272892b.putString("key_black_list", getMoreMenuPlugin().mo106974a());
                    }
                    C96554r0 r0Var = this.f282684H;
                    if (((ArrayList) r0Var.f282595j).isEmpty()) {
                        v0Var = new C96557v0(0, new ArrayList(), "", new cs4(), (ArrayList) null, (ArrayList) null, (float[]) null, (float[]) null, 240, (C8480h) null);
                    } else {
                        long j = ((cs4) ((ArrayList) r0Var.f282595j).get(r0Var.f282599q)).f131932d;
                        List<C96533c0> b = r0Var.mo134630b((cs4) ((ArrayList) r0Var.f282595j).get(r0Var.f282599q));
                        String str2 = ((cs4) ((ArrayList) r0Var.f282595j).get(r0Var.f282599q)).f131933e.f184936f;
                        C87412m.m108593f(str2, "scripts[currentIndex].music.music_url");
                        v0Var = new C96557v0(j, b, str2, (cs4) ((ArrayList) r0Var.f282595j).get(r0Var.f282599q), (ArrayList) null, (ArrayList) null, (float[]) null, (float[]) null, 240, (C8480h) null);
                    }
                    if (!(!v0Var.f282612b.isEmpty())) {
                        Log.m105920e("MicroMsg.VLogPreviewPluginLayout", "model is not valid");
                        return;
                    }
                    v0Var.f282617g = getItemContainerPlugin().mo138888b();
                    v0Var.f282618h = getItemContainerPlugin().mo138893h();
                    v0Var.f282616f = getItemContainerPlugin().mo138889c();
                    v0Var.f282615e = getItemContainerPlugin().mo138890d((Matrix) null);
                    if (getContext() != null) {
                        Context context = getContext();
                        RecordConfigProvider configProvider = getConfigProvider();
                        C87412m.m108591d(configProvider);
                        this.f282683G = new C99090a(context, v0Var, configProvider, getAddMusicPlugin().mo161620c(), getAddMusicPlugin().f329710j);
                        String string = getContext().getString(C0966R.string.kc5);
                        C87412m.m108593f(string, str);
                        mo129856m(string);
                        int j2 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_TOP_STORY_REMUX_TYPE_INT, 0);
                        StringBuilder sb = new StringBuilder();
                        sb.append("remux foreground? ");
                        sb.append(j2 == 0);
                        Log.m105924i("MicroMsg.VLogPreviewPluginLayout", sb.toString());
                        if (j2 == 0) {
                            C99090a aVar2 = this.f282683G;
                            if (aVar2 != null) {
                                C109230s0 s0Var = this.f282682F;
                                if (s0Var != null) {
                                    int width = s0Var.f327030d.getWidth();
                                    C109230s0 s0Var2 = this.f282682F;
                                    if (s0Var2 != null) {
                                        int height = s0Var2.f327030d.getHeight();
                                        C32228q<? super Boolean, ? super Integer, ? super C99090a.C99091a, C13598b0> qVar2 = this.f282681E;
                                        C87412m.m108594g(qVar2, "callback");
                                        Log.m105924i("MicroMsg.VLogGenerateManager", "generate path :" + aVar2.f290548c.f272901B);
                                        aVar2.f290552g = qVar2;
                                        aVar2.f290550e.mo158429e(width, height);
                                        if (TextUtils.isEmpty(aVar2.f290547b.f282613c)) {
                                            aVar2.f290550e.mo126422a(aVar2.f290553h);
                                        } else {
                                            aVar2.f290549d.mo85939a(aVar2.f290547b.f282613c, new C99095d(aVar2));
                                        }
                                    } else {
                                        C87412m.m108603p("previewPlayerPlugin");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("previewPlayerPlugin");
                                    throw null;
                                }
                            }
                        } else {
                            C99090a aVar3 = this.f282683G;
                            if (aVar3 != null) {
                                C109230s0 s0Var3 = this.f282682F;
                                if (s0Var3 != null) {
                                    int width2 = s0Var3.f327030d.getWidth();
                                    C109230s0 s0Var4 = this.f282682F;
                                    if (s0Var4 != null) {
                                        int height2 = s0Var4.f327030d.getHeight();
                                        C32228q<? super Boolean, ? super Integer, ? super C99090a.C99091a, C13598b0> qVar3 = this.f282681E;
                                        C87412m.m108594g(qVar3, "callback");
                                        Log.m105924i("MicroMsg.VLogGenerateManager", "generate path :" + aVar3.f290548c.f272901B);
                                        aVar3.f290552g = qVar3;
                                        aVar3.f290550e.mo158429e(width2, height2);
                                        C108038q qVar4 = aVar3.f290550e;
                                        qVar4.f323536s = new C99094c(aVar3, width2, height2);
                                        qVar4.f323537t = true;
                                        Log.m105924i("MicroMsg.VLogRemuxer", "thumbPath : " + qVar4.f323538u);
                                        HandlerThread handlerThread = qVar4.f323533p;
                                        if (handlerThread != null) {
                                            handlerThread.quit();
                                        }
                                        qVar4.f323533p = C61926c.m72685j("VLogRemuxer_remuxVideo", false, new C108028g(qVar4));
                                        return;
                                    }
                                    C87412m.m108603p("previewPlayerPlugin");
                                    throw null;
                                }
                                C87412m.m108603p("previewPlayerPlugin");
                                throw null;
                            }
                        }
                    }
                } else if (ordinal == 91) {
                    C110214a addMusicPlugin = getAddMusicPlugin();
                    List<C64839xt2> a = this.f282684H.mo134629a();
                    addMusicPlugin.getClass();
                    addMusicPlugin.f329708h.mo151382g(a);
                    addMusicPlugin.f329708h.mo151399r(0, true);
                } else if (ordinal == 88) {
                    getItemContainerPlugin().f291592d.setVisibility(0);
                    getVideoControlContainerPlugin().setVisibility(0);
                    C110214a addMusicPlugin2 = getAddMusicPlugin();
                    RecordConfigProvider configProvider2 = getConfigProvider();
                    this.f282684H.getClass();
                    addMusicPlugin2.getClass();
                    C107541d dVar = new C107541d();
                    Log.m105924i("MicroMsg.EditAddMusicPlugin", "editorConfig : " + dVar);
                    if (configProvider2 != null) {
                        num = Integer.valueOf(configProvider2.f272905F);
                    }
                    if (num != null && num.intValue() == 2) {
                        dVar.f321753f = C107543l.SNSComm;
                        dVar.f321750c = true;
                        dVar.f321749b = true;
                    } else if (num != null && num.intValue() == 3) {
                        dVar.f321753f = C107543l.StoryComm;
                        dVar.f321749b = true;
                        dVar.f321750c = true;
                    } else if (num != null && num.intValue() == 11) {
                        dVar.f321753f = C107543l.Finder;
                        dVar.f321749b = true;
                        dVar.f321750c = true;
                    }
                    addMusicPlugin2.f329708h.setPlayMusicWhenSearchFinish(false);
                    EditorAudioView editorAudioView = addMusicPlugin2.f329708h;
                    editorAudioView.getClass();
                    editorAudioView.mo151392j(dVar);
                    editorAudioView.mo151391i(dVar);
                    editorAudioView.f315524H.mo163964O4(-1);
                    View view = editorAudioView.f315545q;
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar4.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "setup", "(Lcom/tencent/mm/plugin/recordvideo/config/EditorConfig;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "setup", "(Lcom/tencent/mm/plugin/recordvideo/config/EditorConfig;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    editorAudioView.mo151414z();
                    C110214a addMusicPlugin3 = getAddMusicPlugin();
                    List<C64839xt2> a2 = this.f282684H.mo134629a();
                    addMusicPlugin3.getClass();
                    addMusicPlugin3.f329708h.mo151382g(a2);
                } else if (ordinal != 89) {
                    Log.m105924i("MicroMsg.VLogPreviewPluginLayout", "unknown key " + bVar2);
                    super.mo14585p(bVar, bundle);
                } else if (bundle2 != null && (audioCacheInfo2 = (AudioCacheInfo) bundle2.getParcelable("EDIT_VLOG_SEARCH_MUSIC_FINISH_PARCELABLE")) != null) {
                    int i2 = audioCacheInfo2.f163813e;
                    this.f282684H.getClass();
                    Log.m105924i("MicroMsg.VLogPreviewPluginLayout", "requestVLogScript prepare:true");
                    String string2 = getContext().getString(C0966R.string.kc5);
                    C87412m.m108593f(string2, "context.getString(R.string.vlog_dialog_tip)");
                    mo129856m(string2);
                    C96554r0 r0Var2 = this.f282684H;
                    r0Var2.f282594i = new C98902i(this);
                    r0Var2.f282596n = i2;
                    if (i2 == 0) {
                        ((ArrayList) r0Var2.f282595j).clear();
                    }
                    byte[] decodeBytes = r0Var2.f282589d.decodeBytes("VLOG_CONF");
                    if (decodeBytes != null) {
                        if (decodeBytes.length == 0) {
                            z = true;
                        }
                        if (!z) {
                            C47465a parseFrom = new C50601nw().parseFrom(decodeBytes);
                            C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ClientConfFromServer");
                            r0Var2.f282591f = (C50601nw) parseFrom;
                            C61926c.m72657B("generateVLog", true, new C106207s0(r0Var2, r0Var2.f282593h));
                            return;
                        }
                    }
                    C86709a0.m107524d().mo123460f(new C0011b());
                }
            } else if (bundle2 != null && (audioCacheInfo = (AudioCacheInfo) bundle2.getParcelable("EDIT_SELECT_MUSIC_PARCELABLE")) != null && audioCacheInfo.f163821p == 3) {
                Log.m105924i("MicroMsg.VLogPreviewPluginLayout", "current script index is :" + audioCacheInfo.f163828w);
                C96554r0 r0Var3 = this.f282684H;
                int i3 = audioCacheInfo.f163828w;
                r0Var3.f282599q = i3;
                long j3 = ((cs4) ((ArrayList) r0Var3.f282595j).get(i3)).f131932d;
                List<C96533c0> b2 = r0Var3.mo134630b((cs4) ((ArrayList) r0Var3.f282595j).get(r0Var3.f282599q));
                String str3 = ((cs4) ((ArrayList) r0Var3.f282595j).get(r0Var3.f282599q)).f131933e.f184936f;
                C87412m.m108593f(str3, "scripts[currentIndex].music.music_url");
                C96557v0 v0Var3 = new C96557v0(j3, b2, str3, (cs4) ((ArrayList) r0Var3.f282595j).get(r0Var3.f282599q), (ArrayList) null, (ArrayList) null, (float[]) null, (float[]) null, 240, (C8480h) null);
                C109230s0 s0Var5 = this.f282682F;
                if (s0Var5 != null) {
                    VLogPreloadPlayView vLogPreloadPlayView = s0Var5.f327030d;
                    vLogPreloadPlayView.getClass();
                    Log.m105924i("MicroMsg.VLogPreloadPlayView", "renderScript:" + v0Var3);
                    vLogPreloadPlayView.f316822j = v0Var3;
                    C106192a1.f316410a.mo152108a(v0Var3);
                    return;
                }
                C87412m.m108603p("previewPlayerPlugin");
                throw null;
            }
        } else if (bundle2 != null) {
            boolean booleanValue = Boolean.valueOf(bundle2.getBoolean("PARAM_EDIT_ORIGIN_VOICE_MUTE_BOOLEAN")).booleanValue();
            C109230s0 s0Var6 = this.f282682F;
            if (s0Var6 != null) {
                s0Var6.f327030d.setMute(booleanValue);
            } else {
                C87412m.m108603p("previewPlayerPlugin");
                throw null;
            }
        }
    }

    public void release() {
        super.release();
    }
}
