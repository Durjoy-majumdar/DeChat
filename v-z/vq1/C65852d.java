package vq1;

import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.autogen.events.OnFinderFeedInfoUpdatedEvent;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C7446m0;
import hp3.C87581a;
import java.util.LinkedHashMap;
import java.util.Map;
import l31.C61212e;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49710hi2;
import te3.C50842pk0;
import u60.C65234n;
import vq1.C65869y;

/* renamed from: vq1.d */
public final class C65852d<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C52983e f189369a;

    /* renamed from: b */
    public final /* synthetic */ C65869y.C65870a f189370b;

    public C65852d(C52983e eVar, C65869y.C65870a aVar) {
        this.f189369a = eVar;
        this.f189370b = aVar;
    }

    public Object call(Object obj) {
        String str;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C65234n nVar = C65234n.Fail;
        Log.m105924i("Finder.FavActionTask", "FavActionTask callback " + cVar.f256793a + ' ' + cVar.f256794b + ' ' + cVar.f256795c);
        int i = cVar.f256793a;
        boolean z = true;
        if (i == 0 && cVar.f256794b == 0) {
            int favCount = this.f189369a.f147880c.getFavCount();
            int favFlag = this.f189369a.f147880c.getFavFlag();
            C52983e eVar = this.f189369a;
            if (eVar.f147883f) {
                FinderItem finderItem = eVar.f147880c;
                finderItem.setFavCount(finderItem.getFavCount() + (this.f189369a.f147880c.getFavFlag() == 1 ? 0 : 1));
            } else {
                FinderItem finderItem2 = eVar.f147880c;
                finderItem2.setFavCount(finderItem2.getFavCount() + (this.f189369a.f147880c.getFavFlag() == 1 ? -1 : 0));
            }
            C52983e eVar2 = this.f189369a;
            eVar2.f147880c.setFavFlag(eVar2.f147883f ? 1 : 0);
            Log.m105924i("Finder.FavAction", "CgiFinderFavFeed end favFlag:" + this.f189369a.f147880c.getFavFlag() + " favCount " + this.f189369a.f147880c.getFavCount() + ' ' + favFlag + ' ' + favCount);
            C65854g.f189373e.mo89894d(this.f189369a);
            this.f189370b.mo14006a(C65234n.OK, false);
            FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
            FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
            C52983e eVar3 = this.f189369a;
            aVar.f9174a = eVar3.f147881d;
            aVar.f9176c = eVar3.f147883f ? 1 : 2;
            aVar.f9177d = 1;
            C49710hi2 hi22 = ((C50842pk0) cVar.f256796d).f139804d;
            aVar.f9185l = hi22 != null ? hi22.f134665d : 0;
            if (hi22 == null || (str = hi22.f134666e) == null) {
                str = "";
            }
            aVar.f9186m = str;
            aVar.f9175b = 5;
            feedUpdateEvent.publish();
            OnFinderFeedInfoUpdatedEvent onFinderFeedInfoUpdatedEvent = new OnFinderFeedInfoUpdatedEvent();
            onFinderFeedInfoUpdatedEvent.f107671d.f107672a = C61926c.m72691p(this.f189369a.f147881d);
            onFinderFeedInfoUpdatedEvent.f107671d.f107676e = this.f189369a.f147880c.getFavCount();
            OnFinderFeedInfoUpdatedEvent.C40148a aVar2 = onFinderFeedInfoUpdatedEvent.f107671d;
            if (this.f189369a.f147880c.getFavFlag() != 1) {
                z = false;
            }
            aVar2.f107675d = z;
            OnFinderFeedInfoUpdatedEvent.C40148a aVar3 = onFinderFeedInfoUpdatedEvent.f107671d;
            C65866w wVar = C65866w.f189407h;
            aVar3.f107674c = wVar.mo89909h(this.f189369a.f147880c.getFeedObject());
            onFinderFeedInfoUpdatedEvent.f107671d.f107673b = ((Boolean) wVar.mo89908g(this.f189369a.f147880c.getFeedObject()).f38555d).booleanValue();
            onFinderFeedInfoUpdatedEvent.publish();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, Object> a = FinderFeedFullConvert.f12553K.mo2338a(this.f189369a.f147880c);
            if (a != null) {
                linkedHashMap.putAll(a);
            }
            Map<String, Object> a2 = C7446m0.f25635a.mo8592a(this.f189369a.f147885h);
            if (a2 != null) {
                linkedHashMap.putAll(a2);
            }
            linkedHashMap.put("is_action_fav", Integer.valueOf(this.f189369a.f147883f ? 1 : 0));
            linkedHashMap.put("is_long_video", 0);
            linkedHashMap.put("old_fav_count", Integer.valueOf(favCount));
            linkedHashMap.put("cur_fav_count", Integer.valueOf(this.f189369a.f147880c.getFavCount()));
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("feed_fav_real_click", (Object) null, linkedHashMap, 24617);
        } else if (i == 4) {
            C65854g.f189373e.mo89894d(this.f189369a);
            FeedUpdateEvent feedUpdateEvent2 = new FeedUpdateEvent();
            feedUpdateEvent2.f9173d.f9174a = this.f189369a.f147881d;
            feedUpdateEvent2.publish();
            this.f189370b.mo14006a(nVar, false);
        } else {
            this.f189370b.mo14006a(nVar, true);
        }
        return C13598b0.f38549a;
    }
}
