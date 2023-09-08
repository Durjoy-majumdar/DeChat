package ny3;

import java.util.List;
import java.util.Map;

/* renamed from: ny3.c */
public interface C25234c<R> extends C25233b {
    R call(Object... objArr);

    R callBy(Map<C25239j, ? extends Object> map);

    String getName();

    List<C25239j> getParameters();

    C25245n getReturnType();

    List<C25246o> getTypeParameters();

    C25250r getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
