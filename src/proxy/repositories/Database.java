package proxy.repositories;

import java.util.HashMap;
import java.util.Map;

import proxy.entities.Sticker;

public class Database {

    private static Long stickerId = 0L;

    private static final Map<Long, Sticker> STICKERS = new HashMap<>();

    static {

	Sticker html = new Sticker();
	stickerId++;
	html.setId(stickerId);
	html.setName("HTML 5");
	html.setPrice(9.99);
	STICKERS.put(stickerId, html);

	Sticker spring = new Sticker();
	stickerId++;
	spring.setId(stickerId);
	spring.setName("Spring");
	spring.setPrice(5.15);
	STICKERS.put(stickerId, spring);

	Sticker vuejs = new Sticker();
	stickerId++;
	vuejs.setId(stickerId);
	vuejs.setName("Vue Js 3");
	vuejs.setPrice(2.99);
	STICKERS.put(stickerId, vuejs);

    }

    public static Sticker findPersonById(Long id) {
	return STICKERS.get(id);
    }

}
