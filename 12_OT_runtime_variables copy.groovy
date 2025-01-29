map = messageheader.tunnelVars

result = 'LETS GO\n'

result += '_____________ Iterating all tunnelvars  _________\n'

map.each { result += "$it.key: $it.value\n" }

result += 'DONE\n'

return result.toString()