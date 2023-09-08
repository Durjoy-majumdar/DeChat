package com.tencent.p014mm.plugin.finder.gallery;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.List;
import jq3.C9500j;
import pe3.C89349b;
import zf1.C66791a;
import zf1.C66792b;
import zf1.C66800f;

/* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryRingToneConfig */
public final class FinderGalleryRingToneConfig extends FinderGalleryDefaultConfig {

    /* renamed from: c */
    public BaseFinderFeed f159157c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderGalleryRingToneConfig(C66791a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "data");
    }

    /* renamed from: a */
    public C9500j mo77476a(int i) {
        return new FinderGalleryRingToneConfig$buildItemCoverts$1(this);
    }

    /* renamed from: i */
    public void mo77484i(MMActivity mMActivity, int i, int i2, Intent intent, C66792b.C66794b bVar) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bVar, "curActivity");
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                mo77488m(i, i2, mMActivity, true);
            }
        } else if (!mo77488m(i, i2, mMActivity, false) && i == 20000 && i2 == -1) {
            mMActivity.setResult(-1, intent);
            mMActivity.finish();
        }
    }

    /* renamed from: j */
    public void mo77485j(MMActivity mMActivity, int i, BaseFinderFeed baseFinderFeed, List<? extends BaseFinderFeed> list, C89349b bVar, boolean z) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(list, "dataList");
        if (baseFinderFeed.mo3513o().getMediaType() == 4) {
            this.f159157c = baseFinderFeed;
        }
    }

    /* renamed from: m */
    public final boolean mo77488m(int i, int i2, MMActivity mMActivity, boolean z) {
        BaseFinderFeed baseFinderFeed = this.f159157c;
        long j = 0;
        if (i == 10002 && i2 == -1 && baseFinderFeed != null) {
            Intent intent = new Intent();
            intent.putExtra("SELECT_OBJECT", baseFinderFeed.mo3513o().getFeedObject().toByteArray());
            mMActivity.setResult(-1, intent);
            mMActivity.finish();
            if (!z) {
                C66800f fVar = C66800f.f191913a;
                BaseFinderFeed baseFinderFeed2 = this.f159157c;
                if (baseFinderFeed2 != null) {
                    j = baseFinderFeed2.getItemId();
                }
                fVar.mo90795c(j);
                return true;
            }
            C66800f fVar2 = C66800f.f191913a;
            BaseFinderFeed baseFinderFeed3 = this.f159157c;
            if (baseFinderFeed3 != null) {
                j = baseFinderFeed3.getItemId();
            }
            fVar2.mo90798f(j);
            return true;
        } else if (i != 10002) {
            return false;
        } else {
            if (!z) {
                C66800f fVar3 = C66800f.f191913a;
                if (baseFinderFeed != null) {
                    j = baseFinderFeed.getItemId();
                }
                fVar3.mo90797e(j);
                return false;
            }
            C66800f fVar4 = C66800f.f191913a;
            if (baseFinderFeed != null) {
                j = baseFinderFeed.getItemId();
            }
            fVar4.mo90799g(j);
            return false;
        }
    }
}
