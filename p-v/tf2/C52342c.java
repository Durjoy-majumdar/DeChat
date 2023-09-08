package tf2;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import java.io.IOException;
import java.lang.ref.WeakReference;
import kg3.C76577a;
import o90.C100301b;
import p196ln.C10579k;
import p196ln.C76706g;
import p196ln.C76708i;
import p823sg.C101611g;
import vd3.C78407r;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: tf2.c */
public class C52342c extends C86301e {

    /* renamed from: d */
    public final C78407r.C78409b f146313d = new C52343a(this);

    /* renamed from: tf2.c$a */
    public class C52343a implements C78407r.C78409b {

        /* renamed from: d */
        public Bitmap f146314d = null;

        /* renamed from: e */
        public C101611g<String, WeakReference<Bitmap>> f146315e;

        public C52343a(C52342c cVar) {
            try {
                this.f146314d = BackwardSupportUtil.BitmapFactory.decodeStream(MMApplicationContext.getContext().getAssets().open("avatar/default_nor_avatar.png"), C76577a.m92156g((Context) null));
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.Facing.SubCorePwdGroup", e, "", new Object[0]);
            }
            this.f146315e = new C100301b(15, C52343a.class);
        }

        /* renamed from: E0 */
        public void mo10724E0(C78407r rVar) {
            if (rVar instanceof C10579k.C10580a) {
                ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93557b((C10579k.C10580a) rVar);
            }
        }

        /* renamed from: O */
        public Bitmap mo10725O(String str) {
            return null;
        }

        public Bitmap loadBitmap(String str) {
            WeakReference weakReference = (WeakReference) ((C100301b) this.f146315e).get(str);
            if (weakReference != null && weakReference.get() != null && !((Bitmap) weakReference.get()).isRecycled() && weakReference.get() == this.f146314d) {
                return (Bitmap) weakReference.get();
            }
            Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(str);
            if (N50 == null || N50.isRecycled()) {
                return this.f146314d;
            }
            ((C100301b) this.f146315e).mo139557c(str, new WeakReference(N50));
            return N50;
        }

        public Bitmap ov0(String str, int i, int i2, int i3) {
            return null;
        }

        /* renamed from: qq */
        public Bitmap mo10728qq() {
            return this.f146314d;
        }
    }
}
