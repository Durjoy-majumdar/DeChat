package gm3;

import com.tencent.xweb.file.XVFSFile;
import java.util.concurrent.TimeUnit;
import p210o.C11323a;

public final /* synthetic */ class b$$d implements C11323a {
    public final Object apply(Object obj) {
        Long l = (Long) obj;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long days = timeUnit.toDays(l.longValue());
        Long valueOf = Long.valueOf(l.longValue() - TimeUnit.DAYS.toMillis(days));
        long hours = timeUnit.toHours(valueOf.longValue());
        Long valueOf2 = Long.valueOf(valueOf.longValue() - TimeUnit.HOURS.toMillis(hours));
        long minutes = timeUnit.toMinutes(valueOf2.longValue());
        long seconds = timeUnit.toSeconds(Long.valueOf(valueOf2.longValue() - TimeUnit.MINUTES.toMillis(minutes)).longValue());
        return days + "-" + hours + XVFSFile.PATH_SEPARATOR + minutes + XVFSFile.PATH_SEPARATOR + seconds;
    }
}
