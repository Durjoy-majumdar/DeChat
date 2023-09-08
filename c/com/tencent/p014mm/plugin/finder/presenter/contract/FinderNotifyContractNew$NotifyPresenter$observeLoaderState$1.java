package com.tencent.p014mm.plugin.finder.presenter.contract;

import am1.C54137b;
import cm1.C55011a;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew;
import com.tencent.p014mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import eb0.C31543z5;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import o40.C61926c;
import on1.C11520f0;
import on1.C11548q;
import on1.C11575y;
import pe1.C35464c;
import rx3.C13598b0;
import up1.C37521f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Lon1/f0;", "Lcm1/a;", "state", "Lrx3/b0;", "invoke", "(Lon1/f0;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$observeLoaderState$1 */
final class FinderNotifyContractNew$NotifyPresenter$observeLoaderState$1 extends C87413o implements C32226l<C11520f0<C55011a>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderNotifyContractNew.NotifyPresenter f160558d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderNotifyContractNew$NotifyPresenter$observeLoaderState$1(FinderNotifyContractNew.NotifyPresenter notifyPresenter) {
        super(1);
        this.f160558d = notifyPresenter;
    }

    public Object invoke(Object obj) {
        C11520f0 f0Var = (C11520f0) obj;
        C87412m.m108594g(f0Var, "state");
        if (f0Var instanceof C11520f0.C11521a) {
            String str = FinderNotifyContractNew.NotifyPresenter.f160524w;
            StringBuilder sb = new StringBuilder();
            sb.append("observeLoaderState FirstScreenState isNotEmpty:");
            C11548q<C55011a> qVar = this.f160558d.f160536r;
            if (qVar != null) {
                sb.append(!((ArrayList) qVar.f33886d).isEmpty());
                Log.m105924i(str, sb.toString());
                C11548q<C55011a> qVar2 = this.f160558d.f160536r;
                if (qVar2 != null) {
                    if (!((ArrayList) qVar2.f33886d).isEmpty()) {
                        FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = this.f160558d.f160538t;
                        if (notifyViewCallback != null) {
                            C61926c.m72668M(new C56197x3ce15cd4(notifyViewCallback));
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    }
                    FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f160558d;
                    if (notifyPresenter.f160529h != 2) {
                        C54137b bVar = notifyPresenter.f160537s;
                        if (bVar != null) {
                            bVar.mo74961a(((C11520f0.C11521a) f0Var).f33839a.f33959a);
                        } else {
                            C87412m.m108603p("diffLoader");
                            throw null;
                        }
                    }
                } else {
                    C87412m.m108603p("loader");
                    throw null;
                }
            } else {
                C87412m.m108603p("loader");
                throw null;
            }
        } else {
            long j = 0;
            if (f0Var instanceof C11520f0.C11523c) {
                C11520f0.C11523c cVar = (C11520f0.C11523c) f0Var;
                C11575y<T> yVar = cVar.f33841a;
                C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData");
                FinderMessageLoaderData finderMessageLoaderData = (FinderMessageLoaderData) yVar;
                long a = C31543z5.m39451a();
                FinderNotifyContractNew.NotifyPresenter notifyPresenter2 = this.f160558d;
                long j2 = a - notifyPresenter2.f160534p;
                C11548q<C55011a> qVar3 = notifyPresenter2.f160536r;
                if (qVar3 != null) {
                    boolean isEmpty = ((ArrayList) qVar3.f33886d).isEmpty();
                    this.f160558d.f160534p = 0;
                    String str2 = FinderNotifyContractNew.NotifyPresenter.f160524w;
                    Log.m105924i(str2, "observeLoaderState errorType:" + finderMessageLoaderData.f33808f + " errorCode:" + finderMessageLoaderData.f33809g);
                    if (finderMessageLoaderData.f33808f == 0 && finderMessageLoaderData.f33809g == 0) {
                        this.f160558d.f160532n = ((FinderMessageLoaderData) cVar.f33841a).f160598k;
                        Log.m105924i(str2, "tabIndex:" + this.f160558d.f160529h + " RefreshedState refreshTime:" + j2 + " isEmpty:" + isEmpty + " size:" + cVar.f33841a.f33959a.size());
                        FinderNotifyContractNew.NotifyViewCallback notifyViewCallback2 = this.f160558d.f160538t;
                        if (notifyViewCallback2 != null) {
                            C61926c.m72666K(0, new FinderNotifyContractNew$NotifyViewCallback$finishRefresh$1(isEmpty, notifyViewCallback2));
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    } else if (isEmpty) {
                        FinderNotifyContractNew.NotifyViewCallback notifyViewCallback3 = this.f160558d.f160538t;
                        if (notifyViewCallback3 != null) {
                            notifyViewCallback3.f160546h = new C56203xb529c6df(notifyViewCallback3);
                            C37521f.f99374d.getClass();
                            C35464c<Long> cVar2 = C37521f.f99343Z1;
                            if (j2 >= cVar2.mo60266n().longValue()) {
                                Runnable runnable = notifyViewCallback3.f160546h;
                                if (runnable != null) {
                                    ((C56203xb529c6df) runnable).run();
                                }
                            } else {
                                Runnable runnable2 = notifyViewCallback3.f160546h;
                                if (runnable2 != null) {
                                    Pattern pattern = C61926c.f176038a;
                                    MMHandlerThread.postToMainThreadDelayed(runnable2, cVar2.mo60266n().longValue() - j2);
                                }
                            }
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    }
                } else {
                    C87412m.m108603p("loader");
                    throw null;
                }
            } else if (f0Var instanceof C11520f0.C11522b) {
                long a2 = C31543z5.m39451a();
                FinderNotifyContractNew.NotifyPresenter notifyPresenter3 = this.f160558d;
                long j3 = a2 - notifyPresenter3.f160535q;
                notifyPresenter3.f160535q = 0;
                String str3 = FinderNotifyContractNew.NotifyPresenter.f160524w;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("tabIndex:");
                sb4.append(this.f160558d.f160529h);
                sb4.append("  LoadedMoreState loadMoreTime:");
                sb4.append(j3);
                sb4.append(" size:");
                C11520f0.C11522b bVar2 = (C11520f0.C11522b) f0Var;
                sb4.append(bVar2.f33840a.f33959a.size());
                Log.m105924i(str3, sb4.toString());
                FinderNotifyContractNew.NotifyViewCallback notifyViewCallback4 = this.f160558d.f160538t;
                if (notifyViewCallback4 != null) {
                    List<T> list = bVar2.f33840a.f33959a;
                    C87412m.m108594g(list, "msgList");
                    ArrayList<C55011a> e = notifyViewCallback4.f160543e.mo78501e();
                    String str4 = FinderNotifyContractNew.NotifyViewCallback.f160541s;
                    Log.m105924i(str4, "finishLoadMore .getData(" + notifyViewCallback4.f160544f + ": " + e.hashCode() + " --- " + e + ')');
                    C37521f.f99374d.getClass();
                    C35464c<Long> cVar3 = C37521f.f99343Z1;
                    if (j3 < cVar3.mo60266n().longValue()) {
                        j = cVar3.mo60266n().longValue() - j3;
                    }
                    C61926c.m72666K(j, new FinderNotifyContractNew$NotifyViewCallback$finishLoadMore$1(notifyViewCallback4, list));
                    FinderNotifyContractNew.NotifyPresenter notifyPresenter4 = this.f160558d;
                    if (notifyPresenter4.f160529h != 2) {
                        C54137b bVar3 = notifyPresenter4.f160537s;
                        if (bVar3 != null) {
                            bVar3.mo74961a(bVar2.f33840a.f33959a);
                        } else {
                            C87412m.m108603p("diffLoader");
                            throw null;
                        }
                    }
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            }
        }
        return C13598b0.f38549a;
    }
}
