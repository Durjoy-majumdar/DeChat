package p534gl;

import com.tencent.p014mm.autogen.mmdata.rpt.SuggestEmoiconPreloadStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30777t2;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import i61.C98602h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import jp3.C9486a;
import jp3.C9487b;
import p490dl.C31197b;
import p490dl.C97489o;
import p733vy.C37873b;
import pe3.C89349b;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C64197v;
import te3.C101868xo3;
import te3.C50437mq2;
import te3.C50572no3;
import te3.C52147yo3;
import u61.C101964h;
import z51.C39315g;

/* renamed from: gl.i */
public final class C32476i {

    /* renamed from: a */
    public final C9487b<C9486a> f86282a;

    /* renamed from: b */
    public String f86283b;

    /* renamed from: c */
    public String f86284c;

    /* renamed from: d */
    public boolean f86285d;

    public C32476i(C9487b<C9486a> bVar) {
        this.f86282a = bVar;
    }

    /* renamed from: a */
    public void mo58651a(String str, C32481n nVar) {
        boolean z;
        int i;
        String str2 = str;
        C32481n nVar2 = nVar;
        Class cls = C32735h.class;
        C87412m.m108594g(str2, "desc");
        boolean z2 = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_emoji_suggest_remote_enable, false) && C30777t2.f82756d.xx0();
        boolean e = ((C37873b) C86312j.m106911c(C37873b.class)).mo61224e();
        Log.m105924i("MicroMsg.EmojiSuggestMatchWord", "searchSuggest: remoteEnable " + z2);
        C32477j jVar = C32477j.f86286a;
        long j = C32477j.f86288c;
        int i2 = C32477j.f86287b;
        LinkedList<String> linkedList = C32477j.f86289d;
        synchronized (linkedList) {
        }
        C32483p pVar = new C32483p(j, i2, linkedList.size(), (String) null, 8, (C8480h) null);
        if (!e && z2) {
            C32472e jo = C30790w2.m39221h().f82785q.mo61534jo(str2);
            Boolean bool = null;
            if (jo != null) {
                Log.m105924i("MicroMsg.EmojiSuggestMatchWord", "searchSuggest: has cache " + jo.field_updateTime);
                C115669n.INSTANCE.mo175913w(1418, (long) 32, 1);
                C52147yo3 yo32 = new C52147yo3();
                byte[] bArr = jo.field_content;
                if (bArr != null) {
                    try {
                        yo32.parseFrom(bArr);
                    } catch (Exception e2) {
                        Log.printDebugStack("safeParser", "", e2);
                    }
                }
                String str3 = yo32.f145439e;
                if (str3 == null) {
                    str3 = "";
                }
                pVar.f86299d = str3;
                if (nVar2 != null) {
                    LinkedList<C50572no3> linkedList2 = yo32.f145438d;
                    C87412m.m108593f(linkedList2, "rsp.Emoji");
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
                    int i3 = 0;
                    for (T next : linkedList2) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            C50572no3 no32 = (C50572no3) next;
                            EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(no32.f138703d.f298586d);
                            if (TO == null) {
                                TO = new EmojiInfo();
                                C101964h.m134219a(no32.f138703d, TO);
                                TO.field_catalog = 65;
                            }
                            ArrayList<EmojiGroupInfo> d = C97489o.m125592g().mo136763d();
                            C87412m.m108593f(d, "getInstance().emojiGroupInfoList");
                            if (!d.isEmpty()) {
                                Iterator<T> it = d.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (C87412m.m108589b(((EmojiGroupInfo) it.next()).field_productID, TO.field_groupId)) {
                                            z = true;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            z = false;
                            if (no32.f138707h == 1) {
                                if (z) {
                                    i = 0;
                                    arrayList.add(new C32482o(TO, i, i4));
                                    i3 = i4;
                                } else {
                                    Log.m105924i("MicroMsg.EmojiSuggestMatchWord", "searchSuggest: delete local emoji " + TO.getMd5());
                                }
                            }
                            i = 1;
                            arrayList.add(new C32482o(TO, i, i4));
                            i3 = i4;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    nVar2.mo57547a(arrayList, pVar);
                }
            } else {
                Log.m105924i("MicroMsg.EmojiSuggestMatchWord", "searchSuggest: no cache");
                if (nVar2 != null) {
                    nVar2.mo57547a(C64186f0.f181907d, pVar);
                }
            }
            C32472e jo4 = C30790w2.m39221h().f82785q.mo61534jo(str2);
            StringBuilder sb = new StringBuilder();
            sb.append("checkUpdate: ");
            sb.append(str2);
            sb.append(", ");
            sb.append(jo4 != null ? Integer.valueOf(jo4.field_updateTime) : null);
            sb.append(" needUpdate:");
            if (jo4 != null) {
                bool = Boolean.valueOf(jo4.mo58649l2());
            }
            sb.append(bool);
            Log.m105924i("MicroMsg.EmojiSuggestMatchWord", sb.toString());
            if (jo4 == null || jo4.mo58649l2()) {
                C50437mq2 mq22 = new C50437mq2();
                if (this.f86285d) {
                    ArrayList<String> w = ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138038w(str2);
                    int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_emoji_suggest_remote_shuffle_size, 20);
                    Log.m105924i("MicroMsg.EmojiSuggestMatchWord", "checkUpdate: shuffle " + Qe + ", local " + w.size());
                    int min = Math.min(Qe, w.size());
                    for (int i5 = 0; i5 < min; i5++) {
                        mq22.f138157d.add(w.get(i5));
                    }
                }
                C101868xo3 xo32 = new C101868xo3();
                xo32.f299893d = str2;
                xo32.f299894e = this.f86283b;
                xo32.f299895f = this.f86284c;
                xo32.f299898i = 4;
                xo32.f299899j = new C89349b(mq22.toByteArray());
                SuggestEmoiconPreloadStruct suggestEmoiconPreloadStruct = new SuggestEmoiconPreloadStruct();
                suggestEmoiconPreloadStruct.f79163d = suggestEmoiconPreloadStruct.mo86045b("SessionId", this.f86284c, true);
                suggestEmoiconPreloadStruct.f79164e = Util.nowMilliSecond();
                C115669n.INSTANCE.mo175913w(1418, (long) 40, 1);
                new C31197b(xo32).mo9225i().mo123420E(new C32475h(this, suggestEmoiconPreloadStruct, str2));
            }
        } else if (nVar2 != null) {
            nVar2.mo57547a(C64186f0.f181907d, pVar);
        }
    }
}
