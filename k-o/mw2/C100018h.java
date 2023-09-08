package mw2;

import android.content.Intent;
import com.tencent.p014mm.plugin.story.p108ui.StoryBrowseUI;
import com.tencent.p014mm.plugin.story.p108ui.album.StoryAlbumUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import jw2.C99069d;
import kw2.C99266g;
import kw2.C99268i;
import rx3.C13598b0;

/* renamed from: mw2.h */
public final class C100018h extends C87413o implements C32226l<C99266g, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ StoryAlbumUI f293035d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100018h(StoryAlbumUI storyAlbumUI) {
        super(1);
        this.f293035d = storyAlbumUI;
    }

    public Object invoke(Object obj) {
        C99266g gVar = (C99266g) obj;
        C87412m.m108594g(gVar, "storyHistoryInfo");
        C100007a aVar = this.f293035d.f281796g;
        if (aVar != null) {
            ArrayList arrayList = new ArrayList();
            int size = aVar.f293009h.size();
            for (int i = 0; i < size; i++) {
                for (C99266g next : aVar.f293009h.get(i).f293027b) {
                    arrayList.add(next.field_date);
                    Log.m105918d("MicroMsg.StoryAlbumAdapter", "getItemDateList add: " + next.field_date);
                }
            }
            C100007a aVar2 = this.f293035d.f281796g;
            if (aVar2 != null) {
                C99268i iVar = gVar.f291069p;
                C87412m.m108594g(iVar, "storyInfo");
                Log.m105918d("MicroMsg.StoryAlbumAdapter", "storyLocalId=" + ((int) iVar.systemRowid));
                int size2 = aVar2.f293009h.size();
                int i2 = 0;
                int i3 = 0;
                loop2:
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    for (C99266g gVar2 : aVar2.f293009h.get(i2).f293027b) {
                        if (((int) gVar2.f291069p.systemRowid) == ((int) iVar.systemRowid)) {
                            Log.m105919d("MicroMsg.StoryAlbumAdapter", "findPositionInGallery index=%s", Integer.valueOf(i3));
                            break loop2;
                        }
                        i3++;
                    }
                    i2++;
                }
                int i4 = StoryAlbumUI.f281792j;
                Log.m105924i("MicroMsg.StoryAlbumUI", "onClickItem position=" + i3 + ", localId=" + ((int) gVar.f291069p.systemRowid) + ", storyId=" + gVar.f291069p.field_storyID + ", date=" + gVar.field_date + ", count=" + gVar.field_count);
                StoryAlbumUI storyAlbumUI = this.f293035d;
                storyAlbumUI.getClass();
                Intent intent = new Intent(storyAlbumUI.getActivity(), StoryBrowseUI.class);
                intent.putExtra("username", storyAlbumUI.f281798i);
                intent.putExtra("user_date_list", arrayList);
                intent.putExtra("v_position", i3);
                storyAlbumUI.startActivityForResult(intent, 1);
                C99069d.f290421d.f266265e = 2;
                return C13598b0.f38549a;
            }
            C87412m.m108603p("mStoryAlbumAdapter");
            throw null;
        }
        C87412m.m108603p("mStoryAlbumAdapter");
        throw null;
    }
}
