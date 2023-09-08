package ub2;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvLyricView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.xweb.WCWebUpdater;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: ub2.p0 */
public final class C65304p0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MusicMvLyricView f187962d;

    /* renamed from: e */
    public final /* synthetic */ long f187963e;

    /* renamed from: f */
    public final /* synthetic */ boolean f187964f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65304p0(MusicMvLyricView musicMvLyricView, long j, boolean z) {
        super(0);
        this.f187962d = musicMvLyricView;
        this.f187963e = j;
        this.f187964f = z;
    }

    public Object invoke() {
        int i;
        boolean z;
        C54256s sVar;
        C54256s sVar2;
        if (!((ArrayList) this.f187962d.f163605t).isEmpty()) {
            this.f187962d.getClass();
            MusicMvLyricView musicMvLyricView = this.f187962d;
            long j = this.f187963e;
            int size = ((ArrayList) musicMvLyricView.f163605t).size();
            int i2 = 0;
            while (true) {
                if (i2 > size) {
                    i = 0;
                    break;
                }
                i = (i2 + size) / 2;
                if (j >= ((MusicMvLyricView.C57105e) ((ArrayList) musicMvLyricView.f163605t).get(i)).f163615d) {
                    i2 = i + 1;
                    if (i2 >= ((ArrayList) musicMvLyricView.f163605t).size() || j < ((MusicMvLyricView.C57105e) ((ArrayList) musicMvLyricView.f163605t).get(i2)).f163615d) {
                        break;
                    }
                } else {
                    size = i - 1;
                }
            }
            if (i >= 0) {
                if (this.f187963e < 1000 || i < 5) {
                    this.f187962d.f163608w = false;
                    z = true;
                } else {
                    z = false;
                }
                MusicMvLyricView musicMvLyricView2 = this.f187962d;
                int i3 = musicMvLyricView2.f163607v;
                View view = null;
                if (i != i3) {
                    musicMvLyricView2.mo80565c(i3, i);
                    MusicMvLyricView musicMvLyricView3 = this.f187962d;
                    if (musicMvLyricView3.f163583A) {
                        musicMvLyricView3.mo80575h(i);
                        this.f187962d.f163583A = false;
                    } else if (this.f187964f) {
                        LinearLayoutManager linearLayoutManager = musicMvLyricView3.f163595g;
                        boolean z2 = (linearLayoutManager != null ? linearLayoutManager.findViewByPosition(musicMvLyricView3.f163607v) : null) != null;
                        MusicMvLyricView musicMvLyricView4 = this.f187962d;
                        boolean z3 = musicMvLyricView4.f163608w;
                        if (!z3 || z2) {
                            C54256s sVar3 = musicMvLyricView4.f163588F;
                            if (sVar3 instanceof MusicMvLyricView.C57101b) {
                                if (sVar3 != null && sVar3.f44876e) {
                                    if (sVar3 != null) {
                                        sVar3.f44872a = i;
                                    }
                                    Log.m105924i("MicroMsg.MusicMvCommentView", "1");
                                }
                            }
                            WxRecyclerView lyricRv = musicMvLyricView4.getLyricRv();
                            if (lyricRv != null) {
                                lyricRv.mo17155w1();
                            }
                            if (z) {
                                MusicMvLyricView musicMvLyricView5 = this.f187962d;
                                Context context = musicMvLyricView5.getContext();
                                C87412m.m108593f(context, "context");
                                sVar = new MusicMvLyricView.C57101b(musicMvLyricView5, context);
                            } else {
                                MusicMvLyricView musicMvLyricView6 = this.f187962d;
                                Context context2 = musicMvLyricView6.getContext();
                                C87412m.m108593f(context2, "context");
                                sVar = new MusicMvLyricView.C57103d(musicMvLyricView6, context2);
                            }
                            sVar.f44872a = i;
                            MusicMvLyricView musicMvLyricView7 = this.f187962d;
                            musicMvLyricView7.f163588F = sVar;
                            LinearLayoutManager linearLayoutManager2 = musicMvLyricView7.f163595g;
                            if (linearLayoutManager2 != null) {
                                linearLayoutManager2.startSmoothScroll(sVar);
                            }
                            Log.m105925i("MicroMsg.MusicMvCommentView", "2 fastScroll:%b", Boolean.valueOf(z));
                        } else if (!z3 && !z2 && !musicMvLyricView4.f163610y) {
                            WxRecyclerView lyricRv2 = musicMvLyricView4.getLyricRv();
                            if (lyricRv2 != null) {
                                lyricRv2.mo17155w1();
                            }
                            if (z) {
                                MusicMvLyricView musicMvLyricView8 = this.f187962d;
                                Context context3 = musicMvLyricView8.getContext();
                                C87412m.m108593f(context3, "context");
                                sVar2 = new MusicMvLyricView.C57101b(musicMvLyricView8, context3);
                            } else {
                                MusicMvLyricView musicMvLyricView9 = this.f187962d;
                                Context context4 = musicMvLyricView9.getContext();
                                C87412m.m108593f(context4, "context");
                                sVar2 = new MusicMvLyricView.C57103d(musicMvLyricView9, context4);
                            }
                            sVar2.f44872a = i;
                            MusicMvLyricView musicMvLyricView10 = this.f187962d;
                            musicMvLyricView10.f163588F = sVar2;
                            LinearLayoutManager linearLayoutManager3 = musicMvLyricView10.f163595g;
                            if (linearLayoutManager3 != null) {
                                linearLayoutManager3.startSmoothScroll(sVar2);
                            }
                            Log.m105925i("MicroMsg.MusicMvCommentView", "3 fastScroll:%b", Boolean.valueOf(z));
                        }
                    }
                }
                if (!this.f187964f) {
                    LinearLayoutManager linearLayoutManager4 = this.f187962d.f163595g;
                    if (linearLayoutManager4 != null) {
                        view = linearLayoutManager4.findViewByPosition(i);
                    }
                    if (view != null) {
                        MusicMvLyricView musicMvLyricView11 = this.f187962d;
                        Context context5 = musicMvLyricView11.getContext();
                        C87412m.m108593f(context5, "context");
                        MusicMvLyricView.C57102c cVar = new MusicMvLyricView.C57102c(musicMvLyricView11, context5);
                        cVar.f44872a = i;
                        LinearLayoutManager linearLayoutManager5 = this.f187962d.f163595g;
                        if (linearLayoutManager5 != null) {
                            linearLayoutManager5.startSmoothScroll(cVar);
                        }
                        Log.m105924i("MicroMsg.MusicMvCommentView", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
                    } else {
                        int[] iArr = new int[2];
                        WxRecyclerView lyricRv3 = this.f187962d.getLyricRv();
                        if (lyricRv3 != null) {
                            lyricRv3.getLocationInWindow(iArr);
                        }
                        int height = ((int) (((float) this.f187962d.getHeight()) * MusicMvLyricView.f163582M)) - iArr[1];
                        LinearLayoutManager linearLayoutManager6 = this.f187962d.f163595g;
                        if (linearLayoutManager6 != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(Integer.valueOf(height));
                            aVar.mo10233c(Integer.valueOf(i));
                            LinearLayoutManager linearLayoutManager7 = linearLayoutManager6;
                            C117292a.m165358d(linearLayoutManager7, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$setCurrentTime$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                            linearLayoutManager6.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                            C117292a.m165359e(linearLayoutManager7, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$setCurrentTime$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        }
                        Log.m105924i("MicroMsg.MusicMvCommentView", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY);
                    }
                }
                this.f187962d.f163607v = i;
            }
        }
        return C13598b0.f38549a;
    }
}
