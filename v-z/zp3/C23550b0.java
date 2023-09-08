package zp3;

import android.os.Message;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.view.MediaBanner;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import oj3.C62036a;

/* renamed from: zp3.b0 */
public final class C23550b0 implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ MediaBanner<RecyclerView.C16631z> f67528d;

    /* renamed from: zp3.b0$a */
    public static final class C23551a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RecyclerView.C16613e<RecyclerView.C16631z> f67529d;

        /* renamed from: e */
        public final /* synthetic */ MediaBanner<RecyclerView.C16631z> f67530e;

        public C23551a(RecyclerView.C16613e<RecyclerView.C16631z> eVar, MediaBanner<RecyclerView.C16631z> mediaBanner) {
            this.f67529d = eVar;
            this.f67530e = mediaBanner;
        }

        public final void run() {
            RecyclerView.C16613e<RecyclerView.C16631z> eVar = this.f67529d;
            ((C62036a) eVar).mo86984u5(((C62036a) eVar).getItemCount() - 1);
            this.f67529d.registerAdapterDataObserver(this.f67530e.getDataObserver());
            MediaBanner<RecyclerView.C16631z> mediaBanner = this.f67530e;
            RecyclerHorizontalViewPager recyclerHorizontalViewPager = mediaBanner.f56648p;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(recyclerHorizontalViewPager, aVar.mo10232b(), "com/tencent/mm/view/MediaBanner", "selectViewAt", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerHorizontalViewPager.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerHorizontalViewPager, "com/tencent/mm/view/MediaBanner", "selectViewAt", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
            mediaBanner.f56648p.mo4595x1(0, true, true);
            this.f67530e.mo26539b();
        }
    }

    public C23550b0(MediaBanner<RecyclerView.C16631z> mediaBanner) {
        this.f67528d = mediaBanner;
    }

    public final boolean handleMessage(Message message) {
        C87412m.m108594g(message, LocaleUtil.ITALIAN);
        if (message.what == 1) {
            RecyclerView.C16613e<RecyclerView.C16631z> adapter = this.f67528d.getAdapter();
            if ((adapter != null ? adapter.getItemCount() : 0) > 1) {
                int focusPosition = this.f67528d.getFocusPosition() + 1;
                Log.m105924i("MicroMsg.MediaBanner", "[handleMsg] targetPosition:" + focusPosition);
                RecyclerView.C16613e<RecyclerView.C16631z> adapter2 = this.f67528d.getAdapter();
                if (focusPosition < (adapter2 != null ? adapter2.getItemCount() : 0)) {
                    this.f67528d.mo26538a(focusPosition, true);
                    this.f67528d.mo26539b();
                } else {
                    RecyclerView.C16613e<RecyclerView.C16631z> adapter3 = this.f67528d.getAdapter();
                    if (focusPosition == (adapter3 != null ? adapter3.getItemCount() : 0)) {
                        RecyclerView.C16613e<RecyclerView.C16631z> adapter4 = this.f67528d.getAdapter();
                        if (adapter4 instanceof C62036a) {
                            try {
                                adapter4.unregisterAdapterDataObserver(this.f67528d.getDataObserver());
                            } catch (Exception unused) {
                            }
                            C62036a aVar = (C62036a) adapter4;
                            int itemCount = aVar.getItemCount();
                            aVar.f176359d.add(itemCount, aVar.f176359d.get(0));
                            aVar.notifyItemInserted(itemCount);
                            this.f67528d.getPagerView().setItemAnimator((RecyclerView.C16616j) null);
                            this.f67528d.mo26538a(focusPosition, false);
                            MediaBanner<RecyclerView.C16631z> mediaBanner = this.f67528d;
                            mediaBanner.postDelayed(new C23551a(adapter4, mediaBanner), 500);
                        }
                    }
                }
            }
        }
        return true;
    }
}
