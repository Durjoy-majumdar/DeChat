package q53;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import l31.C10460a;
import q53.C12041a;
import qo3.C12925w;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C90364q0;
import te3.C51526uc2;
import te3.c35;
import te3.e35;

/* renamed from: q53.i */
public final class C12077i<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C12041a f35161d;

    public C12077i(C12041a aVar) {
        this.f35161d = aVar;
    }

    public void onChanged(Object obj) {
        String str;
        C51526uc2 uc22 = (C51526uc2) obj;
        C12041a aVar = this.f35161d;
        if (uc22 == null) {
            aVar.getClass();
        } else {
            TextView textView = aVar.f35070j;
            if (textView != null) {
                textView.setVisibility(8);
            } else {
                C87412m.m108603p("headerDesc");
                throw null;
            }
        }
        C12041a aVar2 = this.f35161d;
        aVar2.getClass();
        if (uc22 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("mBottomSheet: showing ");
            C12925w wVar = aVar2.f35063c;
            if (wVar != null) {
                sb.append(wVar.mo12466f());
                Log.m105918d("MicroMsg.BuyGoodsBottomDialog", sb.toString());
                C12925w wVar2 = aVar2.f35063c;
                if (wVar2 != null) {
                    if (!wVar2.mo12466f()) {
                        aVar2.f35065e.mo11724d3(1);
                    }
                    aVar2.mo11896f(Boolean.FALSE);
                    LinkedList<e35> linkedList = uc22.f142739d;
                    C87412m.m108593f(linkedList, "response.price_infos");
                    List<T> B0 = C110818d0.m150900B0(linkedList);
                    c35 c35 = uc22.f142743h;
                    if (c35 == null || c35.f131485d != 1) {
                        C12041a.C12042a aVar3 = aVar2.f35068h;
                        if (aVar3 != null) {
                            aVar3.f35077f = false;
                        } else {
                            C87412m.m108603p("mSecondAdapter");
                            throw null;
                        }
                    } else {
                        ArrayList arrayList = (ArrayList) B0;
                        if (c35.f131488g < arrayList.size()) {
                            arrayList.remove(uc22.f142743h.f131488g);
                            C12041a.C12042a aVar4 = aVar2.f35068h;
                            if (aVar4 != null) {
                                aVar4.f35077f = true;
                                aVar4.f35078g = uc22.f142743h.f131487f;
                            } else {
                                C87412m.m108603p("mSecondAdapter");
                                throw null;
                            }
                        } else {
                            C12041a.C12042a aVar5 = aVar2.f35068h;
                            if (aVar5 != null) {
                                aVar5.f35077f = false;
                            } else {
                                C87412m.m108603p("mSecondAdapter");
                                throw null;
                            }
                        }
                    }
                    ArrayList<e35> arrayList2 = new ArrayList<>();
                    ArrayList<e35> arrayList3 = new ArrayList<>();
                    ArrayList arrayList4 = (ArrayList) B0;
                    int size = arrayList4.size();
                    for (int i = 0; i < size; i++) {
                        if (i < 3) {
                            arrayList2.add(arrayList4.get(i));
                        } else {
                            arrayList3.add(arrayList4.get(i));
                        }
                    }
                    C12041a.C12042a aVar6 = aVar2.f35068h;
                    if (aVar6 != null) {
                        if (aVar6.f35077f) {
                            arrayList3.add(new e35());
                        }
                        C12041a.C12042a aVar7 = aVar2.f35067g;
                        if (aVar7 != null) {
                            aVar7.f35075d = arrayList2;
                            aVar7.f35079h = new C12109q(aVar2, arrayList2);
                            C12041a.C12042a aVar8 = aVar2.f35068h;
                            if (aVar8 != null) {
                                aVar8.f35075d = arrayList3;
                                aVar8.f35079h = new C12113r(aVar2, uc22, arrayList3);
                                aVar7.notifyDataSetChanged();
                                C12041a.C12042a aVar9 = aVar2.f35068h;
                                if (aVar9 != null) {
                                    aVar9.notifyDataSetChanged();
                                    if (aVar2.f35062b.f32230i != null) {
                                        View view = aVar2.f35069i;
                                        if (view == null) {
                                            C87412m.m108603p("mCustomView");
                                            throw null;
                                        } else if (view.getParent() == null) {
                                            View view2 = aVar2.f35069i;
                                            if (view2 != null) {
                                                C12119t tVar = new C12119t(view2);
                                                aVar2.f35064d = tVar;
                                                C12925w wVar3 = aVar2.f35063c;
                                                if (wVar3 != null) {
                                                    wVar3.mo12468h(tVar);
                                                } else {
                                                    C87412m.m108603p("mBottomSheet");
                                                    throw null;
                                                }
                                            } else {
                                                C87412m.m108603p("mCustomView");
                                                throw null;
                                            }
                                        }
                                    } else {
                                        View view3 = aVar2.f35069i;
                                        if (view3 != null) {
                                            if (view3.getParent() == null) {
                                                C12925w wVar4 = aVar2.f35063c;
                                                if (wVar4 != null) {
                                                    View view4 = aVar2.f35069i;
                                                    if (view4 != null) {
                                                        wVar4.mo12471k(view4);
                                                    } else {
                                                        C87412m.m108603p("mCustomView");
                                                        throw null;
                                                    }
                                                } else {
                                                    C87412m.m108603p("mBottomSheet");
                                                    throw null;
                                                }
                                            }
                                            C12925w wVar5 = aVar2.f35063c;
                                            if (wVar5 != null) {
                                                wVar5.mo5086o();
                                            } else {
                                                C87412m.m108603p("mBottomSheet");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("mCustomView");
                                            throw null;
                                        }
                                    }
                                    StringBuilder sb4 = new StringBuilder();
                                    int size2 = arrayList4.size();
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        e35 e35 = (e35) arrayList4.get(i2);
                                        Object obj2 = "";
                                        if (e35 == null || (str = e35.f132669d) == null) {
                                            str = obj2;
                                        }
                                        sb4.append(str);
                                        sb4.append("|");
                                        sb4.append(e35 != null ? Integer.valueOf(e35.f132670e) : obj2);
                                        sb4.append("|");
                                        sb4.append(e35 != null ? Integer.valueOf(e35.f132671f) : obj2);
                                        sb4.append("|");
                                        sb4.append(e35 != null ? Integer.valueOf(e35.f132672g) : obj2);
                                        sb4.append("|");
                                        if (e35 != null) {
                                            obj2 = Boolean.valueOf(e35.f132673h);
                                        }
                                        sb4.append(obj2);
                                        sb4.append(";");
                                    }
                                    View view5 = aVar2.f35069i;
                                    if (view5 != null) {
                                        C10460a.m10393b(view5, C90364q0.m113148g(new C13604l("price_info", sb4), new C13604l("diff_wecoin_count", 0)));
                                    } else {
                                        C87412m.m108603p("mCustomView");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("mSecondAdapter");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mSecondAdapter");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mFirstAdapter");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mSecondAdapter");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mBottomSheet");
                    throw null;
                }
            } else {
                C87412m.m108603p("mBottomSheet");
                throw null;
            }
        }
    }
}
