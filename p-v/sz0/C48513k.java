package sz0;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.widget.CardTagTextView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import te3.C49871in;
import te3.C50655oa3;
import te3.C50739ov2;
import te3.C50805pa3;
import wz0.C22945n;

/* renamed from: sz0.k */
public final class C48513k extends RecyclerView.C16613e<C48517t> {

    /* renamed from: d */
    public ArrayList<C48514l> f129748d;

    /* renamed from: e */
    public ArrayList<C48514l> f129749e;

    /* renamed from: f */
    public ArrayList<C48514l> f129750f;

    /* renamed from: g */
    public C48514l f129751g;

    /* renamed from: h */
    public C48514l f129752h;

    /* renamed from: i */
    public C48514l f129753i;

    /* renamed from: j */
    public boolean f129754j;

    public C48513k(boolean z) {
        this.f129754j = z;
    }

    /* renamed from: F4 */
    public final C48514l mo73143F4(int i) {
        Object[] objArr = new Object[4];
        int i2 = 0;
        objArr[0] = Integer.valueOf(i);
        ArrayList<C48514l> arrayList = this.f129750f;
        objArr[1] = arrayList != null ? Integer.valueOf(arrayList.size()) : null;
        ArrayList<C48514l> arrayList2 = this.f129748d;
        objArr[2] = arrayList2 != null ? Integer.valueOf(arrayList2.size()) : null;
        ArrayList<C48514l> arrayList3 = this.f129749e;
        objArr[3] = arrayList3 != null ? Integer.valueOf(arrayList3.size()) : null;
        Log.m105919d("MicroMsg.CardTicketAdapter", "pos: %s, jSize: %s, tSize: %s, lSize: %s", objArr);
        C48514l lVar = this.f129751g;
        if (lVar == null) {
            i2 = -1;
        } else if (i == 0) {
            return lVar;
        }
        ArrayList<C48514l> arrayList4 = this.f129750f;
        if (arrayList4 != null) {
            if (i > i2 && i <= arrayList4.size() + i2) {
                return arrayList4.get((i - i2) - 1);
            }
            i2 += arrayList4.size();
        }
        ArrayList<C48514l> arrayList5 = this.f129748d;
        if (arrayList5 != null) {
            if (i > i2 && i <= arrayList5.size() + i2) {
                return arrayList5.get((i - i2) - 1);
            }
            i2 += arrayList5.size();
        }
        C48514l lVar2 = this.f129752h;
        if (lVar2 != null && i == (i2 = i2 + 1)) {
            return lVar2;
        }
        ArrayList<C48514l> arrayList6 = this.f129749e;
        if (arrayList6 != null) {
            if (i > i2 && i <= arrayList6.size() + i2) {
                return arrayList6.get((i - i2) - 1);
            }
            i2 += arrayList6.size();
        }
        C48514l lVar3 = this.f129753i;
        if (lVar3 == null || i != i2 + 1) {
            return null;
        }
        return lVar3;
    }

    /* renamed from: G4 */
    public final int mo73144G4(String str, int i) {
        C87412m.m108594g(str, "cardId");
        if (i == 1) {
            ArrayList<C48514l> arrayList = this.f129750f;
            int size = arrayList != null ? arrayList.size() + 0 : 0;
            ArrayList<C48514l> arrayList2 = this.f129748d;
            if (arrayList2 == null) {
                return 0;
            }
            Iterator<C48514l> it = arrayList2.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = i2 + 1;
                C50655oa3 oa32 = it.next().f129758d;
                if (C87412m.m108589b(oa32 != null ? oa32.f139060d : null, str)) {
                    return i2 + size;
                }
                i2 = i3;
            }
            return 0;
        }
        ArrayList<C48514l> arrayList3 = this.f129749e;
        if (arrayList3 == null) {
            return 0;
        }
        Iterator<C48514l> it4 = arrayList3.iterator();
        int i4 = 0;
        while (it4.hasNext()) {
            int i5 = i4 + 1;
            C50655oa3 oa33 = it4.next().f129758d;
            if (C87412m.m108589b(oa33 != null ? oa33.f139060d : null, str)) {
                return i4;
            }
            i4 = i5;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        if (r13.isEmpty() != false) goto L_0x006a;
     */
    /* renamed from: O4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo73145O4(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = "cardId"
            gy3.C87412m.m108594g(r13, r0)
            sz0.l r0 = r12.f129751g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            java.util.ArrayList<sz0.l> r3 = r12.f129750f
            if (r3 == 0) goto L_0x0017
            int r3 = r3.size()
            int r0 = r0 + r3
        L_0x0017:
            java.util.ArrayList<sz0.l> r3 = r12.f129748d
            java.lang.String r4 = "MicroMsg.CardTicketAdapter"
            r5 = 2
            r6 = 0
            if (r3 == 0) goto L_0x0077
            java.util.Iterator r7 = r3.iterator()
            r8 = 0
        L_0x0024:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0072
            int r9 = r8 + 1
            java.lang.Object r10 = r7.next()
            sz0.l r10 = (sz0.C48514l) r10
            te3.oa3 r11 = r10.f129758d
            if (r11 == 0) goto L_0x0039
            java.lang.String r11 = r11.f139060d
            goto L_0x003a
        L_0x0039:
            r11 = r6
        L_0x003a:
            boolean r11 = z04.C112551y.m153810j(r11, r13, r2, r5, r6)
            if (r11 == 0) goto L_0x0070
            r3.remove(r10)
            java.lang.Object[] r13 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r13[r2] = r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13[r1] = r0
            java.lang.String r0 = "remove ticket: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r13)
            boolean r13 = r3.isEmpty()
            if (r13 == 0) goto L_0x006c
            java.util.ArrayList<sz0.l> r13 = r12.f129750f
            if (r13 == 0) goto L_0x006a
            gy3.C87412m.m108591d(r13)
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x006c
        L_0x006a:
            r12.f129751g = r6
        L_0x006c:
            r12.notifyDataSetChanged()
            return
        L_0x0070:
            r8 = r9
            goto L_0x0024
        L_0x0072:
            int r3 = r3.size()
            int r0 = r0 + r3
        L_0x0077:
            sz0.l r3 = r12.f129752h
            if (r3 == 0) goto L_0x007d
            int r0 = r0 + 1
        L_0x007d:
            java.util.ArrayList<sz0.l> r3 = r12.f129749e
            if (r3 == 0) goto L_0x00cb
            java.util.Iterator r7 = r3.iterator()
            r8 = 0
        L_0x0086:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00cb
            int r9 = r8 + 1
            java.lang.Object r10 = r7.next()
            sz0.l r10 = (sz0.C48514l) r10
            te3.oa3 r11 = r10.f129758d
            if (r11 == 0) goto L_0x009b
            java.lang.String r11 = r11.f139060d
            goto L_0x009c
        L_0x009b:
            r11 = r6
        L_0x009c:
            boolean r11 = z04.C112551y.m153810j(r11, r13, r2, r5, r6)
            if (r11 == 0) goto L_0x00c9
            r3.remove(r10)
            java.lang.Object[] r13 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r13[r2] = r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13[r1] = r0
            java.lang.String r0 = "remove license: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r13)
            boolean r13 = r3.isEmpty()
            if (r13 == 0) goto L_0x00c5
            sz0.l r13 = r12.f129753i
            if (r13 != 0) goto L_0x00c5
            r12.f129752h = r6
        L_0x00c5:
            r12.notifyDataSetChanged()
            return
        L_0x00c9:
            r8 = r9
            goto L_0x0086
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sz0.C48513k.mo73145O4(java.lang.String):void");
    }

    /* renamed from: g5 */
    public final void mo73146g5(String str) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (Util.isNullOrNil(str)) {
            this.f129752h = null;
            return;
        }
        if (this.f129752h == null) {
            C48514l lVar = new C48514l();
            this.f129752h = lVar;
            lVar.f129755a = 0;
        }
        C48514l lVar2 = this.f129752h;
        C87412m.m108591d(lVar2);
        lVar2.f129756b = str;
    }

    public int getItemCount() {
        int i = this.f129751g != null ? 1 : 0;
        ArrayList<C48514l> arrayList = this.f129750f;
        if (arrayList != null) {
            i += arrayList.size();
        }
        ArrayList<C48514l> arrayList2 = this.f129748d;
        if (arrayList2 != null) {
            i += arrayList2.size();
        }
        if (this.f129752h != null) {
            i++;
        }
        ArrayList<C48514l> arrayList3 = this.f129749e;
        if (arrayList3 != null) {
            i += arrayList3.size();
        }
        return this.f129753i != null ? i + 1 : i;
    }

    public long getItemId(int i) {
        C48514l F4 = mo73143F4(i);
        if (F4 != null) {
            String str = F4.f129756b;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            C50655oa3 oa32 = F4.f129758d;
            String str3 = null;
            String str4 = oa32 != null ? oa32.f139060d : null;
            if (str4 == null) {
                str4 = str2;
            }
            C50805pa3 pa32 = F4.f129757c;
            String str5 = pa32 != null ? pa32.f139671d : null;
            if (str5 == null) {
                str5 = str2;
            }
            C50739ov2 ov22 = F4.f129759e;
            if (ov22 != null) {
                str3 = ov22.f139389d;
            }
            if (str3 != null) {
                str2 = str3;
            }
            String str6 = str + str4 + str5 + str2;
            if (str6 == null || str6.length() == 0) {
                return (long) F4.hashCode();
            }
            return (long) (str6 + i + F4.f129755a).hashCode();
        }
        Log.m105920e("MicroMsg.CardTicketAdapter", "[getItemId] position=" + i + " itemCount=" + getItemCount() + " }");
        return 0;
    }

    public int getItemViewType(int i) {
        C48514l F4 = mo73143F4(i);
        if (F4 != null) {
            return F4.f129755a;
        }
        return -1;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C50739ov2 ov22;
        C48517t tVar = (C48517t) zVar;
        C87412m.m108594g(tVar, "holder");
        boolean z = true;
        Log.m105919d("MicroMsg.CardTicketAdapter", "bind view %s", Integer.valueOf(i));
        C48514l F4 = mo73143F4(i);
        if (F4 != null) {
            int i2 = F4.f129755a;
            if (i2 == 0) {
                tVar.mo73150C().setText(F4.f129756b);
            } else if (i2 == 1) {
                C50805pa3 pa32 = F4.f129757c;
                if (pa32 != null) {
                    if (!Util.isNullOrNil(pa32.f139672e)) {
                        tVar.mo73149B().mo100288c(pa32.f139672e, 0, 0, C0966R.raw.card_default_merchant_icon);
                    } else {
                        tVar.mo73149B().setImageResource(C0966R.raw.card_default_merchant_icon);
                    }
                    tVar.mo73150C().setText(pa32.f139671d);
                    tVar.mo73152z().setText(pa32.f139673f);
                }
            } else if (i2 == 2) {
                C50655oa3 oa32 = F4.f129758d;
                if (oa32 != null) {
                    Object tag = tVar.mo73151y().getTag();
                    String str = oa32.f139060d;
                    if (!(tag instanceof String) || TextUtils.isEmpty((CharSequence) tag) || !tag.equals(str)) {
                        tVar.mo73151y().setTag(str);
                        tVar.mo73149B().setRoundCorner(true);
                        if (!Util.isNullOrNil(oa32.f139063g)) {
                            tVar.mo73149B().mo100288c(oa32.f139063g, 0, 0, C0966R.raw.card_default_merchant_icon);
                        } else {
                            tVar.mo73149B().setImageResource(C0966R.raw.card_default_merchant_icon);
                        }
                        tVar.mo73150C().setText(oa32.f139061e);
                        tVar.mo73152z().setText(oa32.f139062f);
                        int i3 = oa32.f139064h;
                        if (i3 == 1 || i3 == 3 || i3 == 4) {
                            tVar.mo73151y().setVisibility(4);
                            ImageView imageView = tVar.f129770G;
                            if (imageView != null) {
                                imageView.setVisibility(4);
                                View view = tVar.f44854d;
                                view.setBackground(view.getContext().getResources().getDrawable(C0966R.C0969drawable.f4699kd));
                                tVar.mo73150C().setTextColor(Color.parseColor("#555555"));
                                tVar.mo73150C().setShadowLayer(0.0f, 0.0f, 0.0f, C76577a.m92153d(tVar.f44854d.getContext(), C0966R.color.ahf));
                                tVar.mo73152z().setTextColor(Color.parseColor("#555555"));
                                tVar.mo73152z().setShadowLayer(0.0f, 0.0f, 0.0f, C76577a.m92153d(tVar.f44854d.getContext(), C0966R.color.ahf));
                            } else {
                                C87412m.m108603p("shadowIv");
                                throw null;
                            }
                        } else {
                            tVar.mo73150C().setTextColor(-1);
                            tVar.mo73152z().setTextColor(C76577a.m92153d(tVar.mo73151y().getContext(), C0966R.color.BW_100_Alpha_0_8));
                            LinkedList<C49871in> linkedList = oa32.f139065i;
                            C87412m.m108593f(linkedList, "ticket_label");
                            LinearLayout linearLayout = tVar.f129769F;
                            if (linearLayout != null) {
                                linearLayout.removeAllViews();
                                if (linkedList.isEmpty()) {
                                    linearLayout.setVisibility(4);
                                } else {
                                    linearLayout.setVisibility(0);
                                    for (C49871in next : linkedList) {
                                        if (!Util.isNullOrNil(next.f135509d)) {
                                            LinearLayout linearLayout2 = tVar.f129769F;
                                            if (linearLayout2 != null) {
                                                CardTagTextView cardTagTextView = new CardTagTextView(linearLayout2.getContext());
                                                Context context = linearLayout.getContext();
                                                cardTagTextView.setMinHeight(C76577a.m92151b(context, 18));
                                                int b = C76577a.m92151b(context, 8);
                                                int b2 = C76577a.m92151b(context, 4);
                                                cardTagTextView.setPadding(b, b2, b, b2);
                                                cardTagTextView.setText(next.f135509d);
                                                cardTagTextView.setTextSize(1, 10.0f);
                                                if (!Util.isNullOrNil(next.f135510e)) {
                                                    cardTagTextView.setTextColor(Color.parseColor(next.f135510e));
                                                } else {
                                                    cardTagTextView.setTextColor(-1);
                                                }
                                                if (!Util.isNullOrNil(next.f135511f)) {
                                                    cardTagTextView.setFillColor(C22945n.m27002b(next.f135511f, next.f135514i));
                                                } else {
                                                    cardTagTextView.setFillColor(C22945n.m27001a(-16777216, 26));
                                                }
                                                linearLayout.addView(cardTagTextView);
                                            } else {
                                                C87412m.m108603p("rightLabelLayout");
                                                throw null;
                                            }
                                        }
                                    }
                                }
                                C48516s sVar = new C48516s(tVar, oa32);
                                if (tVar.f129771z <= 0 || tVar.f129764A <= 0) {
                                    tVar.f129771z = tVar.f44854d.getHeight();
                                    int width = tVar.f44854d.getWidth();
                                    tVar.f129764A = width;
                                    if (tVar.f129771z <= 0 || width <= 0) {
                                        tVar.f44854d.post(new C48515r(tVar, sVar));
                                    }
                                }
                                sVar.invoke();
                            } else {
                                C87412m.m108603p("rightLabelLayout");
                                throw null;
                            }
                        }
                    }
                }
            } else if (i2 == 3 && (ov22 = F4.f129759e) != null) {
                tVar.mo73150C().setText(ov22.f139389d);
                String str2 = ov22.f139391f;
                if (!(str2 == null || str2.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    tVar.mo73152z().setText(ov22.f139391f);
                    tVar.mo73152z().setVisibility(0);
                } else {
                    tVar.mo73152z().setVisibility(8);
                }
            }
            if (this.f129754j) {
                View view2 = tVar.f44854d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.6f));
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/v2/CardTicketAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/card/ui/v2/CardTicketVH;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/card/ui/v2/CardTicketAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/card/ui/v2/CardTicketVH;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : C0966R.C0971layout.f6746ne : C0966R.C0971layout.f6787oi : C0966R.C0971layout.f6747nf : C0966R.C0971layout.f6788oj, viewGroup, false);
        if (this.f129754j) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.6f));
            View view = inflate;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/v2/CardTicketAdapter", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/tencent/mm/plugin/card/ui/v2/CardTicketVH;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            inflate.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/card/ui/v2/CardTicketAdapter", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/tencent/mm/plugin/card/ui/v2/CardTicketVH;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        C87412m.m108593f(inflate, "itemView");
        return new C48517t(inflate, i);
    }

    /* renamed from: u5 */
    public final void mo73147u5(String str) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (Util.isNullOrNil(str)) {
            this.f129751g = null;
            return;
        }
        if (this.f129751g == null) {
            C48514l lVar = new C48514l();
            this.f129751g = lVar;
            lVar.f129755a = 0;
        }
        C48514l lVar2 = this.f129751g;
        C87412m.m108591d(lVar2);
        lVar2.f129756b = str;
    }
}
