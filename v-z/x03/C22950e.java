package x03;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p1042u.C111060j;
import te3.xh4;

/* renamed from: x03.e */
public abstract class C22950e extends RecyclerView.C16613e<C22953h> {

    /* renamed from: d */
    public C111060j<View> f65915d = new C111060j<>();

    /* renamed from: e */
    public C111060j<View> f65916e = new C111060j<>();

    /* renamed from: f */
    public Map<String, WeakReference<C22953h>> f65917f = new HashMap();

    /* renamed from: g */
    public C22947b f65918g;

    public C22950e(C22947b bVar) {
        this.f65918g = bVar;
    }

    /* renamed from: F4 */
    public void mo36131F4(List<xh4> list, boolean z) {
        Log.m105925i("MicroMsg.TopStory.TopStoryBaseVideoAdapter", "callbackToSuccess %d %b", Integer.valueOf(list.size()), Boolean.valueOf(z));
    }

    /* renamed from: G4 */
    public int mo36132G4() {
        return this.f65916e.mo162808h();
    }

    /* renamed from: O4 */
    public int mo36133O4() {
        return this.f65915d.mo162808h();
    }

    /* renamed from: g5 */
    public abstract int mo36134g5(int i);

    public int getItemCount() {
        return this.f65918g.mo24946C6().mo36194e() + mo36133O4() + mo36132G4();
    }

    public int getItemViewType(int i) {
        return i < mo36133O4() ? this.f65915d.mo162806f(i) : mo36136w5(i) ? this.f65916e.mo162806f((i - mo36133O4()) - this.f65918g.mo24946C6().mo36194e()) : mo36134g5(i);
    }

    /* renamed from: u5 */
    public C22953h mo36135u5(xh4 xh4) {
        xh4 xh42;
        if (xh4 == null) {
            return null;
        }
        if (!((HashMap) this.f65917f).containsKey(xh4.f64729h)) {
            return null;
        }
        if (((HashMap) this.f65917f).get(xh4.f64729h) == null) {
            return null;
        }
        C22953h hVar = (C22953h) ((WeakReference) ((HashMap) this.f65917f).get(xh4.f64729h)).get();
        if (hVar != null && (xh42 = hVar.f65949A) != null && xh42 == xh4) {
            return hVar;
        }
        ((HashMap) this.f65917f).remove(xh4.f64729h);
        Log.m105924i("MicroMsg.TopStory.TopStoryBaseVideoAdapter", "getViewHolderByVideoInfo not match");
        return null;
    }

    /* renamed from: w5 */
    public boolean mo36136w5(int i) {
        return i >= mo36133O4() + this.f65918g.mo24946C6().mo36194e();
    }
}
