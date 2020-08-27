const inzell = require('/home/florian/code/Inzell/build/js/packages/Inzell-jsLegacy/kotlin/Inzell-jsLegacy.js')

const l = [inzell.column(function(x){ return x / 3.33})]

const sheet = inzell.spreadsheet(l)

console.log(inzell.print(sheet))