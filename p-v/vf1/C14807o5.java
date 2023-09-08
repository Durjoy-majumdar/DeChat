package vf1;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter;
import com.tencent.p014mm.plugin.finder.feed.model.FinderTopicFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicFeedUI;
import er1.C7878t0;
import er1.C7888v2;
import gy3.C87412m;
import kf1.C9965rb;
import nj3.C11184p0;
import nj3.C76912y0;
import te3.C64258bf0;
import te3.C64311db1;

/* renamed from: vf1.o5 */
public final class C14807o5 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ FinderTopicFeedUI f40795d;

    public C14807o5(FinderTopicFeedUI finderTopicFeedUI) {
        this.f40795d = finderTopicFeedUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        FinderTopicFeedUI finderTopicFeedUI = this.f40795d;
        FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter = finderTopicFeedUI.f14886p;
        if (finderTopicFeedUIContract$TopicFeedPresenter != null) {
            long j = finderTopicFeedUIContract$TopicFeedPresenter.f13401q;
            if (j <= 0) {
                j = finderTopicFeedUI.f14896z;
            } else if (finderTopicFeedUIContract$TopicFeedPresenter == null) {
                C87412m.m108603p("presenter");
                throw null;
            }
            long j2 = j;
            int itemId = menuItem.getItemId();
            if (itemId != 10002) {
                if (itemId == 10003) {
                    if (FinderTopicFeedUI.m2987O7(this.f40795d)) {
                        C76912y0.makeText((Context) this.f40795d, (int) C0966R.string.eo7, 0).show();
                        return;
                    }
                    FinderTopicFeedUI finderTopicFeedUI2 = this.f40795d;
                    FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter2 = finderTopicFeedUI2.f14886p;
                    if (finderTopicFeedUIContract$TopicFeedPresenter2 != null) {
                        int i2 = finderTopicFeedUIContract$TopicFeedPresenter2.f13396i;
                        if (i2 == 4) {
                            C7888v2.C7889a aVar = C7888v2.f26513a;
                            String N7 = FinderTopicFeedUI.m2986N7(finderTopicFeedUI2);
                            FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter3 = this.f40795d.f14886p;
                            if (finderTopicFeedUIContract$TopicFeedPresenter3 != null) {
                                int i3 = finderTopicFeedUIContract$TopicFeedPresenter3.f13396i;
                                if (finderTopicFeedUIContract$TopicFeedPresenter3 != null) {
                                    String N = finderTopicFeedUIContract$TopicFeedPresenter3.mo2637N();
                                    FinderTopicFeedUI finderTopicFeedUI3 = this.f40795d;
                                    Object[] objArr = new Object[1];
                                    FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter4 = finderTopicFeedUI3.f14886p;
                                    if (finderTopicFeedUIContract$TopicFeedPresenter4 != null) {
                                        objArr[0] = C7878t0.m8035d(finderTopicFeedUIContract$TopicFeedPresenter4.f13401q);
                                        String string = finderTopicFeedUI3.getString(C0966R.string.esm, objArr);
                                        FinderTopicFeedUI finderTopicFeedUI4 = this.f40795d;
                                        FinderTopicFeedLoader finderTopicFeedLoader = finderTopicFeedUI4.f14888r;
                                        if (finderTopicFeedLoader != null) {
                                            C64311db1 db12 = finderTopicFeedLoader.f13899i;
                                            C9965rb rbVar = finderTopicFeedUI4.f14887q;
                                            if (rbVar != null) {
                                                C7888v2.C7889a.m8053D(aVar, finderTopicFeedUI2, N7, i3, j2, N, string, db12, 49, rbVar.f30630F, (C64258bf0) null, 512, (Object) null);
                                            } else {
                                                C87412m.m108603p("viewCallback");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("feedLoader");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("presenter");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("presenter");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("presenter");
                                throw null;
                            }
                        } else {
                            C7888v2.C7889a aVar2 = C7888v2.f26513a;
                            if (finderTopicFeedUIContract$TopicFeedPresenter2 != null) {
                                String str = finderTopicFeedUIContract$TopicFeedPresenter2.f13398n;
                                if (finderTopicFeedUIContract$TopicFeedPresenter2 == null) {
                                    C87412m.m108603p("presenter");
                                    throw null;
                                } else if (finderTopicFeedUIContract$TopicFeedPresenter2 != null) {
                                    String N2 = finderTopicFeedUIContract$TopicFeedPresenter2.mo2637N();
                                    FinderTopicFeedUI finderTopicFeedUI5 = this.f40795d;
                                    Object[] objArr2 = new Object[1];
                                    FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter5 = finderTopicFeedUI5.f14886p;
                                    if (finderTopicFeedUIContract$TopicFeedPresenter5 != null) {
                                        objArr2[0] = C7878t0.m8035d(finderTopicFeedUIContract$TopicFeedPresenter5.f13401q);
                                        String string2 = finderTopicFeedUI5.getString(C0966R.string.esm, objArr2);
                                        FinderTopicFeedLoader finderTopicFeedLoader2 = this.f40795d.f14888r;
                                        if (finderTopicFeedLoader2 != null) {
                                            C7888v2.C7889a.m8053D(aVar2, finderTopicFeedUI2, str, i2, j2, N2, string2, finderTopicFeedLoader2.f13899i, 9, "", (C64258bf0) null, 512, (Object) null);
                                            return;
                                        }
                                        C87412m.m108603p("feedLoader");
                                        throw null;
                                    }
                                    C87412m.m108603p("presenter");
                                    throw null;
                                } else {
                                    C87412m.m108603p("presenter");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("presenter");
                                throw null;
                            }
                        }
                    } else {
                        C87412m.m108603p("presenter");
                        throw null;
                    }
                }
            } else if (FinderTopicFeedUI.m2987O7(this.f40795d)) {
                C76912y0.makeText((Context) this.f40795d, (int) C0966R.string.eo6, 0).show();
            } else {
                FinderTopicFeedUI finderTopicFeedUI6 = this.f40795d;
                FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter6 = finderTopicFeedUI6.f14886p;
                if (finderTopicFeedUIContract$TopicFeedPresenter6 != null) {
                    int i4 = finderTopicFeedUIContract$TopicFeedPresenter6.f13396i;
                    if (i4 == 4) {
                        C7888v2.C7889a aVar3 = C7888v2.f26513a;
                        String N72 = FinderTopicFeedUI.m2986N7(finderTopicFeedUI6);
                        FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter7 = this.f40795d.f14886p;
                        if (finderTopicFeedUIContract$TopicFeedPresenter7 != null) {
                            int i5 = finderTopicFeedUIContract$TopicFeedPresenter7.f13396i;
                            if (finderTopicFeedUIContract$TopicFeedPresenter7 != null) {
                                String N3 = finderTopicFeedUIContract$TopicFeedPresenter7.mo2637N();
                                FinderTopicFeedUI finderTopicFeedUI7 = this.f40795d;
                                Object[] objArr3 = new Object[1];
                                FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter8 = finderTopicFeedUI7.f14886p;
                                if (finderTopicFeedUIContract$TopicFeedPresenter8 != null) {
                                    objArr3[0] = C7878t0.m8035d(finderTopicFeedUIContract$TopicFeedPresenter8.f13401q);
                                    String string3 = finderTopicFeedUI7.getString(C0966R.string.esm, objArr3);
                                    FinderTopicFeedUI finderTopicFeedUI8 = this.f40795d;
                                    FinderTopicFeedLoader finderTopicFeedLoader3 = finderTopicFeedUI8.f14888r;
                                    if (finderTopicFeedLoader3 != null) {
                                        C64311db1 db13 = finderTopicFeedLoader3.f13899i;
                                        C9965rb rbVar2 = finderTopicFeedUI8.f14887q;
                                        if (rbVar2 != null) {
                                            C7888v2.C7889a.m8052B(aVar3, finderTopicFeedUI6, N72, i5, j2, N3, string3, db13, 49, rbVar2.f30630F, (C64258bf0) null, 512, (Object) null);
                                        } else {
                                            C87412m.m108603p("viewCallback");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("feedLoader");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("presenter");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("presenter");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("presenter");
                            throw null;
                        }
                    } else {
                        C7888v2.C7889a aVar4 = C7888v2.f26513a;
                        if (finderTopicFeedUIContract$TopicFeedPresenter6 != null) {
                            String str2 = finderTopicFeedUIContract$TopicFeedPresenter6.f13398n;
                            if (finderTopicFeedUIContract$TopicFeedPresenter6 == null) {
                                C87412m.m108603p("presenter");
                                throw null;
                            } else if (finderTopicFeedUIContract$TopicFeedPresenter6 != null) {
                                String N4 = finderTopicFeedUIContract$TopicFeedPresenter6.mo2637N();
                                FinderTopicFeedUI finderTopicFeedUI9 = this.f40795d;
                                Object[] objArr4 = new Object[1];
                                FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter9 = finderTopicFeedUI9.f14886p;
                                if (finderTopicFeedUIContract$TopicFeedPresenter9 != null) {
                                    objArr4[0] = C7878t0.m8035d(finderTopicFeedUIContract$TopicFeedPresenter9.f13401q);
                                    String string4 = finderTopicFeedUI9.getString(C0966R.string.esm, objArr4);
                                    FinderTopicFeedLoader finderTopicFeedLoader4 = this.f40795d.f14888r;
                                    if (finderTopicFeedLoader4 != null) {
                                        C7888v2.C7889a.m8052B(aVar4, finderTopicFeedUI6, str2, i4, j2, N4, string4, finderTopicFeedLoader4.f13899i, 9, "", (C64258bf0) null, 512, (Object) null);
                                        return;
                                    }
                                    C87412m.m108603p("feedLoader");
                                    throw null;
                                }
                                C87412m.m108603p("presenter");
                                throw null;
                            } else {
                                C87412m.m108603p("presenter");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("presenter");
                            throw null;
                        }
                    }
                } else {
                    C87412m.m108603p("presenter");
                    throw null;
                }
            }
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }
}
