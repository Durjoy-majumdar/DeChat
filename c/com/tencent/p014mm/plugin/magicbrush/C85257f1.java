package com.tencent.p014mm.plugin.magicbrush;

import a52.C0013b;
import a52.C79466a;
import b52.C79669b;
import b52.C79670c;
import c52.C79933b;
import c52.C79934c;
import c52.C79935d;
import c52.C79936e;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$PublicServiceNames;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import d52.C45265b;
import d52.C45266c;
import di3.C86301e;
import e42.C7594e;
import e42.C7597n;
import e42.C86430i;
import e42.C86431j;
import e52.C86441a;
import e52.C86442b;
import ei3.C86522b;
import f52.C45754a;
import f52.C45757c;
import gy3.C87412m;
import java.util.List;
import java.util.Map;
import r42.C12941b;
import rx3.C13604l;
import s42.C90127b;
import s42.C90130d;
import sx3.C110818d0;
import sx3.C64186f0;
import sx3.C64197v;
import sx3.C90364q0;
import t42.C13823a;
import t42.C13825c;
import t42.C13829e;
import u42.C52446c;
import u42.C90611a;
import u42.C90613b;
import u42.C90615d;
import u42.C90617e;
import u42.C90619f;
import v42.C90749c;
import w42.C15037a;
import w42.C15040c;
import w42.C15042d;
import w42.C15043e;
import w42.C90896b;
import w42.C90898f;
import y42.C91375a;
import y42.C91377b;
import y42.C91379c;
import y42.C91380d;
import z42.C16100a;

@C86522b
/* renamed from: com.tencent.mm.plugin.magicbrush.f1 */
public final class C85257f1 extends C86301e implements C30183d0 {

    /* renamed from: d */
    public final Map<String, List<C86431j<C7594e>>> f248403d;

    public C85257f1() {
        C86431j[] jVarArr = {new C15040c(), new C45754a(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_LIVE_CARD), new C45757c(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_LIVE_CARD), new C0013b(), new C79466a(), new C79670c(), new C79669b(), new C90896b(), new C45266c(), new C45265b()};
        C90749c cVar = C90749c.f260644a;
        this.f248403d = C90364q0.m113147f(new C13604l(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_LIVE_CARD, C64197v.m75537f(jVarArr)), new C13604l(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRAND_SERVICE, cVar.mo124878a(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRAND_SERVICE)), new C13604l(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE, cVar.mo124878a(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE)), new C13604l(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_SCL_DEMO, cVar.mo124878a(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE)), new C13604l(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_LAND_PAGE, C110818d0.m150933e0(C64197v.m75537f(new C45754a(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_LAND_PAGE), new C45757c(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_LAND_PAGE), new C0013b(), new C79466a(), new C79670c(), new C79669b(), new C45265b(), new C45266c()), C64197v.m75537f(new C15043e(), new C90898f(), new C15037a(), new C90896b(), new C16100a(), new C15042d(), new C15040c()))), new C13604l(MagicBrushConstants$PublicServiceNames.BIZ_AD_PUBLIC_SERVICE, C64197v.m75537f(new C45757c(MagicBrushConstants$PublicServiceNames.BIZ_AD_PUBLIC_SERVICE), new C45754a(MagicBrushConstants$PublicServiceNames.BIZ_AD_PUBLIC_SERVICE), new C45266c(), new C45265b())), new C13604l(MagicBrushConstants$PublicServiceNames.BIZ_SCL_PUBLIC_SERVICE, C64197v.m75537f(new C45266c(), new C45265b())));
    }

    public <T extends C7594e> List<C86431j<T>> Ep0(String str) {
        C87412m.m108594g(str, "key");
        List<C86431j<T>> list = this.f248403d.get(str);
        boolean z = BuildInfo.DEBUG;
        return list == null ? C64186f0.f181907d : list;
    }

    public final List<C86430i<C7597n>> vx0() {
        return C64197v.m75537f(new C13823a(), new C13825c(), new C13829e(), new C12941b(), new C86441a(), new C86442b());
    }

    public List<C86431j<C7597n>> wj0(String str) {
        C87412m.m108594g(str, "bizName");
        return (C87412m.m108589b(str, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_EMOJI) || C87412m.m108589b(str, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_PLAYABLE)) ? vx0() : (C87412m.m108589b(str, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE) || C87412m.m108589b(str, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_LAND_PAGE)) ? C110818d0.m150933e0(C110818d0.m150933e0(vx0(), wx0()), yx0()) : C87412m.m108589b(str, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRAND_SERVICE) ? C110818d0.m150933e0(C110818d0.m150933e0(vx0(), yx0()), xx0()) : C110818d0.m150933e0(C110818d0.m150933e0(C110818d0.m150933e0(vx0(), wx0()), yx0()), xx0());
    }

    public final List<C90127b<? extends C90130d>> wx0() {
        return C64197v.m75537f(new C90127b(C90611a.class), new C90127b(C90613b.class), new C90127b(C90615d.class), new C90127b(C52446c.class), new C90127b(C90619f.class), new C90127b(C90617e.class));
    }

    public final List<C86430i<C7597n>> xx0() {
        return C64197v.m75537f(new C91377b(), new C91380d(), new C91375a(), new C91379c());
    }

    public final List<C86431j<C7597n>> yx0() {
        return C64197v.m75537f(new C79935d(), new C79933b(), new C79936e(), new C79934c());
    }
}
