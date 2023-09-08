package f21;

import android.app.Activity;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import java.lang.ref.WeakReference;
import nj3.C76879j;
import ob0.C117747y;

/* renamed from: f21.a */
public abstract class C45737a extends C117747y implements C1311n {

    /* renamed from: d */
    public int f123586d = 0;

    /* renamed from: e */
    public int f123587e = 0;

    /* renamed from: f */
    public String f123588f;

    /* renamed from: g */
    public WeakReference<Activity> f123589g;

    /* renamed from: h */
    public boolean f123590h = false;

    /* renamed from: i */
    public boolean f123591i = false;

    /* renamed from: f21.a$a */
    public class C45738a implements DialogInterface.OnClickListener {
        public C45738a(C45737a aVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: f21.a$b */
    public interface C45739b {
        /* renamed from: a */
        void mo63897a(int i, int i2, String str, C117747y yVar);
    }

    /* renamed from: j1 */
    public boolean mo71231j1() {
        return !(this instanceof C45740b);
    }

    /* renamed from: k1 */
    public abstract void mo71232k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr);

    /* renamed from: l1 */
    public C45737a mo71233l1(C45739b bVar) {
        if (this.f123591i) {
            bVar.mo63897a(this.f123586d, this.f123587e, this.f123588f, this);
        }
        return this;
    }

    /* renamed from: m1 */
    public C45737a mo71234m1(C45739b bVar) {
        if (!this.f123590h && !this.f123591i) {
            bVar.mo63897a(this.f123586d, this.f123587e, this.f123588f, this);
        }
        return this;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        WeakReference<Activity> weakReference;
        Activity activity;
        if (!(i2 == 0 && i3 == 0)) {
            this.f123590h = true;
            if (!(!mo71231j1() || (weakReference = this.f123589g) == null || (activity = weakReference.get()) == null)) {
                C76879j.m92713G(activity, activity.getString(C0966R.string.l_3), (String) null, false, new C45738a(this));
            }
        }
        this.f123586d = i3;
        this.f123587e = i2;
        this.f123588f = str;
        mo71232k1(i, i2, i3, str, uVar, bArr);
    }
}
