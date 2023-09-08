package com.tencent.p014mm.plugin.finder.live.comment;

import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import mh1.C10887b;
import mh1.C47029a;
import mh1.C47030e;
import mh1.C47031f;
import mh1.C47032g;
import mh1.C47033h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/comment/BoxCommentConfig$itemConvertFactory$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.comment.BoxCommentConfig$itemConvertFactory$1 */
public final class BoxCommentConfig$itemConvertFactory$1 implements C9500j {
    public C60896i<?> getItemConvert(int i) {
        if (i == 10001) {
            return new C47032g();
        }
        if (i == 20002) {
            return new C47031f();
        }
        if (i != 20032) {
            if (i == 20057) {
                return new C47033h();
            }
            if (i != 20034) {
                return i != 20035 ? new C10887b() : new C47030e();
            }
        }
        return new C47029a();
    }
}
