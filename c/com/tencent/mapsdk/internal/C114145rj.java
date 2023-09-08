package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.tencent.map.lib.models.CommandFunctionModelClass;
import com.tencent.map.lib.models.EventParamsModelClass;
import com.tencent.map.lib.models.ReturnInfoModelClass;
import com.tencent.map.sdk.comps.vis.VisualLayer;
import com.tencent.map.sdk.comps.vis.VisualLayerOptions;
import com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider;
import com.tencent.map.tools.Callback;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.mapsdk.internal.C113667ef;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.rj */
public final class C114145rj implements VisualLayer {

    /* renamed from: c */
    private static final int f341677c = 15;

    /* renamed from: a */
    public int f341678a;

    /* renamed from: b */
    public C114153rk f341679b;

    /* renamed from: d */
    private C113645dy f341680d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<VisualLayer.OnLayerStatusChangedListener> f341681e;

    /* renamed from: f */
    private int f341682f;

    /* renamed from: g */
    private int f341683g;

    /* renamed from: h */
    private float f341684h;

    /* renamed from: i */
    private boolean f341685i;

    /* renamed from: j */
    private boolean f341686j;

    /* renamed from: k */
    private boolean f341687k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final String f341688l;

    /* renamed from: m */
    private final String f341689m;

    /* renamed from: n */
    private VectorOverlay f341690n;

    /* renamed from: o */
    private C113667ef f341691o;

    /* renamed from: p */
    private boolean f341692p = true;

    /* renamed from: q */
    private volatile int f341693q = -1;

    public C114145rj(VisualLayerOptions visualLayerOptions) {
        int i = 0;
        String substring = visualLayerOptions.getLayerId().substring(0, visualLayerOptions.getLayerId().lastIndexOf("_") == -1 ? visualLayerOptions.getLayerId().length() : visualLayerOptions.getLayerId().lastIndexOf("_"));
        this.f341689m = substring;
        i = visualLayerOptions.getLayerId().lastIndexOf("_") != -1 ? Integer.valueOf(visualLayerOptions.getLayerId().substring(visualLayerOptions.getLayerId().lastIndexOf("_") + 1)).intValue() : i;
        if (i == 0) {
            this.f341688l = substring;
        } else {
            this.f341688l = substring + "_" + i;
        }
        mo172781a(visualLayerOptions);
    }

    /* renamed from: c */
    private <T extends C113667ef> T m159334c() {
        return this.f341691o;
    }

    /* renamed from: d */
    private String m159336d() {
        return this.f341689m;
    }

    public final void addLayerStatusChangedListener(VisualLayer.OnLayerStatusChangedListener onLayerStatusChangedListener) {
        if (this.f341681e == null) {
            this.f341681e = new ArrayList();
        }
        this.f341681e.remove(onLayerStatusChangedListener);
        this.f341681e.add(onLayerStatusChangedListener);
    }

    public final void clearCache() {
        C113645dy dyVar;
        if (!isRemoved() && !TextUtils.isEmpty(this.f341688l) && (dyVar = this.f341680d) != null) {
            dyVar.mo171976c(this.f341688l);
        }
    }

    public final VisualLayer copy() {
        C113645dy dyVar = this.f341680d;
        if (dyVar == null) {
            return null;
        }
        int a = dyVar.mo171966a(this.f341689m);
        return this.f341680d.mo171967a(new VisualLayerOptions(this.f341689m + "_" + a).newBuilder().setAlpha(this.f341684h).setZIndex(this.f341683g).setTimeInterval(this.f341678a).setClickEnable(this.f341687k).build());
    }

    public final void enableClick(boolean z) {
        if (this.f341687k != z) {
            this.f341687k = z;
            VectorOverlay vectorOverlay = this.f341690n;
            if (vectorOverlay != null) {
                vectorOverlay.enableClick(z);
            }
        }
    }

    public final String executeCommand(TencentMap tencentMap, String str) {
        CommandFunctionModelClass.BaseCommandFunction a = C114156rn.m159356a(str);
        if (a == null) {
            return C114156rn.m159358a((ReturnInfoModelClass.ReturnStatus) new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse));
        }
        String str2 = a.commandFunction;
        if (TextUtils.isEmpty(str2)) {
            return C114156rn.m159358a((ReturnInfoModelClass.ReturnStatus) new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.unsupported));
        }
        C113889km.m157545b(C0949kl.f2254x, "executeCommand functionType: [" + str2 + "]");
        CommandFunctionModelClass.BaseCommandFunction a2 = C114156rn.m159357a(str, str2);
        VectorOverlay vectorOverlay = this.f341690n;
        if (vectorOverlay == null) {
            return C114156rn.m159358a((ReturnInfoModelClass.ReturnStatus) new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.internal));
        }
        ReturnInfoModelClass.ReturnStatus executeCommandFunction = vectorOverlay.executeCommandFunction(a2);
        C113889km.m157545b(C0949kl.f2254x, "executeCommand returnJson:" + C114156rn.m159358a(executeCommandFunction));
        return C114156rn.m159358a(executeCommandFunction);
    }

    public final ReturnInfoModelClass.ReturnStatus executeCommandFunction(CommandFunctionModelClass.BaseCommandFunction baseCommandFunction) {
        VectorOverlay vectorOverlay = this.f341690n;
        if (vectorOverlay != null) {
            return vectorOverlay.executeCommandFunction(baseCommandFunction);
        }
        return null;
    }

    public final float getAlpha() {
        return this.f341684h;
    }

    public final String getId() {
        return this.f341688l;
    }

    public final int getLevel() {
        return this.f341682f;
    }

    public final String getType() {
        VectorOverlay vectorOverlay = this.f341690n;
        return vectorOverlay == null ? "" : vectorOverlay.getType();
    }

    public final int getZIndex() {
        return this.f341683g;
    }

    public final boolean isClickEnabled() {
        VectorOverlay vectorOverlay = this.f341690n;
        if (vectorOverlay != null) {
            return vectorOverlay.isClickEnabled();
        }
        return false;
    }

    public final boolean isRemoved() {
        return this.f341685i;
    }

    public final boolean isVisible() {
        return this.f341686j;
    }

    public final void releaseData() {
        if (!isRemoved() && !TextUtils.isEmpty(this.f341688l)) {
            mo172779a();
        }
    }

    public final void remove() {
        List<VisualLayer.OnLayerStatusChangedListener> list = this.f341681e;
        if (list != null) {
            list.clear();
            this.f341681e = null;
        }
        mo172779a();
        C113645dy dyVar = this.f341680d;
        if (dyVar != null) {
            dyVar.mo171974b(this.f341688l);
            this.f341680d = null;
        }
        this.f341685i = true;
    }

    public final void removeLayerStatusChangedListener(VisualLayer.OnLayerStatusChangedListener onLayerStatusChangedListener) {
        List<VisualLayer.OnLayerStatusChangedListener> list = this.f341681e;
        if (list != null) {
            list.remove(onLayerStatusChangedListener);
        }
    }

    public final void setAlpha(float f) {
        if (this.f341684h != f) {
            this.f341684h = f;
            VectorOverlay vectorOverlay = this.f341690n;
            if (vectorOverlay != null) {
                vectorOverlay.setOpacity(f);
            }
        }
    }

    public final void setLevel(int i) {
        if (this.f341682f != i && i != 0) {
            this.f341682f = i;
            VectorOverlay vectorOverlay = this.f341690n;
            if (vectorOverlay != null) {
                vectorOverlay.setLevel(i);
            }
        }
    }

    public final void setOpacity(float f) {
        setAlpha(f);
    }

    public final void setTimeInterval(int i) {
        if (this.f341678a != i) {
            this.f341692p = true;
            this.f341678a = i;
            if (i > 0 && i < 15) {
                this.f341678a = 15;
            }
            m159335c(this.f341680d);
        }
    }

    public final void setVisibility(boolean z) {
        setVisible(z);
    }

    public final void setVisible(boolean z) {
        if (this.f341686j != z) {
            this.f341686j = z;
            VectorOverlay vectorOverlay = this.f341690n;
            if (vectorOverlay != null) {
                vectorOverlay.setVisibility(z);
            }
        }
    }

    public final void setZIndex(int i) {
        if (this.f341683g != i) {
            this.f341683g = i;
            VectorOverlay vectorOverlay = this.f341690n;
            if (vectorOverlay != null) {
                vectorOverlay.setZIndex(i);
            }
        }
    }

    /* renamed from: a */
    private void m159328a(C114153rk rkVar) {
        this.f341679b = rkVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m159335c(C113645dy dyVar) {
        if (dyVar != null && this.f341692p) {
            this.f341692p = false;
            int i = this.f341678a;
            if (i > 0) {
                if (i < 15) {
                    this.f341678a = 15;
                }
                dyVar.mo171968a(this.f341688l, this.f341678a);
                return;
            }
            dyVar.mo171981g(this.f341688l);
        }
    }

    /* renamed from: d */
    private void m159337d(C113645dy dyVar) {
        C113889km.m157545b(C0949kl.f2254x, "图层id[" + this.f341688l + "] #drawLayer");
        C113667ef efVar = this.f341691o;
        if (efVar != null && efVar.mo171988c() && dyVar != null) {
            C113667ef efVar2 = this.f341691o;
            C114153rk rkVar = this.f341679b;
            BaseOverlayProvider a = rkVar != null ? rkVar.mo172776a(efVar2) : null;
            if (a == null) {
                C113889km.m157553d(C0949kl.f2254x, "图层id[" + this.f341688l + "] 创建OverlayProvider失败");
                mo172780a(4);
                return;
            }
            C113889km.m157545b(C0949kl.f2254x, "图层id[" + this.f341688l + "] 创建OverlayProvider:" + a);
            a.setVectorOverlayLoadedListener((VectorOverlay.OnVectorOverlayLoadListener) new VectorOverlay.OnVectorOverlayLoadListener() {
                public final void onVectorOverlayLoaded(boolean z) {
                    if (z) {
                        C114145rj.this.mo172780a(0);
                    } else {
                        C114145rj.this.mo172780a(20);
                    }
                }
            });
            a.setVectorOverlayClickListener(new VectorOverlay.OnVectorOverlayClickListener() {
                public final void onClicked(LatLng latLng, String str, String str2) {
                    C114145rj.this.mo172783a(VisualLayer.OnLayerStatusChangedListener.EventType.ON_CLICK, JsonUtils.modelToJsonString(new EventParamsModelClass.ClickEventParams(C114145rj.this.f341688l, latLng, str, str2)));
                }
            });
            if (a instanceof GLModelOverlayProvider) {
                ((GLModelOverlayProvider) a).setTransAnimatorEndListener(new IAnimatorModel.IAnimatorEndListener() {
                    public final void onAnimatorEnd() {
                        C114145rj.this.mo172783a(VisualLayer.OnLayerStatusChangedListener.EventType.ON_TRANSLATEANIMATION_COMPLETE, JsonUtils.modelToJsonString(new EventParamsModelClass.TranslateAnimationCompleteEventParams(C114145rj.this.f341688l)));
                    }
                });
            }
            a.enableClick(this.f341687k);
            if (this.f341690n == null) {
                this.f341690n = dyVar.mo171977c_().f339859b.getMap().addVectorOverlay(a);
                C113889km.m157545b(C0949kl.f2254x, "图层id[" + this.f341688l + "] 创建Overlay:" + this.f341690n);
                return;
            }
            dyVar.mo171977c_().f339859b.getMap().updateVectorOverlay(this.f341690n, a);
            C113889km.m157545b(C0949kl.f2254x, "图层id[" + this.f341688l + "] 更新Overlay:" + this.f341690n);
        }
    }

    /* renamed from: b */
    private int m159330b() {
        return this.f341678a;
    }

    /* renamed from: a */
    public final void mo172779a() {
        VectorOverlay vectorOverlay = this.f341690n;
        if (vectorOverlay != null) {
            vectorOverlay.remove();
            this.f341690n = null;
        }
    }

    /* renamed from: b */
    public final void mo172785b(final C113645dy dyVar) {
        if (dyVar != null) {
            dyVar.mo171975b(this.f341688l, new Callback<byte[]>() {
                /* renamed from: a */
                private void m159346a(byte[] bArr) {
                    if (bArr != null && bArr.length > 0) {
                        C113889km.m157545b(C0949kl.f2254x, "图层id[" + C114145rj.this.f341688l + "] 刷新图层数据[" + bArr.length + "]");
                        if (C114145rj.this.mo172784a(bArr, true)) {
                            C114145rj.m159327a(C114145rj.this, dyVar);
                            dyVar.mo171971a(C114145rj.this.f341688l, bArr);
                        }
                    }
                    C114145rj.this.m159335c(dyVar);
                }

                public final /* synthetic */ void callback(Object obj) {
                    byte[] bArr = (byte[]) obj;
                    if (bArr != null && bArr.length > 0) {
                        C113889km.m157545b(C0949kl.f2254x, "图层id[" + C114145rj.this.f341688l + "] 刷新图层数据[" + bArr.length + "]");
                        if (C114145rj.this.mo172784a(bArr, true)) {
                            C114145rj.m159327a(C114145rj.this, dyVar);
                            dyVar.mo171971a(C114145rj.this.f341688l, bArr);
                        }
                    }
                    C114145rj.this.m159335c(dyVar);
                }
            });
        }
    }

    /* renamed from: b */
    private boolean m159333b(int i) {
        if (this.f341693q == i) {
            return false;
        }
        int i2 = this.f341693q;
        if (i2 == 0 ? i > this.f341693q : i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 20) {
            i = this.f341693q;
        }
        if (this.f341693q == i) {
            return false;
        }
        this.f341693q = i;
        return true;
    }

    public final void setZIndex(float f) {
        setZIndex((int) f);
    }

    /* renamed from: a */
    public final void mo172782a(final C113645dy dyVar) {
        this.f341680d = dyVar;
        if (dyVar.mo171979e(this.f341688l)) {
            dyVar.mo171970a(this.f341688l, (Callback<byte[]>) new Callback<byte[]>() {
                /* renamed from: a */
                private void m159345a(byte[] bArr) {
                    StringBuilder sb = new StringBuilder("图层id[");
                    sb.append(C114145rj.this.f341688l);
                    sb.append("] 读取本地图层数据[");
                    sb.append(bArr != null ? bArr.length : 0);
                    sb.append("]");
                    C113889km.m157545b(C0949kl.f2254x, sb.toString());
                    if (bArr != null && bArr.length > 0 && C114145rj.this.mo172784a(bArr, false)) {
                        C114145rj.m159327a(C114145rj.this, dyVar);
                    }
                    C114145rj.this.mo172785b(dyVar);
                }

                public final /* synthetic */ void callback(Object obj) {
                    byte[] bArr = (byte[]) obj;
                    StringBuilder sb = new StringBuilder("图层id[");
                    sb.append(C114145rj.this.f341688l);
                    sb.append("] 读取本地图层数据[");
                    sb.append(bArr != null ? bArr.length : 0);
                    sb.append("]");
                    C113889km.m157545b(C0949kl.f2254x, sb.toString());
                    if (bArr != null && bArr.length > 0 && C114145rj.this.mo172784a(bArr, false)) {
                        C114145rj.m159327a(C114145rj.this, dyVar);
                    }
                    C114145rj.this.mo172785b(dyVar);
                }
            });
        } else if (dyVar.mo171973a()) {
            mo172780a(2);
        } else {
            dyVar.mo171980f(this.f341688l);
        }
    }

    /* renamed from: a */
    public final void mo172781a(VisualLayerOptions visualLayerOptions) {
        if (visualLayerOptions != null) {
            setAlpha(visualLayerOptions.getAlpha());
            setLevel(visualLayerOptions.getLevel());
            setTimeInterval(visualLayerOptions.getTimeInterval());
            setVisible(visualLayerOptions.isVisible());
            setZIndex(visualLayerOptions.getZIndex());
            enableClick(visualLayerOptions.isClickEnabled());
        }
    }

    /* renamed from: a */
    public final boolean mo172784a(byte[] bArr, boolean z) {
        C113667ef efVar;
        C113667ef.C113675b bVar;
        StringBuilder sb = new StringBuilder("图层id[");
        sb.append(this.f341688l);
        sb.append("] #parseLayerData[");
        sb.append(bArr != null ? bArr.length : 0);
        sb.append("]");
        C113889km.m157545b(C0949kl.f2254x, sb.toString());
        C114153rk rkVar = this.f341679b;
        C113667ef efVar2 = null;
        C113667ef a = rkVar != null ? rkVar.mo172778a(bArr) : null;
        this.f341691o = a;
        if (a != null && this.f341680d != null && a.mo171988c()) {
            C113667ef efVar3 = this.f341691o;
            String d = this.f341680d.mo171978d(this.f341688l);
            C114153rk rkVar2 = this.f341679b;
            if (rkVar2 != null) {
                efVar2 = rkVar2.mo172777a(efVar3, d);
            }
            this.f341691o = efVar2;
            this.f341680d.mo171969a(getId(), this.f341691o.mo171986a(), this.f341691o.mo171987b());
            C113889km.m157545b(C0949kl.f2254x, "图层id[" + this.f341688l + "] 创建Protocol对象：成功");
            return true;
        } else if (!z || (efVar = this.f341691o) == null || (bVar = efVar.f340093b) == null || bVar.f340112a != 0) {
            mo172780a(3);
            C113889km.m157553d(C0949kl.f2254x, "图层id[" + this.f341688l + "] 创建Protocol对象：失败");
            return false;
        } else {
            C113889km.m157545b(C0949kl.f2254x, "图层id[" + this.f341688l + "] 创建Protocol对象：网络返回数据版本无变化, 无需更新本地数据");
            return false;
        }
    }

    /* renamed from: a */
    private C113667ef m159325a(byte[] bArr) {
        C114153rk rkVar = this.f341679b;
        if (rkVar != null) {
            return rkVar.mo172778a(bArr);
        }
        return null;
    }

    /* renamed from: a */
    private C113667ef m159324a(C113667ef efVar, String str) {
        C114153rk rkVar = this.f341679b;
        if (rkVar != null) {
            return rkVar.mo172777a(efVar, str);
        }
        return null;
    }

    /* renamed from: a */
    private BaseOverlayProvider m159323a(C113667ef efVar) {
        C114153rk rkVar = this.f341679b;
        if (rkVar != null) {
            return rkVar.mo172776a(efVar);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo172780a(final int i) {
        C113889km.m157545b(C0949kl.f2254x, "图层id[" + this.f341688l + "] notifyStatusChange want from[" + this.f341693q + "]to[" + i + "]");
        C113865kb.m157400a(new Runnable() {
            public final void run() {
                if (C114145rj.m159329a(C114145rj.this, i) && C114145rj.this.f341681e != null) {
                    C113889km.m157545b(C0949kl.f2254x, "图层id[" + C114145rj.this.f341688l + "] notifyStatusChange do success");
                    ArrayList arrayList = new ArrayList(C114145rj.this.f341681e);
                    C114145rj.this.mo172783a(VisualLayer.OnLayerStatusChangedListener.EventType.ON_LAYER_LOAD_FINISH, JsonUtils.modelToJsonString(new EventParamsModelClass.LoadFinishEventParams(C114145rj.this.f341688l, EventParamsModelClass.LoadFinishEventParams.LoadFinishInfo.getById(i))));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        VisualLayer.OnLayerStatusChangedListener onLayerStatusChangedListener = (VisualLayer.OnLayerStatusChangedListener) it.next();
                        if (onLayerStatusChangedListener != null) {
                            onLayerStatusChangedListener.onLayerLoadFinish(i);
                        }
                    }
                }
            }
        }, 10);
    }

    /* renamed from: a */
    public final void mo172783a(final String str, final String str2) {
        C113865kb.m157400a(new Runnable() {
            public final void run() {
                if (C114145rj.this.f341681e != null) {
                    Iterator it = new ArrayList(C114145rj.this.f341681e).iterator();
                    while (it.hasNext()) {
                        VisualLayer.OnLayerStatusChangedListener onLayerStatusChangedListener = (VisualLayer.OnLayerStatusChangedListener) it.next();
                        if (onLayerStatusChangedListener != null) {
                            onLayerStatusChangedListener.onEvent(this, str, str2);
                        }
                    }
                }
            }
        }, 10);
    }

    /* renamed from: a */
    public static /* synthetic */ void m159327a(C114145rj rjVar, C113645dy dyVar) {
        C113889km.m157545b(C0949kl.f2254x, "图层id[" + rjVar.f341688l + "] #drawLayer");
        C113667ef efVar = rjVar.f341691o;
        if (efVar != null && efVar.mo171988c() && dyVar != null) {
            C113667ef efVar2 = rjVar.f341691o;
            C114153rk rkVar = rjVar.f341679b;
            BaseOverlayProvider a = rkVar != null ? rkVar.mo172776a(efVar2) : null;
            if (a == null) {
                C113889km.m157553d(C0949kl.f2254x, "图层id[" + rjVar.f341688l + "] 创建OverlayProvider失败");
                rjVar.mo172780a(4);
                return;
            }
            C113889km.m157545b(C0949kl.f2254x, "图层id[" + rjVar.f341688l + "] 创建OverlayProvider:" + a);
            a.setVectorOverlayLoadedListener((VectorOverlay.OnVectorOverlayLoadListener) new VectorOverlay.OnVectorOverlayLoadListener() {
                public final void onVectorOverlayLoaded(boolean z) {
                    if (z) {
                        C114145rj.this.mo172780a(0);
                    } else {
                        C114145rj.this.mo172780a(20);
                    }
                }
            });
            a.setVectorOverlayClickListener(new VectorOverlay.OnVectorOverlayClickListener() {
                public final void onClicked(LatLng latLng, String str, String str2) {
                    C114145rj.this.mo172783a(VisualLayer.OnLayerStatusChangedListener.EventType.ON_CLICK, JsonUtils.modelToJsonString(new EventParamsModelClass.ClickEventParams(C114145rj.this.f341688l, latLng, str, str2)));
                }
            });
            if (a instanceof GLModelOverlayProvider) {
                ((GLModelOverlayProvider) a).setTransAnimatorEndListener(new IAnimatorModel.IAnimatorEndListener() {
                    public final void onAnimatorEnd() {
                        C114145rj.this.mo172783a(VisualLayer.OnLayerStatusChangedListener.EventType.ON_TRANSLATEANIMATION_COMPLETE, JsonUtils.modelToJsonString(new EventParamsModelClass.TranslateAnimationCompleteEventParams(C114145rj.this.f341688l)));
                    }
                });
            }
            a.enableClick(rjVar.f341687k);
            if (rjVar.f341690n == null) {
                rjVar.f341690n = dyVar.mo171977c_().f339859b.getMap().addVectorOverlay(a);
                C113889km.m157545b(C0949kl.f2254x, "图层id[" + rjVar.f341688l + "] 创建Overlay:" + rjVar.f341690n);
                return;
            }
            dyVar.mo171977c_().f339859b.getMap().updateVectorOverlay(rjVar.f341690n, a);
            C113889km.m157545b(C0949kl.f2254x, "图层id[" + rjVar.f341688l + "] 更新Overlay:" + rjVar.f341690n);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m159329a(C114145rj rjVar, int i) {
        if (rjVar.f341693q == i) {
            return false;
        }
        int i2 = rjVar.f341693q;
        if (i2 == 0 ? i > rjVar.f341693q : i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 20) {
            i = rjVar.f341693q;
        }
        if (rjVar.f341693q == i) {
            return false;
        }
        rjVar.f341693q = i;
        return true;
    }
}
