package kf1;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.feed.FinderTopicFeedUIContract$TopicFeedPresenter;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.music.FinderQQMusicFollowHeaderView;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import dm1.C7364h;
import dm1.C7365i;
import dm1.C7366j;
import dm1.C7370n;
import dm1.C7371o;
import eb0.C31543z5;
import er1.C58784w3;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.Iterator;
import o40.C61926c;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import sx3.C110818d0;
import te3.C50985qn1;
import te3.C64726td1;
import up1.C27696y;

/* renamed from: kf1.tb */
public final class C9991tb implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C9965rb f30678d;

    /* renamed from: e */
    public final /* synthetic */ View f30679e;

    public C9991tb(C9965rb rbVar, View view) {
        this.f30678d = rbVar;
        this.f30679e = view;
    }

    public final void run() {
        C0740i2 i2Var;
        String str;
        Object obj;
        C9965rb rbVar = this.f30678d;
        boolean z = true;
        String str2 = null;
        if (rbVar.f30628D == 9) {
            C64726td1 td12 = ((FinderTopicFeedUIContract$TopicFeedPresenter) rbVar.mo10348I0()).f13402r;
            if (td12 != null) {
                C9965rb rbVar2 = this.f30678d;
                View view = rbVar2.f30641w;
                C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView");
                FinderQQMusicFollowHeaderView finderQQMusicFollowHeaderView = (FinderQQMusicFollowHeaderView) view;
                int i = ((FinderTopicFeedUIContract$TopicFeedPresenter) rbVar2.mo10348I0()).f13404t;
                Class cls = C11990s0.class;
                Class<C60200t1> cls2 = C60200t1.class;
                finderQQMusicFollowHeaderView.f15504h = null;
                C7370n nVar = finderQQMusicFollowHeaderView.f15505i;
                if (nVar != null) {
                    nVar.f25504e = td12;
                    finderQQMusicFollowHeaderView.f15502f = C61926c.m72691p(C31543z5.m39453c());
                    ImageView imageView = finderQQMusicFollowHeaderView.f15500d;
                    if (imageView != null) {
                        imageView.setImageResource(C0966R.C0969drawable.c2b);
                        String str3 = td12.f185535e;
                        if (!Util.isNullOrNil(str3)) {
                            C39818r rVar = C39818r.f106831a;
                            ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11984n0(str3, C27696y.THUMB_IMAGE), imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.MSG_THUMB));
                        }
                    }
                    TextView textView = (TextView) finderQQMusicFollowHeaderView.findViewById(C0966R.C0970id.ecm);
                    if (textView != null) {
                        textView.setText(td12.f185536f);
                    }
                    TextView textView2 = (TextView) finderQQMusicFollowHeaderView.findViewById(C0966R.C0970id.ecp);
                    if (textView2 != null) {
                        textView2.setText(td12.f185538h);
                    }
                    TextView textView3 = (TextView) finderQQMusicFollowHeaderView.findViewById(C0966R.C0970id.ecg);
                    if (textView3 != null) {
                        textView3.setText(C58784w3.f168295a.mo83867F(td12.f185543p));
                    }
                    WeImageView weImageView = (WeImageView) finderQQMusicFollowHeaderView.findViewById(C0966R.C0970id.eco);
                    finderQQMusicFollowHeaderView.f15501e = weImageView;
                    if (finderQQMusicFollowHeaderView.f15505i != null) {
                        if ((i & 1) != 1) {
                            z = false;
                        }
                        if (z) {
                            if (weImageView != null) {
                                weImageView.setOnClickListener(new C7364h(finderQQMusicFollowHeaderView, (FinderObject) null));
                            }
                            View view2 = finderQQMusicFollowHeaderView.f15503g;
                            if (view2 != null) {
                                view2.setOnClickListener(new C7365i(finderQQMusicFollowHeaderView, (FinderObject) null));
                                return;
                            }
                            return;
                        }
                        finderQQMusicFollowHeaderView.mo3536c((FinderObject) null, td12);
                        WeImageView weImageView2 = finderQQMusicFollowHeaderView.f15501e;
                        if (weImageView2 != null) {
                            weImageView2.setOnClickListener(new C7366j(finderQQMusicFollowHeaderView, (FinderObject) null, td12));
                            return;
                        }
                        return;
                    }
                    C87412m.m108603p("topicFollowHelper");
                    throw null;
                }
                C87412m.m108603p("topicFollowHelper");
                throw null;
            }
            return;
        }
        C50985qn1 qn12 = ((FinderTopicFeedUIContract$TopicFeedPresenter) rbVar.mo10348I0()).f13403s;
        String str4 = "";
        if (qn12 != null) {
            C9965rb rbVar3 = this.f30678d;
            View view3 = this.f30679e;
            if (qn12.f140408e == null) {
                Iterator it = rbVar3.mo10348I0().f30175e.getDataList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    C0740i2 i2Var2 = (C0740i2) obj;
                    C87412m.m108592e(i2Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                    if (C87412m.m108589b(C61926c.m72691p(((BaseFinderFeed) i2Var2).mo3513o().getFeedObject().f164794id), qn12.f140410g)) {
                        break;
                    }
                }
                i2Var = (C0740i2) obj;
            } else {
                i2Var = (C0740i2) C110818d0.m150917O(rbVar3.mo10348I0().f30175e.getDataList(), 0);
            }
            FinderItem o = i2Var == null ? null : ((BaseFinderFeed) i2Var).mo3513o();
            View view4 = rbVar3.f30641w;
            C87412m.m108592e(view4, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.music.IFinderFollowTopicHeaderView");
            ((C7371o) view4).mo8539a(o, qn12, ((FinderTopicFeedUIContract$TopicFeedPresenter) rbVar3.mo10348I0()).f13399o, ((FinderTopicFeedUIContract$TopicFeedPresenter) rbVar3.mo10348I0()).f13404t);
            C64726td1 td13 = qn12.f140408e;
            if (td13 != null) {
                if (td13 != null) {
                    str2 = td13.f185536f;
                }
                str = String.valueOf(str2);
            } else if (qn12.f140407d != null) {
                Context context = view3.getContext();
                Object[] objArr = new Object[1];
                FinderContact finderContact = qn12.f140407d;
                if (finderContact != null) {
                    str2 = finderContact.nickname;
                }
                objArr[0] = str2;
                str = context.getString(C0966R.string.d_x, objArr);
                C87412m.m108593f(str, "context.getString(R.stri…gmInfo.contact?.nickname)");
            } else if (o != null) {
                str = view3.getContext().getString(C0966R.string.d_x, new Object[]{o.getFinderObject().nickname});
                C87412m.m108593f(str, "context.getString(R.stri…tFinderObject().nickname)");
            }
            str4 = str;
        }
        ((TextView) this.f30678d.mo10466d1().findViewById(C0966R.C0970id.e8g)).setText(str4);
    }
}
