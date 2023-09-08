package gx1;

import android.graphics.Bitmap;
import ax1.C39639c;
import ax1.C39641d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import r60.C101350i;
import t60.C64207e;
import vd3.C78407r;
import x60.C102564a;

/* renamed from: gx1.e */
public class C98275e implements C64207e<C45982a, Bitmap> {

    /* renamed from: a */
    public final /* synthetic */ C98272d f288106a;

    public C98275e(C98272d dVar) {
        this.f288106a = dVar;
    }

    /* renamed from: a */
    public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f288106a.f288100d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                C78407r rVar = (C78407r) ((WeakReference) it.next()).get();
                if (rVar != null) {
                    C39641d X3 = ((C39639c) C86312j.m106911c(C39639c.class)).mo62193X3((String) this.f288106a.mo137572b(rVar.f229749j).first);
                    if (X3 != null && Util.nullAsNil(X3.getAvatarUrl()).equals(((C45982a) aVar.f301995a).f123998d)) {
                        rVar.mo1428X(rVar.f229749j);
                    }
                } else {
                    it.remove();
                }
            } catch (Exception e) {
                Log.printErrStackTrace("GameChatRoom.ChatRoomAvatarInterceptor", e, "", new Object[0]);
            }
        }
    }
}
