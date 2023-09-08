package aq3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gq3.C98177a;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: aq3.g */
public final class C92068g extends UIComponent {

    /* renamed from: d */
    public C98177a f263592d;

    /* renamed from: e */
    public MMViewPager f263593e;

    /* renamed from: f */
    public ArrayList<QueryImageData> f263594f = new ArrayList<>();

    /* renamed from: g */
    public int f263595g = -1;

    /* renamed from: h */
    public String f263596h = "";

    /* renamed from: i */
    public long f263597i = -1;

    /* renamed from: j */
    public boolean f263598j = true;

    /* renamed from: n */
    public int f263599n = -1;

    /* renamed from: o */
    public boolean f263600o = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92068g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final WxImageView mo126057c3() {
        C98177a aVar;
        MMViewPager mMViewPager = this.f263593e;
        if (mMViewPager == null || (aVar = this.f263592d) == null) {
            return null;
        }
        return aVar.mo129061f(mMViewPager.getCurrentItem(), true);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f263595g = getIntent().getIntExtra("KEY_IMAGE_CURRENT_INDEX", -1);
        ArrayList<QueryImageData> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("KEY_IMAGE_DATA");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = new ArrayList<>();
        }
        this.f263594f = parcelableArrayListExtra;
        String stringExtra = getIntent().getStringExtra("KEY_IMAGE_KEY_WORDS");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f263596h = stringExtra;
        this.f263597i = this.f263594f.get(this.f263595g).f154723d;
        this.f263599n = this.f263595g;
        Log.m105924i("MicroMsg.ImageGalleryPageUIC", "currentIndex: " + this.f263595g + ", imageDataSize: " + this.f263594f.size() + ", matchKeywords: " + this.f263596h);
        int i = C75044y4.m89990b(MMApplicationContext.getContext()).x;
        int i2 = C75044y4.m89990b(MMApplicationContext.getContext()).y;
        Log.m105924i("MicroMsg.ImageGalleryPageUIC", ' ' + i + ", " + i2);
        this.f263592d = new C98177a(getActivity(), this.f263594f);
        MMViewPager mMViewPager = (MMViewPager) findViewById(C0966R.C0970id.mdo);
        this.f263593e = mMViewPager;
        if (mMViewPager != null) {
            mMViewPager.setVerticalFadingEdgeEnabled(false);
        }
        MMViewPager mMViewPager2 = this.f263593e;
        if (mMViewPager2 != null) {
            mMViewPager2.setHorizontalFadingEdgeEnabled(false);
        }
        MMViewPager mMViewPager3 = this.f263593e;
        if (mMViewPager3 != null) {
            mMViewPager3.setOnPageChangeListener(new C92064c(this));
        }
        MMViewPager mMViewPager4 = this.f263593e;
        if (mMViewPager4 != null) {
            mMViewPager4.setOffscreenPageLimit(1);
        }
        MMViewPager mMViewPager5 = this.f263593e;
        if (mMViewPager5 != null) {
            mMViewPager5.setAdapter(this.f263592d);
        }
        MMViewPager mMViewPager6 = this.f263593e;
        if (mMViewPager6 != null) {
            mMViewPager6.setCurrentItem(this.f263595g);
        }
        MMViewPager mMViewPager7 = this.f263593e;
        if (mMViewPager7 != null) {
            mMViewPager7.setDoubleClickListener(C92065d.f263589a);
        }
        MMViewPager mMViewPager8 = this.f263593e;
        if (mMViewPager8 != null) {
            mMViewPager8.setLongClickOverListener(new C92066e(this));
        }
        MMViewPager mMViewPager9 = this.f263593e;
        if (mMViewPager9 != null) {
            mMViewPager9.setSingleClickOverListener(new C92067f(this));
        }
    }
}
