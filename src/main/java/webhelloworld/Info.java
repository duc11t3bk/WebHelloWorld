package webhelloworld;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Info {
	private String key;
	private String value;
}
